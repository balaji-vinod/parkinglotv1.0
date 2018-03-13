package com.app.parkinglot.registration;

import java.util.Map;

public class FloorModel {
	
	/**
	 * 
	 */
	private int floorNumber;
	
	/**
	 * 
	 */
	private int numberOfBlocks;
	
	
	private Map<Integer,BlockModel> blockMap;

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
	 * @return the numberOfBlocks
	 */
	public int getNumberOfBlocks() {
		return numberOfBlocks;
	}

	/**
	 * @param numberOfBlocks the numberOfBlocks to set
	 */
	public void setNumberOfBlocks(int numberOfBlocks) {
		this.numberOfBlocks = numberOfBlocks;
	}

	/**
	 * @return the blockMap
	 */
	public Map<Integer, BlockModel> getBlockMap() {
		return blockMap;
	}

	/**
	 * @param blockMap the blockMap to set
	 */
	public void setBlockMap(Map<Integer, BlockModel> blockMap) {
		this.blockMap = blockMap;
	}

	

}
