package com.techlab.hashmap;

public class Student {
	private int standard;
	private int rollNo;
	private String fname, lname;

	public Student(int std, int rollNo, String fname, String lname) {
		this.standard = std;
		this.rollNo = rollNo;
		this.fname = fname;
		this.lname = lname;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollNo;
		result = prime * result + standard;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (rollNo != other.rollNo)
			return false;
		if (standard != other.standard)
			return false;
		return true;
	}

	public int getStd() {
		return standard;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("standard="+standard+" "+"rollNo="+rollNo+" "+"FirstName="+fname+" "+"Lastname="+lname);
	}

}
