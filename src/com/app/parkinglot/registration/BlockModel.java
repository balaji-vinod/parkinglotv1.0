package com.app.parkinglot.registration;

import java.util.Map;

public class BlockModel {
	
	
	private int floorNumber;
	
	private int blockNumber;
	
	private boolean isBlockFilled;
	
	
	private Map<Integer,SlotModel> slotMap;

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
	 * @return the isBlockFilled
	 */
	public boolean isBlockFilled() {
		return isBlockFilled;
	}

	/**
	 * @param isBlockFilled the isBlockFilled to set
	 */
	public void setBlockFilled(boolean isBlockFilled) {
		this.isBlockFilled = isBlockFilled;
	}

	/**
	 * @return the slotMap
	 */
	public Map<Integer, SlotModel> getSlotMap() {
		return slotMap;
	}

	/**
	 * @param slotMap the slotMap to set
	 */
	public void setSlotMap(Map<Integer, SlotModel> slotMap) {
		this.slotMap = slotMap;
	}

}
