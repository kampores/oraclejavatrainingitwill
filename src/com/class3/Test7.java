package com.class3;
//20161024
public class Test7 {
	public static void main(String[] args) {
		String s1 = "서울,부산,대구";
		String[] ss = s1.split(",");
		for(String s : ss)
			System.out.print(s + " ");
		System.out.println();
		
		String s2 = "seoul";
		String s3 = "SeOuL";
		
		System.out.println(s2.equals(s3));//false
		System.out.println(s2.equalsIgnoreCase(s3));//true
		
		String s4 = "abc.def.ghi";
		System.out.println(s4.indexOf("."));//3
		System.out.println(s4.lastIndexOf("."));//7
		System.out.println(s4.indexOf("def"));//4
		System.out.println(s4.indexOf("x"));//-1
		
		String s5 = "우리나라 대한민국 좋은나라 대한민국";
		
		String s6 = s5.replaceAll("대한","大韓");
		System.out.println(s6);
		
		String s7 = "  a  b  c  ";
		System.out.println(s7);
		System.out.println(s7.trim());//문장앞뒤공백제거
		System.out.println(s7.replaceAll(" ", ""));
		System.out.println(s7.replaceAll("\\s", ""));// \\s:공백
		
		char ch = "abcdefg".charAt(2);
		System.out.println(ch);//c
		
		System.out.println("abcdefg".startsWith("abc"));
		System.out.println("자바프로그램".startsWith("자바"));
		
		System.out.println("abcdefg".length());//7
		
		String s8 = "abcdefg";//e아스키코드 : 101
		String s9 = "abcdffg";//f아스키코드 : 102
		
		//사전식정렬
		System.out.println(s8.compareTo(s9));//-1
		System.out.println(s9.compareTo(s8));//1
		
	}
}
