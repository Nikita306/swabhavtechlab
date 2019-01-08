package com.techlab.test;

import com.techlab.institute.Professor;

public class TestProfessor {
	public static void main(String[] args) {
		Professor pro=new Professor(101,"seawoods","1-01-1996");
		System.out.println("Professor Details");
		System.out.println("ID="+pro.getid()+" \n"+"Address="+pro.getAddress()+"\n"+"DOB="+pro.getDob());
		System.out.println("Annul Salary="+pro.salariedEployee(100));
	}

}
