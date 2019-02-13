package com.techlab.instruments;

public enum Wood {
	INDIAN_ROSEWOOD,BRAZILIAN_ROSEWOOD,MAHOGANY,MAPLE,COCOBOLO,CEDAE,ADIRONDACK,ALDAR,SITKA, INDIAN_ROSEWOOD0;
	
	public String toString(){
		switch(this){
		case INDIAN_ROSEWOOD:return "Indian RoseWood";
		case BRAZILIAN_ROSEWOOD:return "Brazilian RoseWood";
		case MAHOGANY:return "mahogany";
		case MAPLE: return "maple";
		case COCOBOLO:return "cocobolo";
		case CEDAE:return "cedae";
		case ADIRONDACK: return "adirondack";
		case ALDAR:return "aldar";
		case SITKA:return "sitka";
		}
		return null;
		
	}

}
