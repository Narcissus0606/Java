package com.edu.sut.tys.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestMap02 {
    //从控制台输入一串单词 hello world ni hao apple orage hello world 
	//统计当前单词出现频率：hello 2次 world 2次

	public Map<String,Integer> getWordMapCount(){

		Scanner scan = new Scanner(System.in);
		String value = scan.nextLine();
		
		//将这个字符串转换为String[]
		String[] temp = value.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for(String str:temp){
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
