package com.techlab.lineiteam.collection.test;

import java.util.ArrayList;

import com.techalb.lineiteam.LineIteam;

public class LineIteamTest {
	public static void main(String[] args) {
		ArrayList cart1 = new ArrayList();
		cart1.add(new LineIteam(101, "book", 100, 2));
		cart1.add(new LineIteam(102, "pen", 10, 2));
		cart1.add(new LineIteam(103, "pencile", 10, 2));
		cart1.add(new LineIteam(104, "notebook", 100, 1));
		// cart1.add("hello");

		for (Object iteam : cart1) {
			LineIteam line = (LineIteam) iteam;
			System.out.println(" product id=" + line.getId() + " product name="
					+ line.getName() + " productPrice=" + line.getPrice()
					+ " Product quantity=" + line.getQuantity() + " total cost="+line.calculateTotalCost());
		}

	}

}
