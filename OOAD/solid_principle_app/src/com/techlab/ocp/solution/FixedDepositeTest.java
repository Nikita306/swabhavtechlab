package com.techlab.ocp.solution;

public class FixedDepositeTest {
	public static void main(String[] args) {
		NormalRate normal = new NormalRate();
		FixedDeposite deposite = new FixedDeposite(1000, 2,
				FestivalRate.class.cast(normal));
		normal.getRate();
		System.out.print(deposite);
		System.out.println("  SimpleInterest for Normal:"
				+ deposite.calculateSimpleInterest());

		NewYearRate newyear = new NewYearRate();
		FixedDeposite deposite1 = new FixedDeposite(1000, 1,
				FestivalRate.class.cast(newyear));
		newyear.getRate();
		System.out.print(deposite1);
		System.out.println("  SimpleInterest for NewYear:"
				+ deposite1.calculateSimpleInterest());

		HoliRate holi = new HoliRate();
		FixedDeposite deposite2 = new FixedDeposite(1000, 2,
				FestivalRate.class.cast(holi));
		holi.getRate();
		System.out.print(deposite2);
		System.out.println("  SimpleInterest for Holi:"
				+ deposite2.calculateSimpleInterest());

	}
}
