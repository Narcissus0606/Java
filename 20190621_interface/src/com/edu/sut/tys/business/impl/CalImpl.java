package com.edu.sut.tys.business.impl;

import com.edu.sut.tys.business.Cal;

public class CalImpl implements Cal {

	@Override
	public int yu(int a, int b) {
		// TODO Auto-generated method stub
		return a&b;
	}

	@Override
	public int huo(int a, int b) {
		// TODO Auto-generated method stub
		return a|b;
	}

	@Override
	public int fei(int a) {
		// TODO Auto-generated method stub
		return ~a;
	}

}
