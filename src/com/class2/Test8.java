package com.class2;
//20161021
//���(�θ� �ڽ����� �ִ°�)
//1. �θ𲨴� ������
//2. private�� �����Ѱ��� ��� �Ұ�
//3. protected�� �����Ѱ��� ��� ����
//4. ������ ������
//5. �θ�� �ڽ��� ���� ��ü�� ������ ������ ��������
class ParentClassA{
	private String title;
	//private int area;
	protected int area;//3. protected�� �����Ѱ��� ��� ���� //package�� ��밡��(�ϰ�ģô)
	
	public void set(String title){//�޼ҵ�
		this.title = title;
	}
	
	public void print(){
		System.out.println(title+":"+area);
	}
}

class ChildClassA extends ParentClassA{
	private int w,h;
	
	public ChildClassA(int w, int h){//�����ڿ����ε�
		this.w = w;
		this.h = h;
	}
	
	public void rectArea(){
		area = w*h;//3. protected�� �����Ѱ��� ��� ����
		set("�簢��");//1. �θ𲨴� ������
	}
}

public class Test8 {
	public static void main(String[] args) {
		ChildClassA ob = new ChildClassA(10, 5);
		
		ob.rectArea();
		ob.print();//1. �θ𲨴� ������
	}
}
