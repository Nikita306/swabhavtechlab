package com.techlab.test.shopping.cart;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.techlab.shopping.cart.Customer;
import com.techlab.shopping.cart.DateClass;
import com.techlab.shopping.cart.LineIteam;
import com.techlab.shopping.cart.Order;
import com.techlab.shopping.cart.Product;

public class HtmlView {

	public static void main(String[] args) throws Exception {
		Customer customer = new Customer("Nikita", "Jadhav",
				"Seawoods,Navi Mumbai", "9874563212");
		DateClass date = new DateClass();
		String actualDate = date.getDate();
		Order order = new Order(date);
		List<Order> orderList = customer.getOrder();
		
		Product product1 = new Product(101, "laptop", 50000, 50);
		LineIteam line1 = new LineIteam(product1, 2);
		Product product2=new Product(102, "laptop", 100, 4);
		LineIteam line2=new LineIteam(product2, 2);
		order.addLineIteam(line1);
		order.addLineIteam(line2);
		customer.placeOrder(order);

		String html = "<html><head><h1>SHOPPING CART</h1><h>Place Order</h1></head><body><h3>Customer Details</h3>Date:"
				+ actualDate
				+ "<br>First Name="
				+ customer.getFname()
				+ "<br>Last Name="
				+ customer.getLname()
				+ "<br>Address= "
				+ customer.getAddress()
				+ "<br>Mobile No.= "
				+ customer.getMobileNo()
				+ "<br><br><h3>Product details:</h3>"
				+ order.getIteam()
				+ "<br><br>Total CheckCost:"
				+ order.checkOutCost() + "</body></head></html><br>";

		FileOutputStream fout = new FileOutputStream(
				"C:\\Users\\admin\\Desktop\\shopping.html");
		byte[] b = html.getBytes();
		System.out.println("sucess");
		fout.write(b);
		fout.close();

	}

}
