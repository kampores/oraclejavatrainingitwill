package com.class3;
//20161024
class SuperC{
	private int a = 10;
	
	public void write(){
		System.out.println("a: " + a);
	}
}
//��� Ŭ������ ������ Object�̴�
//��� Ŭ������ Object�� ��ӹ޾Ҵ�
public class Test3 {
	public static void main(String[] args) {
		SuperC ob1 = new SuperC();
		SuperC ob2 = new SuperC();
		
		System.out.println("ob1==ob2: " + (ob1==ob2));//false
		System.out.println("ob1.equals(ob2): " + ob1.equals(ob2));//false //equals�� object�� �޼ҵ�
		//hashcode
		System.out.println("ob1: " + ob1);//com.class3.SuperC@15db9742
		System.out.println("ob2: " + ob2);//com.class3.SuperC@6d06d69c
		
		System.out.println(ob1.toString());//com.class3.SuperC@15db9742 //toString�� object�� �޼ҵ�
	}
}
