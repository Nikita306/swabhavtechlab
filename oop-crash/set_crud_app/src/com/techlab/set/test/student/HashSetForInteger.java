package com.techlab.set.test.student;

import java.util.Collections;
import java.util.HashSet;

public class HashSetForInteger {

	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(1);
		set.add(3);
		set.add(2);
		set.add(3);
		System.out.println("display"+set);
		set.add(4);
		System.out.println("adding"+set);
		set.remove(1);
		//Collections.sort(set);
		System.out.println("deleting"+set);
		
		System.out.println("size="+set.size());
		
	}

}
