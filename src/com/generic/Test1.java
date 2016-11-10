package com.generic;
//20161031
class Box<T>{
	private T t;//자료형이 정해지지 않음
	
	public void set(T t){
		this.t = t;
	}
	
	public T get(){
		return t;
	}
}

public class Test1 {
	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>();
		b1.set(new Integer(10));
		Integer i = b1.get();
		System.out.println(i);
	
		Box<String> b2 = new Box<String>();
		b2.set("서울");
		String s = b2.get();
		System.out.println(s);
		
		Box b3 = new Box();
		b3.set(30);
		Integer ii = (Integer)b3.get();//downcast
		System.out.println(ii);
	}
}	