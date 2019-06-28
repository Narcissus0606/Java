package com.edu.sut.tt.tys.app;

import java.util.LinkedList;
import java.util.List;

import com.edu.sut.business.Student;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> list = new LinkedList<>();
		//没有变量接受的对象叫匿名对象
		//容器的添加方式
		list.add(new Student("160405201","nan"));
		list.add(new Student("160405202","nan"));
		list.add(new Student("160405203","nan"));
		list.add(new Student("160405204","nv"));
		
		Student xiaomi = new Student();
		xiaomi.setID("160405205");
		xiaomi.setSEX("nv");
		list.add(xiaomi);
		
		//放学，容器
		//按照对象的名称进行删除
		list.remove(xiaomi);
		//匿名的按照位置
		list.remove(0);
		
		//清空容器
		list.clear();
		
	}

}
