package com.techlab.test.instrument;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.techlab.instruments.Builder;
import com.techlab.instruments.Instrument;
import com.techlab.instruments.InstrumentSpec;
import com.techlab.instruments.InstrumentType;
import com.techlab.instruments.Inventory;
import com.techlab.instruments.Type;
import com.techlab.instruments.Wood;

public class FindInstrument {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		 initializaInventory(inventory);

		Map properties = new HashMap();
		properties.put("builder", Builder.GIBSON);
		properties.put("backWood", Wood.MAPLE);
		InstrumentSpec clientSpec = new InstrumentSpec(properties);

		List matchingInstrument = inventory.search(clientSpec);
		if (!matchingInstrument.isEmpty()) {
			System.out.println("you might like these instrument:");
			for (Iterator i = matchingInstrument.iterator(); i.hasNext();) {
				Instrument instrument = (Instrument) i.next();
				InstrumentSpec spec = instrument.getSpec();
				System.out.println("We have a"
						+ spec.getProperty("instrumentType")
						+ "with the following properties:");
				for (Iterator j = spec.getProperties().keySet().iterator(); j
						.hasNext();) {
					String propertyName = (String) j.next();
					if (propertyName.equals("instrumentType"))
						continue;
					System.out.println(" " + propertyName + ": "
							+ spec.getProperty(propertyName));
				}
				System.out.println("you can have this "
						+ spec.getProperty("instrumentType") + "for $"
						+ instrument.getPrice() + "\n---");
			}
		} else {
			System.out.println("sorry, we have nothing for you");
		}
	}

	private static void initializaInventory(Inventory inventory){
		Map properties=new HashMap();
		properties.put("instrumentType", InstrumentType.GUITAR);
		properties.put("builder", Builder.COLLINGS);
		properties.put("model", "CJ");
		properties.put("type", Type.ACOUSTIC);
		properties.put("numString", 6);
		properties.put("topWood", Wood.INDIAN_ROSEWOOD0);
		properties.put("backWood", Wood.SITKA);
		inventory.addInstrument("11277", 39999.95, new InstrumentSpec(properties));
			
	
	}
}
