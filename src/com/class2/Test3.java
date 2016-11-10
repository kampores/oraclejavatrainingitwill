package com.class2;
//20161021
public class Test3 {

	int a=5;
	
	{//초기화블럭
		System.out.println("초기화 블럭 a: "+a);
		a=10;
		System.out.println("초기화 블럭 a: "+a);
	}
	
	static int b;
	static{//static 블럭
		b=10;
		System.out.println("static블럭 b: "+b);
	}
	
	final int c;//한번만 초기화가능(선언시에 초기화)
	
	public Test3(){
		System.out.println("생성자...");
		c=100;
		System.out.println("c: "+c);
	}
	
	public static void main(String[] args) {
		Test3 ob1 = new Test3();
		Test3 ob2 = new Test3();
	}
}
