package com.generic;
//20161031

//예외를 다시 던지는 방법
public class Test6 {
	public void value1(int value) throws Exception{
		try {
			value2(value);
		} catch (Exception e) {
			System.out.println("value1");
			System.out.println(e.toString());
		}
	}

	public void value2(int value) throws Exception {
		if(value<0)
			throw new Exception("0보다 적은수!!");
	}

	public static void main(String[] args) {
		Test6 ob = new Test6();
		
		try {
			ob.value1(10);
		} catch (Exception e) {
			System.out.println("main....");
			System.out.println(e.toString());
		}
	}
}
