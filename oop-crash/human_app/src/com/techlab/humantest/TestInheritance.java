package com.techlab.humantest;

import com.techlab.human.Human;

public class TestInheritance {
	public static void main(String[] args) {
		Human nikita=new Human("nikita",22);
		Human trupti=new Human("trupti",22);
		Human nikita2=new Human("nikita",22);
		
	System.out.println(nikita.toString());
	System.out.println(nikita.hashCode());
	System.out.println(nikita2.hashCode());
	System.out.println(nikita.equals(trupti));
	System.out.println(nikita.equals(nikita2));
	System.out.println(nikita==nikita2);
	}
	
	
	

}
