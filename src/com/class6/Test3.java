package com.class6;
//20161027

//3.내부클래스(중첩)
class Outer1{
	static int a = 10;
	int b = 20;
	
	public static class Inner1{
		int c = 30;
		
		public void write(){
			System.out.println(a);
			//System.out.println(b);
			System.out.println(c);
			
			Outer o = new Outer();
			System.out.println(o.b);
		}
	}
	
	public void print(){
		Inner1 ob = new Inner1();
		ob.write();
	}
}
public class Test3 {

	public static void main(String[] args) {
		Outer1 out = new Outer1();
		out.print();
		
		Outer1.Inner1 inner = new Outer1.Inner1();
		inner.write();
	}
}
