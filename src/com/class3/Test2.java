package com.class3;
//20161024
class Shape{
	private String title;
	protected double area;
	
	public Shape(){}
	
	public Shape(String title){
		this.title = title;
	}
	
	public void write(){
		System.out.println(title + ":" + area);
	}
}

class Circle extends Shape{
	private int r;
	protected static final double PI = 3.14;
	
	public Circle(int r){
		super("��");
		this.r = r;
	}
	
	public void circleArea(){
		area = (double)r*r*PI;
	}
}

class Recta extends Shape{
	private int w,h;
	
	public void rectArea(int w, int h){
		this.w = w;
		this.h = h;
		area = w*h;
	}
	
	//������̼�
	@Override //�������̵�: ��Ӱ���Ŭ���� �����޼ҵ��̸� <-> �����ε�: ����Ŭ���� �����޼ҵ��̸�
	public void write(){
		System.out.println("����:" + w);
		System.out.println("����:" + h);
		System.out.println("����:" + area);
	}
}

public class Test2 {
	public static void main(String[] args) {
		Circle c = new Circle(10);
		c.circleArea();
		c.write();
		
		Recta r = new Recta();
		r.rectArea(10, 20);
		r.write();//5. �θ�� �ڽ��� ���� ��ü�� ������ ������ ��������
	}
}
