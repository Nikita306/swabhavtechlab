package com.techlab.adpter.design.pattern;

public class TestSwabhav {

	public static void main(String[] args) {
		SwabhavQAdapter<Integer> list = new SwabhavQAdapter<Integer>();
		list.enquee(10);
		list.enquee(20);
		list.enquee(30);
		System.out.println(list.dequee());
		//list.dequee();
		
		//for(int n:list){
			//System.out.println(n);
		//}
		
		
	}

}
