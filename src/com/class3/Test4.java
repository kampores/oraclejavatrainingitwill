package com.class3;
//20161024

//String : String�� Ŭ����(�ڷ����� �ƴ�)
//������ �����ʹ� ũ�� ���󵵴� ���⶧����
//String�� �Һ��� ��Ģ�� �������ִ�
public class Test4 {

	public static void main(String[] args) {
		String ob1 = "Seoul";
		String ob2 = "Seoul";
		String ob3 = new String("Seoul");
		
		System.out.println("ob1==ob2: " + (ob1==ob2));//true : Heap�� "Seoul"�� �߰��� ������ ����
		System.out.println("ob1==ob3: " + (ob1==ob3));//false
		System.out.println("ob1.equals(ob3): " + ob1.equals(ob3));//true
		
		ob2 = "korea";
		System.out.println("ob1==ob2: " + (ob1==ob2));//false : Heap�� "korea"�� ����� ����(String�� Heap�� ��������)
		
		ob2 = "USA";
		System.out.println("ob1==ob2: " + (ob1==ob2));//false : Heap�� "USA"�� ����� ����("korea"�� �����Ⱚ���� ����. Garbage Collector�� �˾Ƽ� ó��)
		
		ob2 = "japan";
		System.out.println("ob1==ob2: " + (ob1==ob2));//false : Heap�� "japan"�� ����� ����("USA"�� �����Ⱚ���� ����. Garbage Collector�� �˾Ƽ� ó��)
		
		ob2 = "Seoul";
		System.out.println("ob1==ob2: " + (ob1==ob2));//true : Heap�� ���� "Seoul"�� ������ �ʰ� �ִ� "Seoul"�� ����
		
		System.out.println(ob1);//Seoul
		System.out.println(ob1.toString());//Seoul
		
		int a = 10;
		System.out.println(a);
	}

}
