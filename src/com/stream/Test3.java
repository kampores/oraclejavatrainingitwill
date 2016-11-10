package com.stream;
//20161102
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

//InputStreamReader
//1byte의 stream을 2byte stream으로 변환해주는 stream
//브릿지스트림
public class Test3 {
	public static void main(String[] args) throws IOException {
		int data;
		
		System.out.print("문자열 입력[종료:ctrl+z]: ");
		Reader rd = new InputStreamReader(System.in);
		while((data=rd.read())!=-1){
			char ch = (char)data;
			System.out.print(ch);
		}
	}
}
