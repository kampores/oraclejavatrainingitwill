package com.class4;
//20161025

//Singleton
//객체를 계속해서 생성하는것이 아니라
//하나의 객체만 생성해서 공유하는 방법

class Test{
	private static Test ob;
	
	public static Test getInstance(){
		if(ob==null)
			ob = new Test();
		
		return ob;
	}
}
public class Test4 {

	public static void main(String[] args) {
		Test ob1 = Test.getInstance();
		Test ob2 = Test.getInstance();
		
		if(ob1==ob2)
			System.out.println("동일한 객체...");
		else
			System.out.println("안동일한 객체...");
	}

}
