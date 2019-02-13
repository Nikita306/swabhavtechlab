package com.techlab.shopping.cart;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {
	public String getDate(){
		SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date=new Date();
		
		return dateformat.format(date);
	}

}
