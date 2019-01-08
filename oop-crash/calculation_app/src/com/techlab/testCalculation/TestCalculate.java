package com.techlab.testCalculation;

import com.techlab.calculation.Calculate;
import com.techlab.calculation.NegativeNotSupportException;

public class TestCalculate {
	public static void main(String[] args)  {
		Calculate cal = new Calculate();
		try {
			System.out.println(cal.add(-5,-3));
		} catch (NegativeNotSupportException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
