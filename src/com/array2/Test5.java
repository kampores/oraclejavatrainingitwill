package com.array2;
//20161019
public class Test5 {

	public static void main(String[] args) {
		//class
		//ĭ����: method(��)
		//����������: public, private
		//��ȯ��(int,float,double,String..)(void)
		//�Ű�����(�ڷ���)
		//��������,��������
		
		Rect ob = new Rect();
		Rect ob1 = new Rect();
		
		ob.input();
		int a = ob.area();
		int l = ob.length();
		ob.print(a,l);

		ob1.input();
		a = ob1.area();
		l = ob1.length();
		ob1.print(a, l);
		
		System.out.println("ob.w: "+ob.w);
		System.out.println("ob1.h: "+ob.h);
	}
}
