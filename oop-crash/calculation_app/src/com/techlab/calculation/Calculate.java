package com.techlab.calculation;

public class Calculate {
	public int add(int a,int b) throws NegativeNotSupportException{
		if(a>0 && b>0){
			int c=a+b;
			return c;
		}else{
			throw new NegativeNotSupportException(a,b);
		}
		
			
		}
}
