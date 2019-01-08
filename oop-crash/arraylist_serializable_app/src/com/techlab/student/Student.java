package com.techlab.student;

import java.io.Serializable;

public class Student implements Serializable {
	private int rollno;
	private String name;
	
	public Student(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	public int getRollno(){
		return rollno;
	}
	public String getName(){
		return name;
		
	}

}
