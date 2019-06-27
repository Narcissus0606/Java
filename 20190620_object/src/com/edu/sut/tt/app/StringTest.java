package com.edu.sut.tt.app;

public class StringTest {

	public static String ID = "431103196905201338";
	
	public static void main(String[] args) {
		System.out.println("ID length:");
		System.out.println(ID.length());
		
		for(int i = 0;i < ID.length();i++){
			System.out.print(ID.charAt(i)+" ");
		}
		System.out.println();
		System.out.println(ID.substring(6,14));
	}

	public String[] getValues(String id) {
		String[] result = new String[3];
		result[0] = id.substring(0,2);
		result[1] = id.substring(6,14);
		char sex = id.charAt(id.length()-2);
		if(Integer.valueOf(sex)%2==0){
			
		}
		return null;
	}
	
}
