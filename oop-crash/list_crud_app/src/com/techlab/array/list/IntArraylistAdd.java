package com.techlab.array.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class IntArraylistAdd {
	public static void main(String[] args) {
		
	ArrayList<Integer> list=new ArrayList<Integer>();
	list.add(40);
	list.add(20);
	list.add(30);
	list.add(10);
	Collections.sort(list);
	
	System.out.println("display="+list);
	list.add(50);
	System.out.println("adding="+list);
	list.set(4,500);
	System.out.println("update="+list);
	list.remove(4);
	System.out.println("Delete"+list);
	
	
	}
	
	
	
}
