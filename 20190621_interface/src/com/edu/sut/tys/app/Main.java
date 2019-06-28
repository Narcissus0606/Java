package com.edu.sut.tys.app;

import com.edu.sut.tys.business.Cal;
import com.edu.sut.tys.business.StrDeal;
import com.edu.sut.tys.business.impl.CalImpl;
import com.edu.sut.tys.business.impl.LetterDealImpl;
import com.edu.sut.tys.business.impl.strDealImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	String str = "我的就业很好了,哈哈，牛X！hello ,我的工资是5000。被就业了。我的工资是3000元。";
		
		StrDeal sd1 = new strDealImpl();
		System.out.println(sd1.strDeal(str));
		
		StrDeal sd2 = new LetterDealImpl();
		System.out.println(sd2.strDeal(str));*/
		
		Cal cal = new CalImpl();
		System.out.println(cal.yu(1, 0));		
		
	}

}
