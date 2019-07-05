package com.edu.sut.tys.app;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.edu.sut.tys.bean.EntryBean;
import com.edu.sut.tys.map.TestMap01;
import com.edu.sut.tys.map.TestMap02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    //String id=116023 value=大连
		EntryBean<String, String> entry = new EntryBean<>();
		entry.setKey("110623");
		entry.setValue("大连");
		
		Set<EntryBean> set1 = new HashSet<>();
		set1.add(entry);
		
		for (EntryBean entry1: set1) {
			System.out.println();
		}
				
	}

}
