package com.xworkz.engineer;

import com.xworkz.engineer.Constants.Branch;

public class TCEngineer extends Engineer {
	public Branch branch = Branch.TC;

	public void problemSolving() {
		super.problemSolving();
		System.out.println("problem solved by TC");
		System.out.println(this.branch);

	}

}
