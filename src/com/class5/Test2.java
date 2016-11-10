package com.class5;
//20161026

//Upcast
//��ĳ���õ����� �ν��Ͻ������� ����(�θ�)���� ǥ��
//�޼ҵ�� �ڽ��� �޼ҵ带 ����Ѵ�
//����Ŭ������ ����ȯ�� �ϴ°�
//���������� ������ ���
//�����Ϸ��� �ڵ����� ����ȯ

//Downcast
//����Ŭ������ ����ȯ
//���������� ������ Ȯ��
//�ڵ�����ȯ�� �ȵȴ�

class SuperTest{
	public int a=10,b=20;
	
	public void write(){
		System.out.println("����Ŭ���� write()�޼ҵ�...");
	}
	
	public int hap(){
		return a+b;
	}
}

class SubTest extends SuperTest{
	public int b=100,c=200;
	
	public void print(){
		System.out.println("����Ŭ���� print()�޼ҵ�...");
	}
	
	@Override
	public int hap() {
		return a+b+c;
	}
}

public class Test2 {
	public static void main(String[] args) {
		SubTest ob1 = new SubTest();
		
		System.out.println("ob1.b: " + ob1.b);//100
		
		//SuperTest ob2 = (SuperTest)ob1;
		SuperTest ob2 = ob1;//Upcast
		
		System.out.println("ob2.b: " + ob2.b);//20
		//------------------------------------------
		System.out.println("��: " + ob2.hap());//310
		
		ob2.write();
		//ob2.print();
		((SubTest)ob2).print();//Downcast
	}
}
/*
1.������ü����
����=���� : ��ĳ��Ʈ
����=���� : X
����=(����)���� : �ٿ�ĳ��Ʈ

2.������ü����
����=(����)���� : �ٿ�ĳ��Ʈ
������ü�� �����������
*/