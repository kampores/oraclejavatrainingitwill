package com.class2;

//20161021
//������
//instance������ �ʱ�ȭ�� �������� ���
//�޸� �Ҵ��� ������ ���

//�������� �̸��� Ŭ������ �̸��� ����
//���ϰ��� ���⶧���� property�� ����
//�����ڴ� overloading(�ߺ�����)�� �����ϴ�
//�����ڿ��� �����ڸ� ȣ�� �����ϴ�
//��, ȣ��� �ڵ� ���� ���ο����� �����ϴ� 

public class Test1 {
	private int x;

	public Test1(){
		System.out.println("�⺻������...");
		x = 10;
		System.out.println("x: "+x);
	}
	//public Test1(){}
	
	public Test1(int x){
		this();//Test1(); //������ ȣ���� ���ο����� ����
		
		System.out.println("������ �����ε�...");
		this.x = x;
		System.out.println("x: "+x);
	}
	
	public static void main(String[] args) {
		Test1 ob = new Test1();
		
		Test1 ob1 = new Test1(100);
	}
}
