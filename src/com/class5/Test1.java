package com.class5;
//20161026
class TestA{
	public void print(){
		System.out.println("A 클래스...");
	}
}

class TestB{
	public void print(){
		System.out.println("B 클래스...");
	}
}

public class Test1 {
	public static void main(String[] args) {
		TestA a = new TestA();
		TestB b;
		
		//컴파일오류
		//b = a;
		//b = (TestB)a;
	}
}
