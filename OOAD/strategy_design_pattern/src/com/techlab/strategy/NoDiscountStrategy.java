package com.techlab.strategy;

public class NoDiscountStrategy implements IDiscountStrategy {

	@Override
	public int finalBillAmount(int billAmount) {
		return billAmount;
	}

}
