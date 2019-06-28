package com.edu.sut.tt.tys.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class ListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListMain lM = new ListMain(); 
		System.out.println(lM.input());
		
	}
	
	public int input() {
		List<Integer> list = new ArrayList<>();
		System.out.println("Please input:");
		Scanner scan = new Scanner(System.in);
		while (true) {
			int currentInt = scan.nextInt();	
			if (currentInt  == 0) {
				break;
			}
			list.add(currentInt);
		}
		scan.close();
		return this.output(list);
	}
	
	private int output(List<Integer> list) {
		Collections.sort(list);
		return list.get(list.size()-1);
	}

}
