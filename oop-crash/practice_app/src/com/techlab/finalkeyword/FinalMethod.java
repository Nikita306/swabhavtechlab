package com.techlab.finalkeyword;

public class FinalMethod {
		public static void main(String[] args) {
			  Base b = new Base(); 
		        b.show(); 
		    } 
		} 
		
		 class Base { 
		//  public  void show() {
			final void show(){
			  System.out.println("nikita");
		  } 
		} 
		   
		class Derived extends Base { 
		   // public void show() {  cannot override  the final class
		    	//System.out.println("trupti");
		   // }  
		} 