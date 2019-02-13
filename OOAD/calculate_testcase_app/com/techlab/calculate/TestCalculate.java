package com.techlab.calculate;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculate {

	@Test
	public void addWithOnlyPositive() {
		Calculate calc=new Calculate();
		int result=calc.addPositiveNo(30, 20);
		System.out.println(result);
		assertEquals(50, result);
	}
	
	@Test
	public void additionWithFirstNegative() {
		try{
		Calculate calc=new Calculate();
		int result=calc.addPositiveNo(-30,20);
		assertFalse(false);
		}catch(NegativeNotSupportException ex){
		assertTrue(true);
		}
	}
	@Test
	public void additionWithSecondNegative() {
		try{
		Calculate calc=new Calculate();
		int result=calc.addPositiveNo(30,-20);
		assertFalse(false);
		}catch(NegativeNotSupportException ex){
		assertTrue(true);
		}
	}
	@Test
	public void additionWithBothNegative() {
		try{
		Calculate calc=new Calculate();
		int result=calc.addPositiveNo(-30,-20);
		assertFalse(false);
		}catch(NegativeNotSupportException ex){
		assertTrue(true);
		}
	}
	
	

}
