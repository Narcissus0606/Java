package com.edu.sut.abst.impl;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import com.edu.sut.abst.printer.Printer;

public class HPPrinter extends Printer {

	private int pageNum;
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("pageNum->"+pageNum);
		System.out.println("我是 ");
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
