package com.edu.sut.business;

import java.util.ArrayList;
import java.util.List;

public class Recycle {

	private List<Object> list = new ArrayList<>();
	
	//回收站只有一个，单态
	private Recycle(){
		
	}
	
	private static Recycle recycle = new Recycle();
	
	public static Recycle getInstance(){
		
		return recycle;
	}
	//回收站内容可以添加add()
	public void add(Object obj){
		this.list.add(obj);
	}
	//回收站内容清空clear()
	public void clear() {
		this.list.clear();
	}	
	//回收站内容个数size()
	public int size() {
		return this.list.size();
	}
	//回收站内容可以删除del()
	public void  del(Object obj) {
		this.list.remove(obj);
	}
	
	public List<Object> getList(){
		return this.list;
	}
	
}
