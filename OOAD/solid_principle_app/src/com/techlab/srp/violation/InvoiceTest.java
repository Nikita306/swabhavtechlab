package com.techlab.srp.violation;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice=new Invoice(101,"nikita",100,40,10);
		invoice.printInvoice();
		System.out.println("Discount price:"+invoice.calculateDiscount());
		System.out.println("GST Price:"+invoice.calculateGst());
		System.out.println("Total Cost:"+invoice.calculateTotalCost());

	}

}
