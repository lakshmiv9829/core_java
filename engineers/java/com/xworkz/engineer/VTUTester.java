package com.xworkz.engineer;

public class VTUTester {

	public static void main(String[] args) {
		Engineer engineer = new Engineer();
		System.out.println(engineer.getBranch());
		engineer.problemSolving();

		Engineer engineer2 = new CSEngineer();
		engineer2.problemSolving();
		System.out.println(engineer2.getBranch());

		Engineer engineer3 = new ISEngineer();
		engineer3.problemSolving();

		System.out.println(engineer3.getBranch());

		Engineer engineer4 = new ECEngineer();
		engineer4.problemSolving();
		System.out.println(engineer4.getBranch());
		
		Engineer engineer5 = new ECEngineer();
		engineer5.problemSolving();
		System.out.println(engineer5.getBranch());

	}

}