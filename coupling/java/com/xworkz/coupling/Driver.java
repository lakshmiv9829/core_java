package com.xworkz.coupling;

public class Driver {
	private String name;
	private Vehicle vehicle=new TruckVehicle();
	
	public Driver(String name,Vehicle vechile) {
		this.name=name;
		this.vehicle=vehicle;
	}
	public void driver() {
		System.out.println("driving by"+this.name);
		this.vehicle.move();
	}

}
