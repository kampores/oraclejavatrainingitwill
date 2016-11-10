package com.naver;
//20161031
public class MyException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public MyException(String message){
		//super(message);
		System.out.println(message);
	}


}
