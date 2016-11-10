package com.class3;
//20161024

//Wrapper 클래스 : 기본데이터를 객체로 사용할 수 있게 해줌
//자바형 자료형
//boolean,byte,char,short,long,float,double

//레퍼런스자료형
//Boolean,Byte,Character,Short,Integer,Long,Float,Double

//자바형 자료형 -> 레퍼런스 자료형 : Auto-Boxing(stack->heap)
//레퍼런스 자료형 -> 자바형 자료형 : Auto-UnBoxing(heap->stack)
public class Test10 {
	public static void main(String[] args) {
		int n1 = 10;
		int n2;
		
		Integer num1;
		Integer num2 = new Integer(20);
		
		num1 = n1;//Auto-Boxing
		n2 = num2;//Auto-Unboxing
		
		System.out.println(n1 + ":" + num1);//10:10
		System.out.println(n2 + ":" + num2);//20:20
	}
}
