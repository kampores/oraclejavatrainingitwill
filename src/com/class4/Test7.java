package com.class4;
//20161025

//추상클래스
//메모리의 낭비를 막기위해 클래스를 미리 설계한 설계도
//메소드를 재정의해서 사용한다
abstract class ShapeClass{
	abstract void draw();
}

class Circ extends ShapeClass{
	@Override
	public void draw() {
		System.out.println("원을 그린다...");
	}
}

class Rect extends ShapeClass{
	@Override
	public void draw() {
		System.out.println("사각형을 그린다...");
	}
}

class Tri extends ShapeClass{
	@Override
	public void draw() {
		System.out.println("삼각형을 그린다...");
	}
}

public class Test7 {
	public static void main(String[] args) {
		Circ c = new Circ();
		Rect r = new Rect();
		Tri t = new Tri();
		
		c.draw();
		r.draw();
		t.draw();
	}
}
