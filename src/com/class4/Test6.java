package com.class4;
//20161025

//final�� Ư¡
//������ final�� ���̸� �ѹ��� �ʱ�ȭ ����
//�޼ҵ忡 final�� ���̸� Override �Ұ�
//Ŭ������ final�� ���̸� ��ӺҰ�
class TestA{
	public static final double PI;
	
	static{
		PI=3.14;
	}
	
	public double area;
	
	public final void write(String title){
		System.out.println(title + ":" + area);
	}
}

public class Test6 extends TestA{
	
	/*@Override
	public void write(String title) {
		super.write(title);
	}*/

	public void circleArea(int r){
		area = (double)r*r*PI;
	}
	
	public static void main(String[] args) {
		Test6 ob = new Test6();
		
		ob.circleArea(10);
		ob.write("��");
		
	}

}
