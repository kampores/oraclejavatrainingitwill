package com.day4;

import java.util.Scanner;
//20161017
public class Test7 {

	public static void main(String[] args) {
		//배열
		int[] num = new int [5];
		//int num[] = new int [5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("5개의 정수?");//4 7 6 8 9 		
		
		for(int i=0;i<num.length;i++){
			num[i] = sc.nextInt();
		}
		
		for(int i=0;i<num.length;i++){
			System.out.println("num["+i+"]:"+num[i]);
		}
		
		num[3] = 400;
		System.out.println("num[3]:"+num[3]);
		
		System.out.println("배열의 갯수: "+num.length+"개");
		
		int a;
		a=num[2];
		System.out.println(a);
		sc.close();
		/*
		 [자료형]
		 boolean : 1byte(true/false)
		 
		 정수
		 byte : 1byte(-128~127)
		 short : 2byte
		 int : 4byte
		 long : 8byte
		 
		 10진수:20
		 8진수:016
		 16진수:0x17
		 
		 실수
		 float:4byte(단정도:3.14f)
		 double:8byte(배정도:3.14)
		 
		 문자
		 char : unicode
		 문자상수 : 'a'
		 
		 [연산자]
		 산술연산자
		 +,-,*,/,%,++,--
		 
		 관계연산자
		 >,>=,<,<=,->
		 
		 등가연산자
		 ==,!=
		 
		 논리연산자
		 &&(and),||(or),!(not)
		 
		 비트단위
		 &,|ㅡ,^,~,>>,<<,>>>
		 
		 삼항연산자
		 조건?참일때값:거짓일때값
		 
		 대입연산자
		 
		 =,+=,-=,*=,/=,%=
		
		---------------------------------------
		
		int a=10;
		float b;
		
		b=a;		--암시적형변환(10.0)
		b=(float)a;	--명시적형변환(10.0)
		
		b=2.5;
		
		a=b;		--입력불가
		a=int(b);	--가능(2)
		
		[제어문]
		
		if(조건){ //true일때
			작업
		}
		
		if(조건){
			작업1
		}else{
			작업2
		}
		
		if(조건1){
			작업1
		}else if(조건2){
			작업2
		}else if(조건3){
		}	작업3
		}else{
			작업4
		}
		
		while(조건){
		 	작업
		}
		
		do{
			작업
		}while(조건);
		
		for(시작값;최대값;증가값){
			작업
		}
		
		while(true){
			작업
		}
		
		*/
		
	}
}
