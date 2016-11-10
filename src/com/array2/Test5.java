package com.array2;
//20161019
public class Test5 {

	public static void main(String[] args) {
		//class
		//칸막이: method(명)
		//접근지정자: public, private
		//반환값(int,float,double,String..)(void)
		//매개변수(자료형)
		//지역변수,전역변수
		
		Rect ob = new Rect();
		Rect ob1 = new Rect();
		
		ob.input();
		int a = ob.area();
		int l = ob.length();
		ob.print(a,l);

		ob1.input();
		a = ob1.area();
		l = ob1.length();
		ob1.print(a, l);
		
		System.out.println("ob.w: "+ob.w);
		System.out.println("ob1.h: "+ob.h);
	}
}
