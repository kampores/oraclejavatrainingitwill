package com.class2;
//20161021
public class Test3 {

	int a=5;
	
	{//�ʱ�ȭ��
		System.out.println("�ʱ�ȭ �� a: "+a);
		a=10;
		System.out.println("�ʱ�ȭ �� a: "+a);
	}
	
	static int b;
	static{//static ��
		b=10;
		System.out.println("static�� b: "+b);
	}
	
	final int c;//�ѹ��� �ʱ�ȭ����(����ÿ� �ʱ�ȭ)
	
	public Test3(){
		System.out.println("������...");
		c=100;
		System.out.println("c: "+c);
	}
	
	public static void main(String[] args) {
		Test3 ob1 = new Test3();
		Test3 ob2 = new Test3();
	}
}
