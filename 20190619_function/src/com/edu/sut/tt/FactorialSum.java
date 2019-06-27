package com.edu.sut.tt;

public class FactorialSum {

	public void factorialSum(int n)
	{
		int sum = 0;
		for(int i = 1;i <= n;i++){
			sum = sum + factorial(i);
		}
		for(int i = 1;i < n;i++){
			System.out.print(i+"!+");
		}
		System.out.println(n+"!="+sum);
	}
	public int factorial(int n)
	{
		if(n == 0||n == 1){
			return 1;
		}
		return n * factorial(n -1);
	}
	
}
