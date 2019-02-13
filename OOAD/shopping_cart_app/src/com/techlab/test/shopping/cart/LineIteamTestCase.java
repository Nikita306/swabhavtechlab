package com.techlab.test.shopping.cart;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlab.shopping.cart.LineIteam;
import com.techlab.shopping.cart.Product;

public class LineIteamTestCase {

	@Test
	public void testShouldMatch() {
		Product product = new Product(101, "laptop", 100, 4);
		LineIteam iteam = new LineIteam(product, 2);
		assertEquals(iteam.getProduct().getId(), 101);
		assertEquals(iteam.getProduct().getName(), "laptop");
		assertEquals((int) iteam.getProduct().getPrice(), 100);
		assertEquals((int) iteam.getProduct().getDiscount(), 4);
		assertEquals(iteam.getQuantity(), 2);

	}

	@Test
	public void testCalculateTotalLineIteam() {
		Product product = new Product(101, "laptop", 100, 4);
		LineIteam iteam = new LineIteam(product, 2);
		System.out.println("Price after Discount="
				+ iteam.getProduct().calculateTotalPriceAfterDiscount() + " "
				+ "Quantity=" + iteam.getQuantity());
		System.out.println("Total LineIteam Cost="
				+ iteam.calculateTotalLineIteamCost());
		assertEquals((int) iteam.calculateTotalLineIteamCost(), 192);
	}

}
