package com.techlab.test.factory.method;

import java.lang.reflect.Method;

public class TestFoo {

	public static void main(String[] args) {
		Foo f=new Foo();
		Method[] c=f.getClass().getMethods();
		String s=c.toString();
		System.out.println(c);
		System.out.println(s);

	}

}
