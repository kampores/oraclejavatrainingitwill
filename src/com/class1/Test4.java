package com.class1;
//20161020
//static
//��ü�� �������� �ʾƵ� �ڱⰡ �˾Ƽ� �޸𸮿� �ö�(�޸��Ҵ�)
//��ü�� 1000�� �����ص� �޸𸮰����� 1���� ����� �����Ѵ�

public class Test4 {

	public static int a = 10; //class����
	//Ŭ�������� �Ǵ� Ŭ�����޼ҵ�� Ŭ������ �ε��Ǵ¼���
	//�޸� �Ҵ��� �̷������
	//���ٹ���� [Ŭ�������̸�.�������̸�]���� ���� �����ϴ�
	//��,new�� ���ؼ� �޸��Ҵ��� ���� �ʾƵ� ��밡���ϴ�
	
	public int b = 20; //instance����
	//instance������ new�� ���ؼ� �޸��Ҵ��� �޾ƾ߸� ��밡���ϴ�
	//��ü�̸��� ���ؼ� ������ �����ϴ�
	//Ŭ�����޼ҵ忡���� ���ٺҰ����ϴ�
	
	public void write(){//instance�޼ҵ�
		System.out.println("(write�޼ҵ�)class ���� a: "+a);
		System.out.println("(write�޼ҵ�)instance ���� b: "+b);
	}
	
	public static void print(){//class�޼ҵ�
		System.out.println("(static print�޼ҵ�)class ���� a: "+a);
		//System.out.println("instance ���� b: "+b);//����		
	}
	
	public static void main(String[] args) {
		System.out.println("class���� a: "+a);//10
		//System.out.println("instance ���� b: "+b);
		System.out.println("class���� Test4.a: "+Test4.a);
		
		//write();
		print();
		
		Test4 ob = new Test4();//�޸� �Ҵ�
		
		System.out.println("instance ���� ob.b: "+ob.b);//20
		System.out.println("class���� a:"+a);
		System.out.println("class���� ob.a:"+ob.a);
		
		ob.write();
		ob.print();
		Test4.print();
		
		Test4 ob1 = new Test4();
		Test4 ob2 = new Test4();
		
		System.out.println("ob.a:"+ob.a);//10
		System.out.println("ob.b:"+ob.b);//20
		System.out.println("ob1.a:"+ob1.a);//10
		System.out.println("ob1.b:"+ob1.b);//20
		System.out.println("ob2.a:"+ob2.a);//10
		System.out.println("ob2.b:"+ob2.b);//20
		
		System.out.println("---------------");
		ob1.a=100;
		ob1.b=200;
		
		System.out.println("ob.a:"+ob.a);//100
		System.out.println("ob.b:"+ob.b);//20
		System.out.println("ob1.a:"+ob1.a);//100
		System.out.println("ob1.b:"+ob1.b);//20
		System.out.println("ob2.a:"+ob2.a);//100
		System.out.println("ob2.b:"+ob2.b);//20
		
	}
	
}
