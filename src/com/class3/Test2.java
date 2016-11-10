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
		super("원");
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
	
	//어노테이션
	@Override //오버라이드: 상속관계클래스 같은메소드이름 <-> 오버로딩: 같은클래스 같은메소드이름
	public void write(){
		System.out.println("가로:" + w);
		System.out.println("세로:" + h);
		System.out.println("넓이:" + area);
	}
}

public class Test2 {
	public static void main(String[] args) {
		Circle c = new Circle(10);
		c.circleArea();
		c.write();
		
		Recta r = new Recta();
		r.rectArea(10, 20);
		r.write();//5. 부모와 자식이 같은 객체를 가지고 있으면 내꺼쓴다
	}
}
