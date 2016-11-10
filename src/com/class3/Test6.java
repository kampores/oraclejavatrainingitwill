package com.class3;
//20161024
public class Test6 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		sb.append("서울");
		sb.append("부산");
		
		System.out.println(sb);
		
		String str = sb.toString();
		System.out.println(str);
		
		int a=24;
		System.out.println(a);
		System.out.println(Integer.toString(a));//문자로출력
		System.out.println(Integer.toString(a,2));//2진수로 출력
		System.out.println(Integer.toString(a,16));//16진수로 출력
		
	}
}
