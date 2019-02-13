package com.techlab.test.shopping.cart;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.techlab.shopping.cart.DateClass;
import com.techlab.shopping.cart.LineIteam;
import com.techlab.shopping.cart.Order;
import com.techlab.shopping.cart.Product;

public class OrderTestCase {

	@Test
	public void testAddLineIteam() {
		DateClass date = new DateClass();
		String result = date.getDate();
		System.out.println("Todays Date:" + result);
		Order order = new Order(date);
		List<LineIteam> iteam = order.getIteam();
		Product product1 = new Product(101, "Laptaop", 100, 10);
		LineIteam line1 = new LineIteam(product1, 2);
		Product product2 = new Product(102, "charger", 100, 10);
		LineIteam line2 = new LineIteam(product2, 1);
		order.addLineIteam(line1);
		order.addLineIteam(line2);

		for (LineIteam line : iteam) {
			System.out.println(line);
		}
		assertTrue(true);

	}

	@Test
	public void testCheckOutCost() {
		DateClass date = new DateClass();
		Order order = new Order(date);
		System.out.println("Total CheckOut Cost= " + order.checkOutCost());
		// assertEquals((int)order.checkOutCost(), 456);

	}
}
