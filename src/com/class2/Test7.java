package com.class2;
//20161021
//���(�θ� �ڽ����� �ִ°�)
//1. �θ𲨴� ������
//2. private�� �����Ѱ��� ��� �Ұ�
//3. protected�� �����Ѱ��� ��� ����
//4. ������ ������
//5. �θ�� �ڽ��� ���� ��ü�� ������ ������ ��������
class ParentClass{
	private String title;
	private int area;
	
	public void set(String title, int area){//�޼ҵ�
		this.area = area;
		this.title = title;
	}
	
	public void print(){
		System.out.println(title+":"+area);
	}
}

class ChildClass extends ParentClass{
	private int w,h;
	
	public ChildClass(int w, int h){//�����ڿ����ε�
		this.w = w;
		this.h = h;
	}
	
	public void rectArea(){
		int a = w*h;
		set("�簢��", a);//1. �θ𲨴� ������
	}
}

public class Test7 {
	public static void main(String[] args) {
		ChildClass ob = new ChildClass(10, 5);
		
		ob.rectArea();
		ob.print();//1. �θ𲨴� ������
	}
}
