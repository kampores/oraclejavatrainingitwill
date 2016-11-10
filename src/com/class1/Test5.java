package com.class1;
//20161020
class Rect{
	
	private int w,h;
	
	public void set(int w,int h){//초기화 메소드
		this.w = w;
		this.h = h;
	}
	
	public int area(){
		return w*h;
	}
	
	public int length(){
		return (w+h)*2;
	}
	
	public void print(int a, int l){
		System.out.println("가로: "+w);
		System.out.println("세로: "+h);
		System.out.println("면적: "+a);
		System.out.println("둘레: "+l);
	}

	//Overloading(메소드 중복정의)
	//메소드의 이름은 동일하지만 괄호안에(매개변수)있는
	//인수의 갯수나 데이터 타입이 다르면 다른 메소드로 인식된다
	//통일성위해서 작성
	public void print(){
		System.out.println("가로: "+w);
		System.out.println("세로: "+h);
	}
	
	public void print(int a){
		System.out.println("가로: "+w);
		System.out.println("세로: "+h);
		System.out.println("면적: "+a);
	}
	
	public void print(double l){
		System.out.println("가로: "+w);
		System.out.println("세로: "+h);
		System.out.println("둘레: "+(int)l);
	}
}

public class Test5 {
	public static void main(String[] args) {
		Rect ob = new Rect();
		
		ob.set(10, 20);
		int a = ob.area();
		int l = ob.length();
		
		ob.print();
		ob.print(a);
		ob.print(a, l);
		ob.print((double)l);
	}
}
