package com.edu.sut.tys.business.impl;

import com.edu.sut.tys.business.StrDeal;

public class strDealImpl implements StrDeal {

	public String strDeal(String str) {
		// TODO Auto-generated method stub
		str = str.replace("牛X", "赞");
		return str;
	}

}
