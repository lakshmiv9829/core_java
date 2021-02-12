package com.xworkz.engineer;

import com.xworkz.engineer.Constants.Branch;

public class CSEngineer extends Engineer {
	public Branch branch = Branch.CS;

	public void problemSolving() {
		System.out.println("problemed solved by " + branch);
	}

	public void coding() {
		System.out.println("invokred coding CS ");

	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

}
