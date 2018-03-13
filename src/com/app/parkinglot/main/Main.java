/**
 * 
 */
package com.app.parkinglot.main;

import java.util.Scanner;

import com.app.parkinglot.common.ParkingLotFactoryPattern;

/**
 * @author vinod
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		System.out.println("welcome to parking lot system");
		ParkingLotFactoryPattern parkingLotFactoryPattern =new ParkingLotFactoryPattern();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			scanner.reset();
			System.out.println("Please enter 1. for floor registration \n"
					+ "Please enter 2. Car slot allocation \n"
					+ "Please enter 3. Car slot deallocation \n"
					+ "Please enter 4. Report generation");	
			
			String getNumber=scanner.next();
			
			parkingLotFactoryPattern.getActionObject(Integer.parseInt(getNumber)).display(scanner);
			
		}
		
		//scanner.close();
	}

}
