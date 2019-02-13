package com.techlab.instruments;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List inventory;
	
	public Inventory(){
		inventory=new LinkedList();
	}
	
	public void addInstrument(String serialNumber,double price,InstrumentSpec spec){
		/*Instrument instrument=null;
		if(spec instanceof GuitarSpec){
			instrument=new Guitar(serialNumber, price, spec);
		}else if(spec instanceof MandolineSpec){
			instrument=new Mandoline(serialNumber, price, spec);
		}*/
		Instrument instrument=new Instrument(serialNumber, price, spec) ;
		inventory.add(instrument);
	}
	public Instrument get(String serialNumber){
		for(Iterator i=inventory.iterator();i.hasNext();){
			Instrument instrument=(Instrument)i.next();
			if(instrument.getSerialNumber().equals(serialNumber)){
				return instrument;
			}
		}
		return null;
	}
	
	public List search(InstrumentSpec searchSpec){
		List matchingInstruments=new LinkedList();
		for(Iterator i=inventory.iterator();i.hasNext();){
			Instrument instrument=(Instrument)i.next();
			if(instrument.getSpec().matches(searchSpec))
				matchingInstruments.add(instrument);
		}
		return matchingInstruments;
		
	}

}
