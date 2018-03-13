package com.app.parkinglot.common;

import java.util.Date;

public class CarModel {
	
	
	/**
	 * 
	 */
	private String CarNumber;
	
	/**
	 * 
	 */
	private int allocatedCarSlotNumber;
	
	/**
	 * 
	 */
	private int floorNumber;
	
	/**
	 * 
	 */
	private boolean isReserved;
	
	
	/**
	 * 
	 */
	private int blockNumber;
	
	private int fare;
	
	/**
	 * 
	 */
	private Date entryTime;
	
	/**
	 * 
	 */
	private Date leavingTime;

	/**
	 * @return the carNumber
	 */
	public String getCarNumber() {
		return CarNumber;
	}

	/**
	 * @param carNumber the carNumber to set
	 */
	public void setCarNumber(String carNumber) {
		CarNumber = carNumber;
	}

	/**
	 * @return the allocatedCarSlotNumber
	 */
	public int getAllocatedCarSlotNumber() {
		return allocatedCarSlotNumber;
	}

	/**
	 * @param allocatedCarSlotNumber the allocatedCarSlotNumber to set
	 */
	public void setAllocatedCarSlotNumber(int allocatedCarSlotNumber) {
		this.allocatedCarSlotNumber = allocatedCarSlotNumber;
	}

	/**
	 * @return the floorNumber
	 */
	public int getFloorNumber() {
		return floorNumber;
	}

	/**
	 * @param floorNumber the floorNumber to set
	 */
	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}


	/**
	 * @return the entryTime
	 */
	public Date getEntryTime() {
		return entryTime;
	}

	/**
	 * @param entryTime the entryTime to set
	 */
	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}

	/**
	 * @return the leavingTime
	 */
	public Date getLeavingTime() {
		return leavingTime;
	}

	/**
	 * @param leavingTime the leavingTime to set
	 */
	public void setLeavingTime(Date leavingTime) {
		this.leavingTime = leavingTime;
	}

	/**
	 * @return the blockNumber
	 */
	public int getBlockNumber() {
		return blockNumber;
	}

	/**
	 * @param blockNumber the blockNumber to set
	 */
	public void setBlockNumber(int blockNumber) {
		this.blockNumber = blockNumber;
	}

	/**
	 * @return the fare
	 */
	public int getFare() {
		return fare;
	}

	/**
	 * @param fare the fare to set
	 */
	public void setFare(int fare) {
		this.fare = fare;
	}

	/**
	 * @return the isReserved
	 */
	public boolean isReserved() {
		return isReserved;
	}

	/**
	 * @param isReserved the isReserved to set
	 */
	public void setReserved(boolean isReserved) {
		this.isReserved = isReserved;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CarModel [CarNumber=" + CarNumber + ", allocatedCarSlotNumber=" + allocatedCarSlotNumber
				+ ", floorNumber=" + floorNumber + ", isReserved=" + isReserved + ", blockNumber=" + blockNumber
				+ ", fare=" + fare + ", entryTime=" + entryTime + ", leavingTime=" + leavingTime + "]";
	}
	
	
	

}
