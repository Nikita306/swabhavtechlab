package com.techlab.count;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MethodCount {
	private Class name;

	public MethodCount(Class name) {
		this.name = name;
	}

	public Method[] getMethodCount() {
		Method array[] = name.getMethods();
		return array;

	}
	
	public Constructor[] getConstructors(){
		Constructor array1[]=name.getConstructors();
		return array1;
	}
	

}
