package com.techlab.guitar.test;

import java.util.Iterator;
import java.util.List;

import com.techlab.guitar.Builder;
import com.techlab.guitar.Guitar;
import com.techlab.guitar.GuitarSpec;
import com.techlab.guitar.Inventory;
import com.techlab.guitar.Type;
import com.techlab.guitar.Wood;

public class FindGuitarTester {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializaInventory(inventory);

		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "martin", Type.ELECTRIC, Wood.ALDAR,Wood.ALDAR);
		GuitarSpec WhatErinLikes1=new GuitarSpec(Builder.COLLINGS,"model",Type.ACOUSTIC,Wood.ADIRONDACK,Wood.ADIRONDACK);
		List matchingGuitar = inventory.search(WhatErinLikes1);
		if (!matchingGuitar.isEmpty()) {
			System.out.println(" ");
			for (Iterator i = matchingGuitar.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				GuitarSpec spec=guitar.getspec();

				System.out.println("Erin,you might like this "
						+ spec.getBuilder() + " " + spec.getModel() + " "
						+ spec.getType() + " " + "guitar:\n"
						+ spec.getBackWood() + "back and sides,\n"
						+ spec.getTopWood()
						+ " top.\n you can have it for only $"
						+ guitar.getPrice() + "!");
			}
		} else {
			System.out.println("sorry, Erin , we have nothing for u.");
		}

	}

	private static void initializaInventory(Inventory inventory) {
		inventory.addGuitar("101", 50000.0,new GuitarSpec(Builder.FENDER, "martin", Type.ELECTRIC,  Wood.ALDAR, Wood.ALDAR));
		inventory.addGuitar("102", 60000.0,new GuitarSpec(Builder.COLLINGS,"model",Type.ACOUSTIC,Wood.ADIRONDACK,Wood.ADIRONDACK));
	}

}
