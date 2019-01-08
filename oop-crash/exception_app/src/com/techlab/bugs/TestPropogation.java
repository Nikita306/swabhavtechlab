package com.techlab.bugs;

public class TestPropogation {
	public static void main(String[] args)  {
		try{
			f1();
		}catch(Exception e){
			e.printStackTrace();
		
		}
		System.out.println("End Main");
	}
	
	public static void f1() throws Exception{
		f2();
	}
	public static void f2() throws Exception{
		f3();
	}
	public static void f3() throws Exception{
		throw new Exception("Error is in f3");
	}


}
