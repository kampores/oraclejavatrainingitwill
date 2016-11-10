package com.class2;

//20161021
//생성자
//instance변수를 초기화할 목적으로 사용
//메모리 할당을 받을때 사용

//생성자의 이름은 클래스의 이름과 동일
//리턴값이 없기때문에 property가 없다
//생성자는 overloading(중복정의)이 가능하다
//생성자에서 생성자를 호출 가능하다
//단, 호출시 코딩 제일 선두에서만 가능하다 

public class Test1 {
	private int x;

	public Test1(){
		System.out.println("기본생성자...");
		x = 10;
		System.out.println("x: "+x);
	}
	//public Test1(){}
	
	public Test1(int x){
		this();//Test1(); //생성자 호출은 선두에서만 가능
		
		System.out.println("생성자 오버로딩...");
		this.x = x;
		System.out.println("x: "+x);
	}
	
	public static void main(String[] args) {
		Test1 ob = new Test1();
		
		Test1 ob1 = new Test1(100);
	}
}
