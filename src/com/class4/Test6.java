package com.class4;
//20161025

//final의 특징
//변수에 final을 붙이면 한번만 초기화 가능
//메소드에 final을 붙이면 Override 불가
//클래스에 final을 붙이면 상속불가
class TestA{
	public static final double PI;
	
	static{
		PI=3.14;
	}
	
	public double area;
	
	public final void write(String title){
		System.out.println(title + ":" + area);
	}
}

public class Test6 extends TestA{
	
	/*@Override
	public void write(String title) {
		super.write(title);
	}*/

	public void circleArea(int r){
		area = (double)r*r*PI;
	}
	
	public static void main(String[] args) {
		Test6 ob = new Test6();
		
		ob.circleArea(10);
		ob.write("원");
		
	}

}
