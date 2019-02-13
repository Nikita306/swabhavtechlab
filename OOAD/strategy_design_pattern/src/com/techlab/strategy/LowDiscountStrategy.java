package com.techlab.strategy;

public class LowDiscountStrategy implements IDiscountStrategy {

	@Override
	public int finalBillAmount(int billAmount) {
		return (int) (billAmount-(billAmount*0.1));
	}

}
