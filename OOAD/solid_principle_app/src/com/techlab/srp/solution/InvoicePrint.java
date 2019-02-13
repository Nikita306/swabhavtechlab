package com.techlab.srp.solution;

public class InvoicePrint {
	public void printInvoice(Invoice invoice) {
		System.out.println("Id:" + invoice.getId() + " " + "Name:" + invoice.getName() + " "
				+ "Cost:" + invoice.getCost() + " " + "Discount:" + invoice.getDiscount() + " "
				+ "GST:" + invoice.getGst());
	}

}
