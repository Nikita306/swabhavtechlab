package com.techlab.srp.solution;

public class Invoice {
	private int id;
	private String name;
	private double cost;
	private double discount;
	private float gst;

	public Invoice(int id, String name, double cost, double discount, float gst) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discount = discount;
		this.gst = gst;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public double getDiscount() {
		return discount;
	}

	public float getGst() {
		return gst;
	}

	public double calculateDiscount() {
		return this.cost / 100 * this.discount;
	}

	public double calculateGst() {
		return this.cost / 100 * this.gst;
	}

	public double calculateTotalCost() {
		return this.cost - this.calculateDiscount() + this.calculateGst();
	}
}
