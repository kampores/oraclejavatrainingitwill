package com.class1;
//20161020
class subClass {

	int a,b;//instance ����
	
}

public class Test1 {

	public static void main(String[] args) {
		subClass ob1 = new subClass();
		subClass ob2 = new subClass();
		
		ob1.a = 10;
		ob1.b = 20;
		System.out.println("ob1.a: "+ob1.a);//10
		System.out.println("ob1.b: "+ob1.b);//20
		
		//���������� �ʱ�ȭ���� ������ ���Ұ�
		//�ν��Ͻ������� �ʱ�ȭ���� ������� 0���� �ʱ�ȭ��
		System.out.println("ob2.a: "+ob2.a);//0
		System.out.println("ob2.b: "+ob2.b);//0
		
		ob2.a = 100;
		ob2.b = 200;
		System.out.println("ob2.a: "+ob2.a);//100
		System.out.println("ob2.b: "+ob2.b);//200
		
		System.out.println("ob1.a: "+ob1.a);//10
		System.out.println("ob2.a: "+ob2.a);//100
	}

}
