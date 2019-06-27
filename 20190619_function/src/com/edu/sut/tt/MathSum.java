package com.edu.sut.tt;

public class MathSum {

	public int mathsum(int n) {
		if(n == 1)
			return 1;
		if(n == 2)
			return 2;
		return mathsum(n - 1) + mathsum(n - 2);
	}
	
	public void print_n(int n) {
		for(int i = 1;i <= n;i++){
			System.out.print(mathsum(i)+" ");
		}
		System.out.println();
	}
}
