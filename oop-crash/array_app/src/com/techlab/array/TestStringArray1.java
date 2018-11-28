package com.techlab.array;

public class TestStringArray1 {
	public static void main(String args[]){
		String[] name={"nikita","trupti","supriya"};
		for(String names:name){
			System.out.println(names);
		}
		
		for(String names:name){
			if(names.contains("S") || names.equalsIgnoreCase("supriya")){
				System.out.println(names);
				
			}
			else{
				System.out.println("search not found");
			}
				
			
			
		}
		
		
	}
}
