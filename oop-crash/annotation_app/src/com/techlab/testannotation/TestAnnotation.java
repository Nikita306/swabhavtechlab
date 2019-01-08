package com.techlab.testannotation;

import java.lang.reflect.Method;
import java.text.Annotation;

import com.techlab.annotation.MethodsCount;
import com.techlab.annotation.ProTest;

public class TestAnnotation {

	public static void main(String[] args) throws Exception,
			SecurityException {
		MethodsCount obj = new MethodsCount();
		for (Method method : MethodsCount.class.getMethods()) {
			if (method.isAnnotationPresent(ProTest.class)) {
				System.out.println(method);
				if(method!=null){
					method.invoke(obj);
					
				}
				//Object m=method.invoke(method,null);
			}
			

		}

	}
}
