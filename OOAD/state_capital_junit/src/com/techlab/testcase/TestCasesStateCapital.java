package com.techlab.testcase;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.techlab.state.capital.StateCapital;

public class TestCasesStateCapital {

	@Test
	public void testDisplayStateCapital() throws Exception {
		StateCapital sc = new StateCapital();
		HashMap<String, String> map = sc.displayFile();
		System.out.println("Display----------------------");
		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + "::" + entry.getValue());
		}
	}
	@Test
	public void testSearchByChar() throws Exception {
		System.out.println("Search-------------------------");
		StateCapital sc = new StateCapital();
		HashMap<String, String> map = sc.search("k");
		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
