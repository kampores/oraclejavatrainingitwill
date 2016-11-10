package com.awt2;
//20161107
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//java.util.regex
//정규화 표현식을 다루기 위한 클래스
//용도: 단어치환, 메일주소 검사, 파일에서 제어문자 제거, 검색
/*
c[a-z]* : c로 시작하는 영단어(c,ca,caaa)
c[a-z]  : c로 시작하는 두글자의 영단어(ca,cb)
c[a-zA-Z0-9] : ca,cA,c4 ...
c.  : c로 시작하는 두글자(ca,cB,c&)
c.* : c로 시작하는 모든 문자(caaa,c45f)
c.*t: ct,chhht,c77777t
[b|c].* 또는 [^bc].* 또는 [^b-c].* : b 또는 c로 시작하지 않는 문자
.*c.* : c가 포함된 모든 문자열

[\\d]+ 또는 [0-9]+ : 하나 이상의 숫자
 
 */
public class Test7 {
	public static void main(String[] args) {
		String[] str = {"bat","baby","bonus","c","cA","ca","c.","c0",
				"car","combat","count","date","disc"};
		Pattern p;
		
		//c로 시작하는 한 문자 이상
		p = Pattern.compile("c[a-z]*");
		for (String s : str) {
			Matcher m = p.matcher(s);
			if(m.matches())
				System.out.println(s);
		}

		System.out.println("------------------------------------");
		//c로 시작하는 두문자 이상
		p = Pattern.compile("c[a-z]+");
		//p = Pattern.compile("c[^a]+");
		for (String s : str) {
			Matcher m = p.matcher(s);
			if(m.matches())
				System.out.println(s);
		}
		
		System.out.println("------------------------------------");
		//c로 시작하는 두문자 이상
		p = Pattern.compile("c.");
		for (String s : str) {
			Matcher m = p.matcher(s);
			if(m.matches())
				System.out.println(s);
		}

		//메일 확인
		String[] mails = {"aaa@aaa.com","@aaaa.co.kr",".@bbb.com",
				"aaa@bbb.co.kr","aaa.co.kr","abc@abc"};
		
		//[\\w]+ : 한글자 이상의 영,숫자
		//@
		//(\\.[\\w]+) : 괄호안에 있는것은 반드시 한번은 사용
		
		String pat = "[\\w]+@[\\w]+(\\.[\\w]+)+";//<- +는 여러번
		
		for (String s : mails) 
			if(Pattern.matches(pat, s))
				System.out.println(s);
	}
}
