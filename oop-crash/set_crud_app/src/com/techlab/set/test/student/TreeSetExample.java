package com.techlab.set.test.student;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		Set<Integer> set;
		//set=new TreeSet<Integer>();
		//set=new HashSet<Integer>();
		set=new LinkedHashSet<Integer>();
		set.add(20);
		set.add(4000);
		set.add(100000);
		set.add(30000);
		set.add(100);
		set.add(20);
		System.out.println(set);

	}

}
