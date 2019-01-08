package com.techlab.bugs;

public class TestCubeEven {
	public static int cubeEven(int number){
		int cube=0;
		if(number%2==0){
			cube=number*number*number;
			return cube;
		}
		else{
			throw new RuntimeException("number should be even ");
		}
		
		
	}
	public static void main(String[] args) {
		try{
		System.out.println(cubeEven(3));
		}catch(RuntimeException ex){
			System.out.println(ex.getMessage());
		}
		
	}

}
