package com.techlab.adpter.design.pattern;

import java.util.LinkedList;

public class SwabhavQAdapter<Integer> implements IQuee {
	LinkedList<Integer> nosQ=new LinkedList<Integer>();
	int count=0;
	
	 public SwabhavQAdapter() {
	
	}

	public void count(){
		count++;
	}
	@Override
	public void enquee(java.lang.Integer element) {
		nosQ.addLast((Integer) element);
	}

	@Override
	public java.lang.Integer dequee() {
		return (java.lang.Integer) nosQ.removeFirst();
	}


	
		
}
