package com.techlab.strategy;

public class HighDiscountStrategy implements IDiscountStrategy {

	@Override
	public int finalBillAmount(int billAmount) {
		return (int) (billAmount-(billAmount*0.5));
	}

}
