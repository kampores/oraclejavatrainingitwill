package com.class5;
//20161026
class TestA{
	public void print(){
		System.out.println("A Ŭ����...");
	}
}

class TestB{
	public void print(){
		System.out.println("B Ŭ����...");
	}
}

public class Test1 {
	public static void main(String[] args) {
		TestA a = new TestA();
		TestB b;
		
		//�����Ͽ���
		//b = a;
		//b = (TestB)a;
	}
}
