package com.awt2;
//20161107

//ClassŬ����
//Ư�� Ŭ������ �������̽��� ���� ������ �˻��� �� �ִ� �޼ҵ带 ����
class Test{
	public void write(){
		System.out.println("�׽�Ʈ...");
	}
}

public class Test4 {
	public static void main(String[] args) {
		try {
			//forName()
			Class c = Class.forName("com.awt2.Test");
			Object ob = c.newInstance();//��ü����
			//Object ob = new Test();
			
			Test t = (Test)ob;

			t.write();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
