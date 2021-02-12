package com.xworkz.engineer;

import com.xworkz.engineer.Constants.Branch;

public class ISEngineer extends Engineer {
	public Branch branch = Branch.IS;

	public void problemSolving() {
		System.out.println("problem solved by" + branch);
	}

	public void developingSofter() {
		System.out.println("develope softwares");

	}
}
