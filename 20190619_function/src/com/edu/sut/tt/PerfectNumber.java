package com.edu.sut.tt;

public class PerfectNumber {

	public  boolean judge(int num)
	{
		int sum = 0;
		for(int j = 1;j < num;j++)
		{	
			if(num % j == 0)
			{
				sum = sum + j;
			}
		}
		if(num == sum)
		{
			return true;	
		}
		else
		{
			return false;
		}
	}
	
	public void printperfectnum(int n)
	{
		int num = 0;
		for(int i = 1;i <= n;i++)
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
		System.out.println("There are "+num+" perfect number!");
	}
	
}
