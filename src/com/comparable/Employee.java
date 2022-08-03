package com.comparable;

public class Employee implements Comparable<Employee>{

	private int eId;
	private String eName;

	public Employee(int eId, String eName) {
		this.eId = eId;
		this.eName = eName;
	}

	public int geteId() {
		return eId;
	}

	public String geteName() {
		return eName;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.eId-o.eId;
	}

}
