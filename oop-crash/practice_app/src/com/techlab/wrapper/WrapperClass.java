package com.techlab.wrapper;

public class WrapperClass {

	public static void main(String[] args) {
		
		int i=10; //primtive datatype
		Integer integer=new Integer(i);//putting the value inside the object is called boxing

		int j=integer.intValue();
		System.out.println(j); //taking the value or fetching the value from object is called unboxing
		
		Integer value=i;              //autoboxing
		 int k=value;                 //autounboxing
		 System.out.println(k);
	}

}
