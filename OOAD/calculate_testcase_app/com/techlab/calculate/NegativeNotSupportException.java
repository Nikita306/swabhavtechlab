package com.techlab.calculate;

public final class NegativeNotSupportException extends RuntimeException {
	private int num1, num2;

	public NegativeNotSupportException(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public NegativeNotSupportException(String string) {
		
	}

	@Override
	public String getMessage() {
		if(num1<0 ||num2<0){
			return String.format("Both numbers are negative");
		}
		else if (num1 < 0 || num2>0) {
			return String.format("First number is negative ");
		}else if(num1>0 || num2<0){
		return String.format("Second number is negative ");
		}
		return null;
	}
}
