package com.edu.sut.tt.tys.app;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =1;
		double b = 0.0;
		String s = "abc";
		
		Integer.parseInt(s);
		//java中面向对象，但是基本数据类型不是对象。
		//包装类
		//int ==== Integer int这种类型，是不是有个最大数值。
		//double Double
		//float Float
		//通过一种数据结构把a和b同时保存，在以后使用用户可以使用a和b两个变量。
		
		List list = new ArrayList();
		list.add(a);
		list.add(b);
		//这个容器list可以有满的情况吗？前提是内存无
		
		
	}

}
