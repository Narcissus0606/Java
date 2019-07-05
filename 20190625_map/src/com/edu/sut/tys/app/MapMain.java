package com.edu.sut.tys.app;

import java.util.Map;

import com.edu.sut.tys.map.TestMap02;

public class MapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    /*TestMap01 tMap01 = new TestMap01();
		Map<String, Integer>map = tMap01.getCharMapCount();
		for (String s : map.keySet()) {
			System.out.print("key-> "+s+"    ");
			System.out.println("value-> "+map.get(s));
		}*/
		
		TestMap02 tMap02 = new TestMap02();
		Map<String, Integer>map = tMap02.getWordMapCount();
		for (String s : map.keySet()) {
			System.out.print("key-> "+s+"    ");
			System.out.println("value-> "+map.get(s));
		}
		
	}

}
