package com.techlab.set.integer;

public class Student {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollno;
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
		if (rollno != other.rollno)
			return false;
		return true;
	}
	private int rollno;
	private String name;
	
	
	public Student(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	public int getRollno(){
		return rollno;
		
	}
	public void setRollno(int rollno){
		this.rollno=rollno;
	}
	public String getName(){
		return name;
		
	}
	public void setName(String name){
		this.name=name;
	}
	


}
