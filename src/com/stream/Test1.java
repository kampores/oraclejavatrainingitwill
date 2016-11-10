package com.stream;
//20161102
import java.io.IOException;

//입출력 스트림 -> 스트림은 파이프다
//데이터 입출력시 모든 데이터를 형태와는 관계없이
//일련된 흐름으로 전송하는것

//바이트스트림
//기본입출력 스트림 : in
public class Test1 {
	public static void main(String[] args) throws IOException {
		int data;
		
		System.out.print("문자열 입력[종료:ctrl+z]: ");
		while ((data=System.in.read())!=-1) {
			char ch = (char)data;
			System.out.print(ch);
		}
	}
}
