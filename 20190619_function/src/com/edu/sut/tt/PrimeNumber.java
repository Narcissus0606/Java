package com.edu.sut.tt;

public class PrimeNumber {

	public  boolean judge(int num)
	{
		
		for(int i = 2;i < num;i++)
		{	
			if(num % i == 0)
			{
				 return false;	
			}
		}
		return true;				
	}
	
	public  void printprimenum(int n)
	{
		int num = 0;
		for(int i = 2;i <= n;i++)
		{
			if(judge(i))
			{
				num++;
				System.out.print(i+" ");
				if(num % 5 == 0)
				{
					System.out.println();
				}				
			}		
		}
		System.out.println("There are "+num+" prime number!");
	}	
}
