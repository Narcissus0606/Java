package com.edu.sut.tys.business.impl;

import com.edu.sut.tys.business.StrDeal;

public class LetterDealImpl implements StrDeal {

	@Override
	public String strDeal(String str) {
		// TODO Auto-generated method stub
		str = str.replace("hello", "Hello");
		return str;
	}

}
