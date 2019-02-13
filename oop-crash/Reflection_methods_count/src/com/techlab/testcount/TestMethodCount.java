package com.techlab.testcount;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.techlab.count.MethodCount;

public class TestMethodCount {

	public static void main(String[] args) {
		MethodCount count = new MethodCount(Object.class);
		Method[] array = count.getMethodCount();
		System.out.println(array.length);
		for (Method m : array) {
			System.out.println(m);
		}
		Constructor[] array1 = count.getConstructors();
		System.out.println(array1.length);
		for (Constructor c : array1) {
			System.out.println(c);
		}

	}

}
