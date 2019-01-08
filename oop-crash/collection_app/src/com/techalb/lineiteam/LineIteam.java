package com.techalb.lineiteam;

public class LineIteam {
	private int id;
	private String name;
	private double price;
	private int quantity;

	public LineIteam(int id, String name, double price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public int getId() {
		return id;

	}

	public String getName() {
		return name;

	}

	public double getPrice() {
		return price;

	}

	public int getQuantity() {
		return quantity;

	}
	
	public double calculateTotalCost(){
		return this.price*this.quantity;
	}
		

}
