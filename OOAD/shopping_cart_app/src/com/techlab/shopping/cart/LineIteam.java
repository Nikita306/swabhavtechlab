package com.techlab.shopping.cart;

public class LineIteam {
	private Product product;
	private int quantity;

	public LineIteam(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;

	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double calculateTotalLineIteamCost() {
		return this.product.calculateTotalPriceAfterDiscount() * this.quantity;
	}

	@Override
	public String toString() {
		return String.format("ID=" + product.getId() + " " + "Name="
				+ product.getName() + " " + "Price=" + product.getPrice() + " "
				+ " Discount=" + product.getDiscount() + " "
				+ "After Discount price will be="
				+ product.calculateTotalPriceAfterDiscount() + " "+" Quantity="
				+ +this.getQuantity() + " " + "Total LineIteamCost "
				+ this.calculateTotalLineIteamCost())
				+ " ";
	}

}
