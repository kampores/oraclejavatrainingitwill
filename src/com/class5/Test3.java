package com.class5;
//20161026

//Interface
//1.�߻�Ŭ������ �������� �����ְ� ���ǰ� ����
//2.final������ ������ �� �ִ�
//3.�������̽��� �����ϱ� ���ؼ��� implements�� ����Ѵ�
//4.�ϳ��̻��� �������̽��� implements�� Ŭ������ �������̽���
//��� �޼ҵ带 Override�ؾ��Ѵ�
//5.�������̽��� �������̽��� ��ӹ��� �� ������ �̶��� extends��
//����Ѵ�
//6.Ŭ�����ʹ� �ٸ��� ���� ������ �����ϴ�

interface Fruit{
	String Won = "��";//public static final�� ����
	
	int getPrice();//public�� ����
	public String getName();
}

class FruitImpl implements Fruit{

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "���";
	}
	
	public String getItems(){
		return "����";
	}
}

public class Test3 {
	public static void main(String[] args) {
		FruitImpl ob1 = new FruitImpl();
		
		System.out.println(ob1.getItems());
		System.out.println(ob1.getName());
		System.out.println(ob1.getPrice() + Fruit.Won);
		
		Fruit ob2 = ob1;
		
		System.out.println(ob2.getName());
		//System.out.println(ob2.getItems());
	}
}
