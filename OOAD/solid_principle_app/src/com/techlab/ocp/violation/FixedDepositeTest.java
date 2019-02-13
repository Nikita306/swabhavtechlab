package com.techlab.ocp.violation;

public class FixedDepositeTest {

	public static void main(String[] args) {
		FixedDeposite deposite=new FixedDeposite(1000, 2, FestivalType.HOLI);
		System.out.println("Principle="+deposite.getPrinciple()+" "+"No of years="+deposite.getYear());
		System.out.println(deposite.calculateSimpleInterest());
	}

}
