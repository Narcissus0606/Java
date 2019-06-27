package com.edu.sut.tt;

public class GradeRank {
    
	public char judge(int grade)
	{
		int a = grade / 10;
		switch(a){
		case 10:
			return 'A';
		case 9:
			return 'A';
		case 8:
			return 'B';
		case 7:
			return 'C';
		case 6:
			return 'C';
		default:
			return 'D';
		}
	}
	
	public void printrank(int[] grade)
	{
		for(int i = 0;i < grade.length;i++){
			int t_grade = grade[i];
			System.out.println("Grade:"+grade[i]+"   Grade Rank:"+judge(t_grade));
		}
	}
	
}
