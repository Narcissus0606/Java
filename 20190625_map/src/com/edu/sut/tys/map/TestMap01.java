package com.edu.sut.tys.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestMap01 {
    //从控制台输入一串字符abccccddff，求每个字符出现的频率
	
	// Scaner map
	public Map<String,Integer> getCharMapCount(){
		
		Scanner scan = new Scanner(System.in);
		String value = scan.nextLine();
		
		//将这个字符串转换为char[]
		char[] temp = value.toCharArray();
		Map<String, Integer> map = new HashMap<>();
		for(char c:temp){
			String str = String.valueOf(c);
			if(map.containsKey(str)){
				//如果包含，就是需要给value+1，然后再把数据存回去。（更新vaule）
				Integer num = map.get(str)+1;
 				map.put(str, num);			
				continue;
			}else{
				//如果第一次来的，直接进行赋值
				map.put(str, 1);
			}			
		}
		scan.close();
		return map;
	}
	
}
