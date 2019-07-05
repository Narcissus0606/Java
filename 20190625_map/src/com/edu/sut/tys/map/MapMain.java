package com.edu.sut.tys.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//区域号，地区名称对应
		//Map<key,value>
		Map<String, String> map = new HashMap<>();
		
		//如何进行存入数据
		map.put("116083", "大连");
		map.put("266700", "青岛");
		map.put("111110", "沈阳");
		
		//如何获取数据
		String string = map.get("111110");
		System.out.println(string);
		System.out.println("-------------------------");
		//如何获取map大小
		System.out.println(map.size());
		System.out.println("-------------------------");
		//如何删除
		map.remove("116083");
		System.out.println(map.size());
		System.out.println(map.get("116023"));
		System.out.println("-------------------------");
		//复杂操作
		//遍历所有key  不允许有重复key，这个key可以使用set集合
		//遍历所有value
		//方法一
		for (String s : map.keySet()) {
			System.out.print("key->"+s+" ");
			System.out.println("value->"+map.get(s));
		}
		System.out.println("-------------------------");
		//方法二
		//key value 封装为一个类，entry<String,String>
		for (Entry<String, String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		System.out.println("-------------------------");
		
		
	}

}
