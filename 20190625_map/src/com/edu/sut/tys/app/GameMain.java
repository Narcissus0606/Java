package com.edu.sut.tys.app;

import com.edu.sut.tys.abstrat.game_Ddz.Game;
import com.edu.sut.tys.abstrat.game_Ddz.Impl.Ddz;

public class GameMain {

	public static void main(String[] args) {
		//面向接口编程
		//接口名 对象名 = new 接口实现类名;
		Game gameDdz = new Ddz(); 
		gameDdz.creatPoker(); 
		gameDdz.deals();
		gameDdz.displayCard();
	}
}
