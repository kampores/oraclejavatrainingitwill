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
		System.out.println(u); //U�� �� �޼ҵ忡���� ��밡��
		System.out.println("tŬ����: " + t.getClass().getName());
		System.out.println("uŬ����: " + u.getClass().getName());
	}
}

public class Test2 {
	public static void main(String[] args) {
		Box2<Integer> b = new Box2<Integer>();
		
		b.set(new Integer(30));
		b.print("test");//U�� �ڷ����� String
		b.print(50);//U�� �ڷ����� Integer
	}
}
