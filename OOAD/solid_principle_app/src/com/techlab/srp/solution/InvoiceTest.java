package com.techlab.srp.solution;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice=new Invoice(101,"nikita",100,40,10);
		System.out.println("Discount price:"+invoice.calculateDiscount());
		System.out.println("GST Price:"+invoice.calculateGst());
		System.out.println("Total Cost:"+invoice.calculateTotalCost());
		
		InvoicePrint print=new InvoicePrint();
		print.printInvoice(invoice);

	}

}
