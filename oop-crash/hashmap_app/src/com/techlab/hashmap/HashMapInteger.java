package com.techlab.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;


public class HashMapInteger {

	public static void main(String[] args) {
		Map<Integer, String> hmap;
		//hmap = new HashMap<Integer, String>();
		hmap=new TreeMap<Integer,String>();
		//hmap=new LinkedHashMap<Integer, String>();
		
		hmap.put(3000, "nikita");
		hmap.put(40, "trupti");
		hmap.put(100, "aditya");
		hmap.put(2, "nikhil");
		System.out.print("Add:-");
		System.out.println(hmap);
		
		
		if(hmap.containsKey(1)){
		hmap.remove(1);
		}
		System.out.print("Delete:-");
		System.out.println(hmap);
		
		hmap.replace(2, "monika");
		System.out.print("Update:-");
		System.out.println(hmap);
		
		System.out.println("Display:-");
		for(Map.Entry<Integer, String> entry:hmap.entrySet()){
			System.out.println("KEY="+entry.getKey()+"\t"+"VALUE="+entry.getValue());
		}
		System.out.println("Display perform!!!!");
	}

}
