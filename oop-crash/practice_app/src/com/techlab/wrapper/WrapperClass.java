package com.techlab.wrapper;

public class WrapperClass {

	public static void main(String[] args) {
		
		Integer x=13;
		Integer y=12;
		int i=10; //primtive datatype
		Integer integer=new Integer(i);//putting the value inside the object is called boxing

		int j=integer.intValue();
		System.out.println(j); //taking the value or fetching the value from object is called unboxing
		
		Integer value=i;              //autoboxing
		 int k=value;                 //autounboxing
		 System.out.println(k);
		// x.reverse(12);
		 System.out.println(x.reverse(12));
		System.out.println(x.compareTo(y));
		//show(100);
		Integer intege=new Integer(100);
		show(integer);
		 
	}
	public static void show(Integer no){
		System.out.println(no);
	}

}
