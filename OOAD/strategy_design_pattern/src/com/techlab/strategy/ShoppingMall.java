package com.techlab.strategy;

public class ShoppingMall {
	private String customername;
	private int billAmount;
	private IDiscountStrategy Istratergy;

	public ShoppingMall(IDiscountStrategy Istratergy) {
		this.Istratergy = Istratergy;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public int getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	
	public int getFinalBill(){
		return Istratergy.finalBillAmount(this.billAmount);
		
	}

}
