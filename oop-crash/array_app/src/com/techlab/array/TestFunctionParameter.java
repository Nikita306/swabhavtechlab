package com.techlab.array;

public class TestFunctionParameter {
	public static void main(String[] args) {
		int mark=100;
		int marksarray[]=new int[]{100,200,300};
		update(mark);
		System.out.println(mark);
		update(marksarray);
		for(int m:marksarray){
			System.out.println(m);
			System.out.println(marksarray.hashCode());
		}
				
	}
	public static void update(int mark){
		mark=0;
		}
	
	public static void update(int mark[]){
		
	for (int i=0;i<mark.length;i++){
		mark[i]=0;
		System.out.println(mark.hashCode());
		
	}
	}
}
