package com.techlab.guitar;

public class Guitar {
	private String serialNumber, model, type,topWood,backWood,builder;
	private double price;
	private GuitarSpec spec;

	public Guitar(String serialNumber, double price, String builder,
			String model, String type, String backWood, String topWood) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	public Guitar(String serilNumber,double price,GuitarSpec spec){
		this.serialNumber=serialNumber;
		this.price=price;
		this.spec=spec;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public String getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public String getType() {
		return type;
	}

	public String getBackWood() {
		return backWood;
	}

	public String getTopWood() {
		return topWood;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public GuitarSpec getspec(){
		return spec;
		
	}
}
