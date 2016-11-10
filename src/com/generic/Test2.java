package com.generic;
//20161031
class Box2<T>{
	private T t;
	
	public void set(T t){
		this.t = t;
	}
	
	public T get(){
		return t;
	}
	
	public <U> void print(U u){
		System.out.println(u); //U는 이 메소드에서만 사용가능
		System.out.println("t클래스: " + t.getClass().getName());
		System.out.println("u클래스: " + u.getClass().getName());
	}
}

public class Test2 {
	public static void main(String[] args) {
		Box2<Integer> b = new Box2<Integer>();
		
		b.set(new Integer(30));
		b.print("test");//U의 자료형은 String
		b.print(50);//U의 자료형은 Integer
	}
}
