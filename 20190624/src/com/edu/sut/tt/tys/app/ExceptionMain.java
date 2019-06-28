package com.edu.sut.tt.tys.app;

public class ExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 0;     //int a = 0;
		int b= 1;
		System.out.println(b/a);
		System.out.println("Math Exception!");
		System.out.println("---------------------------------------");
		String s = "";    //String s = null;
		System.out.println(s.equals("app"));
		System.out.println("Null Exception!");
		System.out.println("---------------------------------------");
		int[] arr = {1,4,6,9};
		for (int i = arr.length-1; i >= 0 ; i--) {  //int i = arr.length
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("ArrayIndexOutOfBoundsException!");
	}

}
