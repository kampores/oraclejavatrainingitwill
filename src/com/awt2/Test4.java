package com.awt2;
//20161107

//Class클래스
//특정 클래스나 인터페이스에 관한 정보를 검색할 수 있는 메소드를 포함
class Test{
	public void write(){
		System.out.println("테스트...");
	}
}

public class Test4 {
	public static void main(String[] args) {
		try {
			//forName()
			Class c = Class.forName("com.awt2.Test");
			Object ob = c.newInstance();//객체생성
			//Object ob = new Test();
			
			Test t = (Test)ob;

			t.write();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
