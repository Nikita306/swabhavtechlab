package com.techlab.strategy;

public class TestClass {
	public static void main(String[] args) {
		ShoppingMall shopping = new ShoppingMall(new LowDiscountStrategy());
		shopping.setCustomername("Nikita");
		shopping.setBillAmount(1000);
		System.out.println("CustomerName:" + shopping.getCustomername() + "  "
				+ "BillAmount:" + shopping.getBillAmount()+"  "+"TotalBill:"
				+ shopping.getFinalBill());
		
		ShoppingMall shopping1 = new ShoppingMall(new HighDiscountStrategy());
		shopping1.setCustomername("Trupti");
		shopping1.setBillAmount(1000);
		System.out.println("CustomerName:" + shopping1.getCustomername() + "  "
				+ "BillAmount:" + shopping1.getBillAmount()+"  "+"TotalBill:"
				+ shopping1.getFinalBill());
		
		ShoppingMall shopping2 = new ShoppingMall(new NoDiscountStrategy());
		shopping2.setCustomername("Pallavi");
		shopping2.setBillAmount(1000);
		System.out.println("CustomerName:" + shopping2.getCustomername() + "  "
				+ "BillAmount:" + shopping2.getBillAmount()+"  "+"TotalBill:"
				+ shopping2.getFinalBill());
	}

}
