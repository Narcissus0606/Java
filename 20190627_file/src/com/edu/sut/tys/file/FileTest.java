package com.edu.sut.tys.file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String pathname = "D:\\workdir";
		File file = new File(pathname);
*/
		/*
		//绝对路径
		System.out.println(file.getAbsolutePath());
		//是否存在
		System.out.println(file.exists());
		//是否是文件夹
		System.out.println(file.isDirectory());
		//fix time
		System.out.println(file.lastModified());
		//是否读写
		System.out.println(file.canRead());
		//文件大小
		System.out.println(file.length());	*/
		
		/*//案例一
		FileTest fileTest = new FileTest();
		try {
			fileTest.createFile("bigfile.txt");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//案例2：给出一个文件夹路径，遍历当前的文件夹，并进行绝对路径的输出。
		//D:\workdir\2019
		// 内容包括：子文件、子文件夹的内容全部输出。
		String pathname = "D:\\workdir\\2019";
		FileTest fileTest = new FileTest();
		fileTest.printFile(pathname);
		
	}
	
	
	//创建一个1M的文件
	public void createFile(String pathname) throws Exception {
		File file = new File(pathname);
		OutputStream out = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(out);
		while(file.length() < Math.pow(2, 20)){
			byte[] b = new byte[1024];
			for (int i = 0; i < b.length; i++) {
				b[i] = (byte)i;
			}
			
			bos.write(b);
			bos.flush();
		}
		bos.close();
		System.out.println("当前文件大小:");
		System.out.println(file.length());
	}
	
	//打印指定路径下的所有文件
	public void printFile(String pathname) {
		File file = new File(pathname);
		if(file.isDirectory()){
			Directory(file);
		}
		if(file.isFile()){
			System.out.println(file.getName()+"    "+file.getAbsolutePath());
		}
	}
	
	private void Directory(File file) {
		File[] arrayFile = file.listFiles();
		for (int i = 0; i < arrayFile.length; i++) {
			if(arrayFile[i].isFile()){
				System.out.println(arrayFile[i].getName()+"    "+arrayFile[i].getAbsolutePath());
			}else if(arrayFile[i].isDirectory()){
				Directory(arrayFile[i]);
			}	
		}
	}

}
