package com.class1;
//20161020
//static
//객체를 생성하지 않아도 자기가 알아서 메모리에 올라감(메모리할당)
//객체를 1000번 생성해도 메모리공간은 1개만 만들고 공유한다

public class Test4 {

	public static int a = 10; //class변수
	//클래스변수 또는 클래스메소드는 클래스가 로딩되는순간
	//메모리 할당이 이루어진다
	//접근방법은 [클래스의이름.변수의이름]으로 접근 가능하다
	//즉,new를 통해서 메모리할당을 받지 않아도 사용가능하다
	
	public int b = 20; //instance변수
	//instance변수는 new를 통해서 메모리할당을 받아야만 사용가능하다
	//객체이름을 통해서 접근이 가능하다
	//클래스메소드에서는 접근불가능하다
	
	public void write(){//instance메소드
		System.out.println("(write메소드)class 변수 a: "+a);
		System.out.println("(write메소드)instance 변수 b: "+b);
	}
	
	public static void print(){//class메소드
		System.out.println("(static print메소드)class 변수 a: "+a);
		//System.out.println("instance 변수 b: "+b);//에러		
	}
	
	public static void main(String[] args) {
		System.out.println("class변수 a: "+a);//10
		//System.out.println("instance 변수 b: "+b);
		System.out.println("class변수 Test4.a: "+Test4.a);
		
		//write();
		print();
		
		Test4 ob = new Test4();//메모리 할당
		
		System.out.println("instance 변수 ob.b: "+ob.b);//20
		System.out.println("class변수 a:"+a);
		System.out.println("class변수 ob.a:"+ob.a);
		
		ob.write();
		ob.print();
		Test4.print();
		
		Test4 ob1 = new Test4();
		Test4 ob2 = new Test4();
		
		System.out.println("ob.a:"+ob.a);//10
		System.out.println("ob.b:"+ob.b);//20
		System.out.println("ob1.a:"+ob1.a);//10
		System.out.println("ob1.b:"+ob1.b);//20
		System.out.println("ob2.a:"+ob2.a);//10
		System.out.println("ob2.b:"+ob2.b);//20
		
		System.out.println("---------------");
		ob1.a=100;
		ob1.b=200;
		
		System.out.println("ob.a:"+ob.a);//100
		System.out.println("ob.b:"+ob.b);//20
		System.out.println("ob1.a:"+ob1.a);//100
		System.out.println("ob1.b:"+ob1.b);//20
		System.out.println("ob2.a:"+ob2.a);//100
		System.out.println("ob2.b:"+ob2.b);//20
		
	}
	
}
