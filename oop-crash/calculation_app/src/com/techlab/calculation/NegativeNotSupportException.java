package com.techlab.calculation;

public class NegativeNotSupportException extends RuntimeException {
	private int a;
	private int b;
	private int negative;

	public NegativeNotSupportException(int a, int b) {
		this.a = a;
		this.b = b;

	}

	@Override
	public String getMessage() {

		if (a < 0 || b < 0) {

			return String.format("Addition is not possible beacuse given no "
					+ this.a + " and " + this.b + " is negative number ");
		} else if (a < 0) {
			return String.format("Addition is not possible beacuse given no "
					+ this.a + " is negative number ");
		} else if (b < 0) {

		}
		return String.format("Addition is not possible beacuse given no "
				+ this.b + " is negative number ");
	}

}
