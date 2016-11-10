package com.generic;
//20161031
import java.util.Scanner;

//5~10자 이내의 문자열을 입력 받아출력하는 프로그램
//영문자만 입력(대소문자구분없음)

class MyAuthenticator{
	public void inputFormat(String str) throws Exception{
		if(str.length()<5||str.length()>10)
			throw new Exception("문자열의 길이는 5~10입니다");
		//65~90,97~122
		for (int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if((ch<65||ch>90)&&(ch<97||ch>122))
				throw new Exception("영문자만 가능합니다");
		}
	}
}

public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		MyAuthenticator auth = new MyAuthenticator();
		
		try {
			System.out.print("문자열?");
			str = sc.next();
			
			auth.inputFormat(str);
			
			System.out.println(str);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
