package com.techlab.test.shopping.cart;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.techlab.shopping.cart.DateClass;

public class DateUnitTestCase {

	@Test
	public void testCurrentDate() {
		DateClass date=new DateClass();
		String result=date.getDate();
		System.out.println(result);
		//assertEquals(result,);

	}

}
