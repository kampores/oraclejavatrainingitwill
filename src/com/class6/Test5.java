package com.class6;
//20161027
import java.util.Vector;

//Collection Framework(�����)
//List(I)-ArrayList(C):�񵿱�,Vector(C):����
//Map(I)-HashTable(C):�񵿱�,HashMap(C):����

//�ڷ���-�迭
//����
//Resize�� �Ұ���
//�޸𸮳���
//�߰������� �Ұ���
public class Test5 {
	//Collection�� �ڷ����� �⺻ Object�̴�
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("����");//upcast
		v.add(30);
		v.add('A');
		
		String str = (String) v.get(0);//downcast
		System.out.println(str);
		
		Integer i = (Integer) v.get(1);
		System.out.println(i);
		
		char c = (char) v.get(2);
		System.out.println(c);		
	}
}
