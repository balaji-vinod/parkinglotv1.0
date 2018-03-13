/**
 * 
 */
package com.app.parkinglot.registration;

import com.app.parkinglot.common.CarModel;

/**
 * @author vinod
 *
 */
public class SlotModel {
	
	/**
	 * 
	 */
	private int slotNumber;
	
	/**
	 * 
	 */
	private CarModel carModel;
	/**
	 * 
	 */
	private boolean isSlotReserved;
	
	/**
	 * 
	 */
	private boolean isSlotFilled;
	/**
	 * @return the slotNumber
	 */
	public int getSlotNumber() {
		return slotNumber;
	}
	/**
	 * @param slotNumber the slotNumber to set
	 */
	public void setSlotNumber(int slotNumber) {
		this.slotNumber = slotNumber;
	}
	/**
	 * @return the isSlotReserved
	 */
	public boolean isSlotReserved() {
		return isSlotReserved;
	}
	/**
	 * @param isSlotReserved the isSlotReserved to set
	 */
	public void setSlotReserved(boolean isSlotReserved) {
		this.isSlotReserved = isSlotReserved;
	}
	/**
	 * @return the carModel
	 */
	public CarModel getCarModel() {
		return carModel;
	}
	/**
	 * @param carModel the carModel to set
	 */
	public void setCarModel(CarModel carModel) {
		this.carModel = carModel;
	}
	/**
	 * @return the isSlotFilled
	 */
	public boolean isSlotFilled() {
		return isSlotFilled;
	}
	/**
	 * @param isSlotFilled the isSlotFilled to set
	 */
	public void setSlotFilled(boolean isSlotFilled) {
		this.isSlotFilled = isSlotFilled;
	}
	

}
