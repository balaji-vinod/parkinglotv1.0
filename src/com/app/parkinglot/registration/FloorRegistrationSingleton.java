/**
 * 
 */
package com.app.parkinglot.registration;

import java.util.Map;

/**
 * @author vinod
 *
 */
public class FloorRegistrationSingleton {

	/**
	 * 
	 */
	private static FloorRegistrationSingleton floorRegistrationModel = null;
	
	/**
	 * 
	 */
	private Map<Integer,FloorModel> floorMap;

	/**
	 * 
	 */
	private FloorRegistrationSingleton() {

	}

	/**
	 * @return
	 */
	public static FloorRegistrationSingleton getFloorRegistrationInstance() {

		if (floorRegistrationModel == null) {

			floorRegistrationModel = new FloorRegistrationSingleton();
		}

		return floorRegistrationModel;
	}

	/**
	 * @return the floorRegistrationModel
	 */
	public static FloorRegistrationSingleton getFloorRegistrationModel() {
		return floorRegistrationModel;
	}

	/**
	 * @param floorRegistrationModel the floorRegistrationModel to set
	 */
	public static void setFloorRegistrationModel(FloorRegistrationSingleton floorRegistrationModel) {
		FloorRegistrationSingleton.floorRegistrationModel = floorRegistrationModel;
	}

	/**
	 * @return the floorMap
	 */
	public Map<Integer, FloorModel> getFloorMap() {
		return floorMap;
	}

	/**
	 * @param floorMap the floorMap to set
	 */
	public void setFloorMap(Map<Integer, FloorModel> floorMap) {
		this.floorMap = floorMap;
	}

	

}
