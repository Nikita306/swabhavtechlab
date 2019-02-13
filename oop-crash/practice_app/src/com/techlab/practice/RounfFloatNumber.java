package com.techlab.practice;

public class RounfFloatNumber {

	public static void main(String[] args) {
		floatno((float) 4.6);
		

	}
	public static  void floatno(float a){
		 float b;
		// b=a+0;
		 float d=(int)a;
		 System.out.println(d);
		 if(a-d>=0.5){
			 System.out.println(d+1);
		 }else{
		 System.out.println(d);
		 }
	 }

}
