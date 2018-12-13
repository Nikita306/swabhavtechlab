package com.techlab.staticblock;

public class StaticBlock {
	static String name=" ";
	
	static{
		name="nikita";
		System.out.println("My name is "+name);
	}
	
	public StaticBlock() {
		System.out.println("Inside Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StaticBlock obj1= new StaticBlock();
		 StaticBlock obj2= new StaticBlock();
		 StaticBlock obj3= new StaticBlock();

	}
	static{
		System.out.println("Inside 2nd Static");
	}
	static{
		System.out.println("Inside 3rd static");
	}

}
