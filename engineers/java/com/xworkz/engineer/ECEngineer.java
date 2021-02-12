package com.xworkz.engineer;

import com.xworkz.engineer.Constants.Branch;

public class ECEngineer extends Engineer {
	public Branch branch = Branch.EC;

	public void problemSolving() {
		super.problemSolving();
		System.out.println("problemed solved by " + branch);

	}

}