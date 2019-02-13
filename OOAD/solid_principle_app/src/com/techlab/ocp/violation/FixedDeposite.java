package com.techlab.ocp.violation;

public class FixedDeposite {
	private double principle;
	private int year;
	private FestivalType festival;

	public FixedDeposite(double principle, int year, FestivalType festival) {
		this.principle = principle;
		this.year = year;
		this.festival = festival;
	}

	public double getPrinciple() {
		return principle;
	}

	public int getYear() {
		return year;
	}

	public FestivalType getFestival() {
		return festival;
 	}

	public double calculateSimpleInterest() {
		float rate = 0;
		if (this.festival == FestivalType.NORMAL) {
			rate = (float) 7.0;
			return (this.principle * this.year * rate)/100;

		} else if (this.festival == FestivalType.NEW_YEAR) {
			rate = (float) 7.5;
			return (this.principle * this.year * rate)/100;


		} else if (this.festival == FestivalType.HOLI)
			rate = (float) 8.0;
		return (this.principle * this.year * rate)/100;

	}

}
