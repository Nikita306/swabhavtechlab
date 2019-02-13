package com.techlab.ocp.solution;

public class FixedDeposite {
	private double principle;
	private int year;
	private FestivalRate rate;

	public FixedDeposite(double principle, int year,FestivalRate rate) {
		this.principle = principle;
		this.year = year;
		this.rate = rate;
	}

	public double getPrinciple() {
		return principle;
	}

	public int getYear() {
		return year;
	}

	public FestivalRate rate() {
		return rate;
	}
	public double calculateSimpleInterest(){
		return (this.principle*this.year*rate.getRate())/100;
		
	}
	@Override
	public String toString() {
		return String.format("Principle:"+this.getPrinciple()+" "+" Year="+this.year+" "+" 3RateOfIntrest="+rate.getRate());
	}

	
}
