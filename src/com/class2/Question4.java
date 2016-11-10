package com.class2;

import java.io.IOException;
//20161021
//4. 하나의 문자를 입력 받아 대문자이면 소문자, 소문자이면 대문자
//기타 문자이면 입력 받은 문자 출력

class Change{
	
	public char change(char c){
		if((int)c>=65&&(int)c<=90) return (char)(((int)c)+32);
		if((int)c>=97&&(int)c<=122) return (char)(((int)c)-32);
		return c;
	}
}

public class Question4 {
	public static void main(String[] args) throws IOException {
		char c;
		Change ch = new Change();
		
		System.out.print("문자입력?:");
		c = (char)System.in.read();
		System.out.println(ch.change(c));

	}

}
