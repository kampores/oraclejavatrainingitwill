package com.class4;
//20161025

//Singleton
//��ü�� ����ؼ� �����ϴ°��� �ƴ϶�
//�ϳ��� ��ü�� �����ؼ� �����ϴ� ���

class Test{
	private static Test ob;
	
	public static Test getInstance(){
		if(ob==null)
			ob = new Test();
		
		return ob;
	}
}
public class Test4 {

	public static void main(String[] args) {
		Test ob1 = Test.getInstance();
		Test ob2 = Test.getInstance();
		
		if(ob1==ob2)
			System.out.println("������ ��ü...");
		else
			System.out.println("�ȵ����� ��ü...");
	}

}
