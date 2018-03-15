package com.javaex.problem02;

public class Depart extends Employee {

	private String depart;

	public Depart(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getDepart() {
		return depart;
	}

	public void getInformation() {
		super.getInformation();
		System.out.println(" 부서:"+ depart);
	}
}
