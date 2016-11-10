package com.class1;
//20161020
class subClass {

	int a,b;//instance 변수
	
}

public class Test1 {

	public static void main(String[] args) {
		subClass ob1 = new subClass();
		subClass ob2 = new subClass();
		
		ob1.a = 10;
		ob1.b = 20;
		System.out.println("ob1.a: "+ob1.a);//10
		System.out.println("ob1.b: "+ob1.b);//20
		
		//지역변수는 초기화하지 않으면 사용불가
		//인스턴스변수는 초기화하지 않은경우 0으로 초기화됨
		System.out.println("ob2.a: "+ob2.a);//0
		System.out.println("ob2.b: "+ob2.b);//0
		
		ob2.a = 100;
		ob2.b = 200;
		System.out.println("ob2.a: "+ob2.a);//100
		System.out.println("ob2.b: "+ob2.b);//200
		
		System.out.println("ob1.a: "+ob1.a);//10
		System.out.println("ob2.a: "+ob2.a);//100
	}

}
