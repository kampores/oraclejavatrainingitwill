package com.awt2;
//20161107
import java.lang.reflect.Method;

class Exam{
	public Integer hap(Integer a, Integer b){
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public void write(String title, int result){
		System.out.println(title + ":" + result);
	}
}

public class Test6 {
	public static void main(String[] args) {
		try {
			//Ŭ������ ����
			Class cls = Class.forName("com.awt2.Exam");
			
			//��ü����
			Object ob = cls.newInstance();//newInstance�� new���� �ڿ��� ������
			
			//Exam Ŭ������ �޼ҵ� ����
			Method hap = cls.getDeclaredMethod("hap", new Class[]{Integer.class, Integer.class});
			Method sub = cls.getDeclaredMethod("sub", new Class[]{int.class, int.class});
			Method write = cls.getDeclaredMethod("write", new Class[]{String.class, int.class});
			
			//�μ��� ���� �޼ҵ�
			//Method m = cls.getDeclaredMethod("write", null);
			
			//�޼ҵ� ȣ��(invoke)
			Object h = hap.invoke(ob, new Object[]{20,10});
			write.invoke(ob, new Object[]{"��", h});
			
			Integer i = (Integer)sub.invoke(ob, new Object[]{20,10});
			write.invoke(ob, new Object[]{"��", i});
			
			//�μ��� ���°��
			//write.invoke(ob, null);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
