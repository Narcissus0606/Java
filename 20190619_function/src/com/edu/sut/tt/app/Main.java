package com.edu.sut.tt.app;

import com.edu.sut.tt.*;


public class Main {

	public static void main(String[] args) {
		
		PrimeNumber priNum = new PrimeNumber();
		priNum.printprimenum(100);
		System.out.println("--------------------");	
		PerfectNumber perNum = new PerfectNumber();
		perNum.printperfectnum(1000);
		System.out.println("--------------------");	
		int[] array={95,45,86,75};
		GradeRank rank = new GradeRank();
		rank.printrank(array);
		System.out.println("--------------------");	
		FactorialSum fac = new FactorialSum();
		fac.factorialSum(20);
		System.out.println("--------------------");	
		MathSum mathsum = new MathSum();
		mathsum.print_n(30);
		System.out.println("--------------------");	
	}
}
