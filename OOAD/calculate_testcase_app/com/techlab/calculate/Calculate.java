package com.techlab.calculate;

public class Calculate {
	public int addPositiveNo(int num1, int num2) {
		int sum = 0;
		 if(num1<0 && num2<0){
		 throw new NegativeNotSupportException("negative no not support");
		 
		 }else if(num1<0 && num2>0){
		 throw new NegativeNotSupportException("negative number not support");
		 
		 }else if(num1>0 && num2<0){
		 throw new NegativeNotSupportException("Negative number not support");
		 }else
		sum = num1 + num2;
		return sum;
	}

}
