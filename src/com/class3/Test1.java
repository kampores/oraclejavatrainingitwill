package com.class3;
//20161024
class Test{
	private String title;
	protected int area;
	
	//�⺻������
	//public Test(){}
	
	public Test(String title){
		this.title = title;
	}
	
	public void print(){
		System.out.println(title + ":" + area);
	}
}

class Rect extends Test{
	private int w,h;
	
	public Rect(){
		//super(); //�⺻������
		super("�簢��");
	}
	
	public Rect(int w, int h){
		super("�簢��");
		
		this.w = w;
		this.h = h;
	}
	
	public void rectArea(){
		area = w*h;
	}
}

public class Test1 {

	public static void main(String[] args) {
		Rect r = new Rect(10, 50);
		
		r.rectArea();
		r.print();
	}

}
