package com.class5;
//20161026

//Interface
//1.추상클래스의 일종으로 선언만있고 정의가 없다
//2.final변수만 정의할 수 있다
//3.인터페이스를 구현하기 위해서는 implements를 사용한다
//4.하나이상의 인터페이스를 implements한 클래스는 인터페이스의
//모든 메소드를 Override해야한다
//5.인터페이스가 인터페이스를 상속받을 수 있으며 이때는 extends를
//사용한다
//6.클래스와는 다르게 다중 구현이 가능하다

interface Fruit{
	String Won = "원";//public static final이 생략
	
	int getPrice();//public이 생략
	public String getName();
}

class FruitImpl implements Fruit{

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "사과";
	}
	
	public String getItems(){
		return "과일";
	}
}

public class Test3 {
	public static void main(String[] args) {
		FruitImpl ob1 = new FruitImpl();
		
		System.out.println(ob1.getItems());
		System.out.println(ob1.getName());
		System.out.println(ob1.getPrice() + Fruit.Won);
		
		Fruit ob2 = ob1;
		
		System.out.println(ob2.getName());
		//System.out.println(ob2.getItems());
	}
}
