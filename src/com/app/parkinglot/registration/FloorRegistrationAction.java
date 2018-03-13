package com.app.parkinglot.registration;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import com.app.parkinglot.common.IDisplay;

public class FloorRegistrationAction implements IDisplay {

	@Override
	public void display(Scanner scanner) {

		FloorRegistrationSingleton floorRegistrationSingleton = FloorRegistrationSingleton
				.getFloorRegistrationInstance();

		System.out.println("Please enter number of floors \n");
		try {

			int numberOfFloors = scanner.nextInt();
			Map<Integer, FloorModel> floorMap = new LinkedHashMap<>();
			for (int i = 1; i <= numberOfFloors; i++) {
				System.out.println("Please enter number of blocks to be allocated to floor: " + i + "\n");
				int numberOfBlocks = scanner.nextInt();
				FloorModel fm = new FloorModel();
				fm.setFloorNumber(i);
				fm.setNumberOfBlocks(numberOfBlocks);
				Map<Integer, BlockModel> blockMap = new HashMap<>();
				for (int j = 1; j <= numberOfBlocks; j++) {
					BlockModel bm = new BlockModel();
					bm.setBlockNumber(j);
					Map<Integer, SlotModel> slotMap = new HashMap<>();
					for (int k = 1; k <= 2; k++) {
						SlotModel sm = new SlotModel();
						sm.setSlotNumber(k);
						sm.setSlotFilled(false);
						slotMap.put(k, sm);

					}
					bm.setSlotMap(slotMap);

					blockMap.put(j, bm);

				}

				fm.setBlockMap(blockMap);
				floorMap.put(numberOfBlocks, fm);
			}

			floorRegistrationSingleton.setFloorMap(floorMap);

			System.out.println("Floor Registartion details are successfully added`");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
