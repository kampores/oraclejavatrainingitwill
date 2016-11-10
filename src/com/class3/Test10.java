package com.class3;
//20161024

//Wrapper Ŭ���� : �⺻�����͸� ��ü�� ����� �� �ְ� ����
//�ڹ��� �ڷ���
//boolean,byte,char,short,long,float,double

//���۷����ڷ���
//Boolean,Byte,Character,Short,Integer,Long,Float,Double

//�ڹ��� �ڷ��� -> ���۷��� �ڷ��� : Auto-Boxing(stack->heap)
//���۷��� �ڷ��� -> �ڹ��� �ڷ��� : Auto-UnBoxing(heap->stack)
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
