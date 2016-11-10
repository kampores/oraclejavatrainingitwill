package com.class5;
//20161026

//Upcast
//업캐스팅됐을때 인스턴스변수는 상위(부모)값을 표시
//메소드는 자신의 메소드를 사용한다
//슈퍼클래스로 형변환을 하는것
//참조가능한 영역이 축소
//컴파일러가 자동으로 형변환

//Downcast
//서브클래스로 형변환
//참조가능한 영역이 확대
//자동형변환이 안된다

class SuperTest{
	public int a=10,b=20;
	
	public void write(){
		System.out.println("슈퍼클래스 write()메소드...");
	}
	
	public int hap(){
		return a+b;
	}
}

class SubTest extends SuperTest{
	public int b=100,c=200;
	
	public void print(){
		System.out.println("서브클래스 print()메소드...");
	}
	
	@Override
	public int hap() {
		return a+b+c;
	}
}

public class Test2 {
	public static void main(String[] args) {
		SubTest ob1 = new SubTest();
		
		System.out.println("ob1.b: " + ob1.b);//100
		
		//SuperTest ob2 = (SuperTest)ob1;
		SuperTest ob2 = ob1;//Upcast
		
		System.out.println("ob2.b: " + ob2.b);//20
		//------------------------------------------
		System.out.println("합: " + ob2.hap());//310
		
		ob2.write();
		//ob2.print();
		((SubTest)ob2).print();//Downcast
	}
}
/*
1.하위객체생성
상위=하위 : 업캐스트
하위=상위 : X
하위=(하위)상위 : 다운캐스트

2.상위객체생성
하위=(하위)상위 : 다운캐스트
하위객체를 사용하지못함
*/