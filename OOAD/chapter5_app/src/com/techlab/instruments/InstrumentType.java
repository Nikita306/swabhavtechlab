package com.techlab.instruments;

public enum InstrumentType {
	GUITAR,BANJO,DOBRO,FIDDLE,BASS,MANDOLINE;
	
	public String toString(){
		switch (this) {
		case GUITAR: return "Guitar";
		case BANJO: return "Banjo";
		case DOBRO: return "Dobro";
		case FIDDLE: return "Fiddle";
		case BASS: return "Bass";
		case MANDOLINE: return "Mandoline";
		default:  return "Unspecified";
			
		}
	}

}
