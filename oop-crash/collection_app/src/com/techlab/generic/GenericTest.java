package com.techlab.generic;

import java.util.ArrayList;

import com.techalb.lineiteam.LineIteam;

public class GenericTest {

	public static void main(String[] args) {
		ArrayList<LineIteam> cart1=new ArrayList<LineIteam>();
		cart1.add(new LineIteam(101, "book", 100, 2));
		cart1.add(new LineIteam(102, "pen", 10, 2));
		cart1.add(new LineIteam(103, "pencile", 10, 2));
		cart1.add(new LineIteam(104, "notebook", 100, 1));
		
		for(LineIteam line:cart1){
			System.out.println(" product id=" + line.getId() +"\t"+ " product name="
					+ line.getName()+"\t" + " productPrice=" + line.getPrice()+"\t"
					+ " Product quantity=" + line.getQuantity() + "\t"+" total cost="+line.calculateTotalCost());
		}

	}

}
