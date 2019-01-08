package com.techlab.annotation;

import java.lang.reflect.Method;
import java.text.Annotation;

public class MethodsCount {
	private Class name;

	@ProTest
	public boolean Method1() {
		System.out.println("Implementation of method1 is pass");
		return true;
	}

	@ProTest
	public boolean Method2() {
		System.out.println("Implementation of method2 is fail");
		return false;
	}

	public boolean Method3() {
		System.out.println("Implementation of method3");
		return false;
	}

	public boolean Method4() {
		System.out.println("Implementation of method4");
		return false;
	}

	

}
