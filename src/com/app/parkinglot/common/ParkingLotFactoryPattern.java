/**
 * 
 */
package com.app.parkinglot.common;

import com.app.parkinglot.Reporting.ReportingAction;
import com.app.parkinglot.allocation.CarAllocationAction;
import com.app.parkinglot.deallocation.CarDeAllocationAction;
import com.app.parkinglot.registration.FloorRegistrationAction;

/**
 * @author vinod
 *
 */
public class ParkingLotFactoryPattern {

	public IDisplay getActionObject(int module) {
		IDisplay actionInstance = null;
		switch (module) {

		case 1:
			actionInstance = new FloorRegistrationAction();
			break;
		case 2:
			actionInstance = new CarAllocationAction();
			break;
		case 3:
			actionInstance = new CarDeAllocationAction();
			break;
		case 4:
			actionInstance = new ReportingAction();
			break;
		default:

			return null;

		}
		return actionInstance;

	}

}
