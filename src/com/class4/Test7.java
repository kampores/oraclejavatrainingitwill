package com.class4;
//20161025

//�߻�Ŭ����
//�޸��� ���� �������� Ŭ������ �̸� ������ ���赵
//�޼ҵ带 �������ؼ� ����Ѵ�
abstract class ShapeClass{
	abstract void draw();
}

class Circ extends ShapeClass{
	@Override
	public void draw() {
		System.out.println("���� �׸���...");
	}
}

class Rect extends ShapeClass{
	@Override
	public void draw() {
		System.out.println("�簢���� �׸���...");
	}
}

class Tri extends ShapeClass{
	@Override
	public void draw() {
		System.out.println("�ﰢ���� �׸���...");
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
