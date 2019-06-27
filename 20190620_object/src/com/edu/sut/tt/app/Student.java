package com.edu.sut.tt.app;

public class Student extends Object {

	private int stuHead = 1;
	private int stuFoot = 2;
	public int getStuHead() {
		return stuHead;
	}
	public void setStuHead(int stuHead) {
		this.stuHead = stuHead;
	}
	public int getStuFoot() {
		return stuFoot;
	}
	public void setStuFoot(int stuFoot) {
		this.stuFoot = stuFoot;
	}
	
	public void p(Object obj) {
		System.out.println(obj.toString());
	}
	public void study() {
		p("study");
	}
	public void sleep() {
		p("sleep");
	}	
     public void eat() {
		p("eat");
	}
     
	@Override
	public String toString() {
		return "Student [stuHead=" + stuHead + ", stuFoot=" + stuFoot + "]";
	}
 
}
