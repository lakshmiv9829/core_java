package com.xworkz.coupling;

public class DriverTester {

	public static void main(String[] args) {
		Vehicle vehicle=new TruckVehicle();
		Vehicle vehicle1=new ScootyVehicle();
		
		Driver driver=new Driver("veeresh",vehicle);
		driver.driver();
	}

}
