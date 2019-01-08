package com.techlab.guitar;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.techlab.guitar.Guitar;

public class Inventory {
	private List guitars;

	public Inventory() {
		guitars = new LinkedList();
	}

	public void addGuitar(String serialNumber, double price, GuitarSpec spec) {
		Guitar guitar = new Guitar(serialNumber, price, spec);
		guitars.add(guitar);
	}

	public Guitar getGuitar(String SerialNumber) {
		for (Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSerialNumber().equals(SerialNumber)) {
				return guitar;
			}
		}
		return null;
	}

	public LinkedList search(GuitarSpec searchSpec) {
		LinkedList matchingGuitar = new LinkedList();
		for (Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();

			GuitarSpec guitarspec = guitar.getspec();
			if (searchSpec.getBuilder() != guitarspec.getBuilder())
			continue;
			String model = searchSpec.getModel().toLowerCase();
			if ((model != null) && (!model.equals(" "))
					&& (!model.equals(guitarspec.getModel().toLowerCase())))
				continue;

			if (searchSpec.getType() != guitarspec.getType())
				continue;

			if (searchSpec.getBackWood() != guitarspec.getBackWood())
				continue;

			if (searchSpec.getTopWood() != guitarspec.getTopWood())
				continue;
			matchingGuitar.add(guitar);

		}
		return matchingGuitar;

	}
}
