package com.edu.sut.tys.abstrat.game_Ddz.Impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.edu.sut.tys.abstrat.game_Ddz.Constant;
import com.edu.sut.tys.abstrat.game_Ddz.Game;

public class Ddz implements Constant, Game {

	private Map<Integer, String> map = new HashMap<>();
	private List<Integer> player1 = new ArrayList<>();
	private List<Integer> player2 = new ArrayList<>();
	private List<Integer> player3 = new ArrayList<>();
	private List<Integer> handCard = new ArrayList<>();
		
	@Override
	public void creatPoker() {
		List<String> colorlist = new ArrayList<>();
		colorlist.add(color1);
		colorlist.add(color2);
		colorlist.add(color3);
		colorlist.add(color4);
		List<String> numlist = new ArrayList<>();
		for (int i = 2; i < 15; i++) {
			if (i == 11) {
				numlist.add(w1);
			}else if (i== 12) {
				numlist.add(w2);
			}else if (i== 13) {
				numlist.add(w3);
			}else if (i== 14) {
				numlist.add(w4);
			}else{
				numlist.add(String.valueOf(i));			
			}
		}
		int index = 0;
		map.put(index++, w5);
		map.put(index++, w6);
		for (String num : numlist) {
			for (String color : colorlist) {
				map.put(index++, color+num);
			}	
		}			
	}

	@Override
	public void deals() {
		//绗竴姝ワ細鏋勯��54寮犵墝椤哄簭
		List<Integer> list = new ArrayList<>();
		for(int i = 0;i < 54;i++){
			list.add(i);
		}
		
		//绗簩姝ワ細娲楃墝锛堢畝鍗曟潵璇村氨鐩稿綋浜庝竴涓殢鏈烘帓搴忥級
		Collections.shuffle(list);
		Collections.shuffle(list);
		Collections.shuffle(list);
		Collections.shuffle(list);
		
		//绗笁姝ワ細鍙戠墝缁欑帺瀹�1銆佺帺瀹�2銆佺帺瀹�3锛屽苟涓旂暀涓夊紶褰撲綔搴曠墝		
		for (int i = 0; i < list.size(); i++) {
			if (i >= 51) {
				handCard.add(list.get(i));
			}else if (i % 3 == 0) {
				player1.add(list.get(i));
			}else if (i % 3 == 1) {
				player2.add(list.get(i));
			}else{
				player3.add(list.get(i));
			}
		}
		
		//绗洓姝ワ細灏嗙墝鎺掑簭
		Collections.sort(player1);
		Collections.sort(player2);
		Collections.sort(player3);
		Collections.sort(handCard);
	}

	@Override
	public void displayCard() {
		
		System.out.println("===============player1================");
		for(int n1:player1){
			System.out.print(map.get(n1)+"  ");
		}
		System.out.println();
		System.out.println("===============player2================");
		for(int n2:player2){
			System.out.print(map.get(n2)+"  ");
		}
		System.out.println();
		System.out.println("===============player3================");
		for(int n3:player3){
			System.out.print(map.get(n3)+"  ");
		}
		System.out.println();
		System.out.println("===============Hand Card================");
		for(int n4:handCard){
			System.out.print(map.get(n4)+"  ");
		}
	}
}