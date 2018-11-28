package com.techlab.creditcardTest;

import com.techlab.creditcard.Creditcard;

public class CreditcardTest {
	public static void main(String args[]) {
		Creditcard cc = new Creditcard("nikita",22,"master");
		cc.printDetails();
	

		cc.setCardtype("VISA");
		//cc.setCreditCard("ameycard");
		System.out.println("card type= " + cc.getCardType());

		
		
		cc.setage(22);
		cc.setage(-23);

		System.out.println("Age= " + cc.getage());

	}

}
