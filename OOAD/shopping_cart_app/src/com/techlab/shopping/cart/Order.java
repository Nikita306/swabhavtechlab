package com.techlab.shopping.cart;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private DateClass date;
	List<LineIteam> itemList = new ArrayList<LineIteam>();

	public DateClass getDate() {
		return date;
	}

	public Order(DateClass date) {
		this.date = date;
	}

	public void addLineIteam(LineIteam addIteam) {
	
		if (itemList.size()==0) {
			itemList.add(addIteam);
		} else {
			for (LineIteam line : itemList) {
				if (line.getProduct().getName()
						.equals(addIteam.getProduct().getName())) {
					int quantity=line.getQuantity()+addIteam.getQuantity();
			 line.setQuantity(quantity);
					
				} else 
					itemList.add(addIteam);
				
			}
		}

	}

	public List<LineIteam> getIteam() {
		return itemList;
	}

	public double checkOutCost() {
		double totalCost = 0;
		for (LineIteam l : itemList) {
			totalCost = totalCost + l.calculateTotalLineIteamCost();
		}
		return totalCost;

	}

}
