package com.xworkz.engineer;

import com.xworkz.engineer.Constants.Branch;

public class Engineer {
	private String usn;
	private Branch branch = Branch.MECH;

	/*
	 * Creating method problemSolving()
	 */
	public void problemSolving() {

		System.out.println("problem solved by" + branch);
	}

	public String getUsn() {
		return usn;
	}

	public void setUsn(String usn) {
		this.usn = usn;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public final void buncking() {
		System.out.println("Mech Engineer bunking");
	}

}
