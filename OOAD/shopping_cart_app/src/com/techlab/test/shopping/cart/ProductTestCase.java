package com.techlab.test.shopping.cart;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlab.shopping.cart.Product;

public class ProductTestCase {

	@Test
	public void testShouldMatch() {
		Product product = new Product(101, "laptop", 500, 50);
		assertEquals(product.getId(), 101);
		assertEquals(product.getName(), "laptop");
		assertEquals((int) product.getPrice(), 500);
		assertEquals((int) product.getDiscount(), 50);
	}

	@Test
	public void testcalculateTotalPriceAfterDiscount() {
		Product p = new Product(101, "laptop", 100, 4);
		System.out.println("ID=" + p.getId() + " " + "Name=" + " "
				+ p.getName() + " Price=" + " " + p.getPrice() + " "
				+ "Discount" + p.getDiscount());
		System.out.println("Total Price After Discunt="
				+ p.calculateTotalPriceAfterDiscount());
		assertEquals((int) p.calculateTotalPriceAfterDiscount(), 96);

	}

}
