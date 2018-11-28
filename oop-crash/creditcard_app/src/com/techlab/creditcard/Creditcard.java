package com.techlab.creditcard;

public class Creditcard {
	private String cardHolderName;
	private int age;
	private String cardType;

	public Creditcard(String cardHolderName1, int age1, String cardType1) {
		this.cardHolderName = cardHolderName1;
		this.age = age1;
		this.cardType = cardType1;
	}

	public void setName(String cardHolderName1) {
		this.cardHolderName = cardHolderName1;
	}

	public String getName() {
		return cardHolderName;
	}

	public void setage(int age1) {
		if (age1 > 0) {
			this.age = age1;
		}
	}

	public int getage() {
		return age;

	}

	public void setCardtype(String CardType1) {
		if (CardType1.equalsIgnoreCase("Master") || CardType1.equalsIgnoreCase("visa")	|| CardType1.equalsIgnoreCase("AmeyCard")){
			this.cardType = CardType1;
	}
	}

	public String getCardType() {
		return cardType;

	}

	public void printDetails() {
		System.out.println("card holder name= " + getName());
		System.out.println("Age= " + getage());
		System.out.println("Card type= " + getCardType());
	}

	/*
	 * public void setCreditCard(String type) { if
	 * (type.equalsIgnoreCase("Master") || type.equalsIgnoreCase("visa") ||
	 * type.equalsIgnoreCase("AmeyCard")) { cardType = type; }
	 * 
	 * }
	 * 
	 * public String getCreditCard() { return cardType; }
	 * 
	 * public void setAge(int newage) { if (newage > 0) { age = newage; } }
	 * 
	 * public int getAge() { return age; }
	 */

}
