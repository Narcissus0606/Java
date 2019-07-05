package com.edu.sut.tys.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Translate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Translate translate = new Translate();
		try {
			translate.input();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
/*案例3：
	模拟简单翻译软件
	例如：控制台 apple ，如果有这个单词，那么 这个翻译结果：苹果
	       如果没有apple 这个单词，记录到文本文件中去，并且输入汉语
		   退出条件：quit
	文件格式：
	en,ch
	apple,苹果笔记本
	File,文件
	
	方案：应用API：
		1，文件读写
		2，map
		3，Scaner
		4，推出
			quit
*/
	
/*	模拟翻译软件：trans.csv这个文件。第一次应不应有？
	有？
		发布应用，自动给客户配置好了。
	没有？
		我应该使用程序生成。（缺陷）
	正常情况：
		都应该符合以上两种情况。
		
		集成测试：
		记录1：控制台提示有问题
			详细：当我输入一个单词，（这个单词不存在），应该提示：单词不存在，
			请输入
			方案：修改提示语。
		
		记录2：如果输入相同的单词，并且条件（map并没有存这个新单词）
			方案：将第一次录入单词，进行录入到map，给用户一个假象（这个单词已经写入
			文本了。）
		
		记录3：录入一个单词（quit）情况，程序正常结束，但是结果不正确。
		结果：文本不正确
			en,zh
	        apple,苹果电脑
	        apple （判断当前这一行中必须符合格式，如果不是这种格式，那么不能存到
			list中）
	        apple,苹果电脑
	        quit
			修改，单行没有翻译，必须不能录入，quit不需要录入。
			quit去掉方案：
				list容器不添加。*/
			
		
			

	
	private static final String filename = "word.csv";
	private Map<String, String> map = new HashMap<>();
	
	
	public void input() throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a word:");
		String word = scanner.nextLine();
		while (true) {
			if (word.equals("q")) {
				System.out.println("Exit!");
				break;
			}
			translateWord(word);
			System.out.println("================================");
			System.out.println("Please input a word:");
			word = scanner.nextLine();
		}
		scanner.close();
	}
	
	
	private void translateWord(String word) throws IOException{
		getWordMap();
		Scanner scan = new Scanner(System.in);
		if(map.containsKey(word)){
			System.out.println(word+" -> "+map.get(word));
		}else{
			System.out.println("The word isn't exit!");
			System.out.println("Please input its' Chinese:");
			String Chinese = scan.nextLine();
			writeWord(word,Chinese);
		}
	}

	private void getWordMap() throws IOException {
		File file = new File(filename);
		Reader reader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(reader);
		StringBuffer sBuffer = new StringBuffer();
		String temp = bufferedReader.readLine();
		while (temp != null) {
			String[] table = temp.split(",");
			map.put(table[0], table[1]);
			temp = bufferedReader.readLine();
		}
		bufferedReader.close();
		reader.close();
	}
	
	private void writeWord(String word,String Chinese) throws IOException {
		File file = new File(filename);
		Writer writer = new FileWriter(file,true);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
		bufferedWriter.write(word+","+Chinese+"\n");
		bufferedWriter.flush();
		bufferedWriter.close();
		writer.close();
	}
}
