package com.edu.sut.tys.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.edu.sut.tys.bean.Student;

public class StudentMain {

	public static void main(String[] args) {
		
		//例如：在控制台输入一个id，根据id进行创建学生对象。
		//例如：在控制台输入123，如果存在不创建学生对象，如果没有则创建学生对象。
		//输入01234，则当前程序退出。
	    //分析问题：
	    //要创建学生对象，那么必须要有一个学生类。
	    //Scanner
	    //123
	    //map(String,Student)
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a id:");
		String id = scanner.nextLine();
		Map<String, Student> studentMap = new HashMap<>();
		while (true) {
			//退出条件
			if(id.equals("01234")){
				System.out.println("Successful exit procedure!");
				break;
			}
			if(studentMap.get(id).getId().equals(id)){
				System.out.println("The id is exit! Please input a new id:");
				id = scanner.nextLine();
				continue;
			}else {
				Student tempStu = new Student();
				tempStu.setId(id);
				studentMap.put(id, tempStu);
				System.out.println("The id has been kept! Please input a new id:");
				id = scanner.nextLine();
			}
			scanner.close();
		}	
	}

}
