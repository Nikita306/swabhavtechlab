package com.techlab.test.shopping.cart;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.techlab.shopping.cart.Customer;
import com.techlab.shopping.cart.DateClass;
import com.techlab.shopping.cart.LineIteam;
import com.techlab.shopping.cart.Order;
import com.techlab.shopping.cart.Product;

public class CustomerTestCase {

	@Test
	public void testPlaceOrder() {
		Customer customer = new Customer("Nikita", "Jadhav", "Seawoods,Navi Mumbai","9874563212");
		DateClass date = new DateClass();
		String actualDate=date.getDate();
		System.out.println("Date:"+actualDate);
		Order order = new Order(date);
		ArrayList<Order> orderList = customer.getOrder();

		Product product1 = new Product(101, "laptop", 100, 10);
		LineIteam line1 = new LineIteam(product1, 2);
		Product product12 = new Product(102, "laptop", 100, 10);
		LineIteam line12 = new LineIteam(product12, 2);
		order.addLineIteam(line1);
		order.addLineIteam(line12);

		customer.placeOrder(order);

		Order order1 = new Order(date);
		Product product2 = new Product(103, "Book", 100, 10);
		LineIteam line2 = new LineIteam(product2, 2);
		order1.addLineIteam(line2);
		customer.placeOrder(order1);
		System.out.println("No. of Orders:"+customer.getOrder().size());

		System.out.print("Customer Details:");
		System.out.println("Fname=" + customer.getFname() + " " + "Lname="
				+ customer.getLname() + " " + "Address="
				+ customer.getAddress()+" "+"Mobile="+customer.getMobileNo());

		for (Order o : orderList) {
			List<LineIteam> iteam = o.getIteam();
			System.out.println(iteam);
			Double checkCost = o.checkOutCost();
			System.out.println("Check Out Cost:" + checkCost);
		}

	}

}
