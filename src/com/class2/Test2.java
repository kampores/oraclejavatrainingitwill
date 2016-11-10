package com.class2;
//20161021
class Rect{
	private int w,h;
	
	public Rect(){}//기본생성자
	
	public Rect(int w, int h){//생성자 오버로딩
		this.w = w;
		this.h = h;
	}
	
	public void set(int w, int h){//변수초기화메소드
		this.w = w;
		this.h = h;
	}
	
	public int area(){//일반메소드
		return w*h;
	}
	
	public int length(){//일반메소드
		return (w+h)*2;
	}
	
	public void print(int a){//일반메소드
		System.out.println("가로: "+w+",세로: "+h);
		System.out.println("넓이: "+a);
	}
	
	public void print(int a,int l){//메소드오버로딩(중복정의)
		System.out.println("가로: "+w+",세로: "+h);
		System.out.println("넓이: "+a);
		System.out.println("둘레: "+l);
	}
}

public class Test2 {

	public static void main(String[] args) {
		//기본생성자
		Rect ob1 = new Rect();
		ob1.set(10,20);
		int a = ob1.area();
		int l = ob1.length();
		ob1.print(a);
		ob1.print(a, l);
		
		//오버로딩된 생성자
		Rect ob2 = new Rect(100,200);
		a = ob2.area();
		l = ob2.length();
		ob2.print(a);
		ob2.print(a, l);
	}
}
