package com.class6;
//20161027

//1.내부클래스(Inner)
//클래스안에 클래스가 들어감

class Outer{
	static int a=10;
	int b=20;
	
	public class Inner{//내부클래스(Outer$Inner.class)
		int c=30;
		
		public void write(){
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
	}
	
	public void print() {
		Inner ob = new Inner();
		ob.write();
	}
}

public class Test1 {
	public static void main(String[] args) {
		Outer out = new Outer();//외부클래스 객체생성
		out.print();
		
		Outer.Inner inner = out.new Inner();//내부클래스 객체생성
		inner.write();
	}
}
