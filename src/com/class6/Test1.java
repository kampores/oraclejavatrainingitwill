package com.class6;
//20161027

//1.����Ŭ����(Inner)
//Ŭ�����ȿ� Ŭ������ ��

class Outer{
	static int a=10;
	int b=20;
	
	public class Inner{//����Ŭ����(Outer$Inner.class)
		int c=30;
		
		public void write(){
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
	}
	
	public void print() {
		Inner ob = new Inner();
		ob.write();
	}
}

public class Test1 {
	public static void main(String[] args) {
		Outer out = new Outer();//�ܺ�Ŭ���� ��ü����
		out.print();
		
		Outer.Inner inner = out.new Inner();//����Ŭ���� ��ü����
		inner.write();
	}
}
