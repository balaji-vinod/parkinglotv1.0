/**
 * 
 */
package com.app.parkinglot.allocation;

import java.util.Date;
import java.util.Scanner;

import com.app.parkinglot.common.CarModel;
import com.app.parkinglot.common.IDisplay;
import com.app.parkinglot.registration.BlockModel;
import com.app.parkinglot.registration.FloorModel;
import com.app.parkinglot.registration.FloorRegistrationSingleton;
import com.app.parkinglot.registration.SlotModel;

/**
 * @author vinod
 *
 */
public class CarAllocationAction implements IDisplay {

	@Override
	public void display(Scanner scanner) {
		FloorRegistrationSingleton floorRegistrationSingleton = FloorRegistrationSingleton
				.getFloorRegistrationInstance();

		System.out.println("Please enter entry floor");

		int floorNumber = scanner.nextInt();

		System.out.println("Please enter car number");

		String carNumber = scanner.next();

		System.out.println("If reservated Please enter Y else N");
		String reserved = scanner.next();

		System.out.println("please enter fare amount");
		int amount = scanner.nextInt();
		CarModel carModel = new CarModel();

		FloorModel flooderModel = floorRegistrationSingleton.getFloorMap().get(floorNumber);
		int slotNumber = 0, blockNumber = 0;

		blockloop: for (BlockModel blockModel : flooderModel.getBlockMap().values()) {

			if (blockModel.isBlockFilled())
				continue;
			else {
				for (SlotModel slotModel : blockModel.getSlotMap().values()) {

					if (slotModel.isSlotFilled())
						continue;
					else {
						slotNumber = slotModel.getSlotNumber();
						blockNumber = blockModel.getBlockNumber();
						flooderModel.getBlockMap().get(blockNumber).getSlotMap().get(slotNumber).setSlotFilled(true);
						break blockloop;
					}
				}
			}

		}
		if (slotNumber != 0 && blockNumber != 0) {
			carModel.setCarNumber(carNumber);
			carModel.setFloorNumber(floorNumber);
			carModel.setAllocatedCarSlotNumber(slotNumber);
			carModel.setEntryTime(new Date());
			carModel.setBlockNumber(blockNumber);
			carModel.setFare(amount);
			carModel.setReserved(reserved.equalsIgnoreCase("Y") ? true : false);
			flooderModel.getBlockMap().get(blockNumber).getSlotMap().get(slotNumber).setCarModel(carModel);
			System.out.println(carModel.toString());
		}


	}

}
