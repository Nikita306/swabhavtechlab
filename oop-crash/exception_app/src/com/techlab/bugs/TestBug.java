package com.techlab.bugs;

public class TestBug {

	public static void main(String[] args) {
		int c=0;
		try{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
	       c=a/b;
		}catch(ArithmeticException e){
			System.out.println("devided number should not be zero");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("number shoulbe as per the index");
		}
		catch(NumberFormatException e){
			System.out.println("number should be integer");
		}
	
		System.out.println(c);
		System.out.println("thank you");
		//main(args);

	}

}
