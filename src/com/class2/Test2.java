package com.class2;
//20161021
class Rect{
	private int w,h;
	
	public Rect(){}//�⺻������
	
	public Rect(int w, int h){//������ �����ε�
		this.w = w;
		this.h = h;
	}
	
	public void set(int w, int h){//�����ʱ�ȭ�޼ҵ�
		this.w = w;
		this.h = h;
	}
	
	public int area(){//�Ϲݸ޼ҵ�
		return w*h;
	}
	
	public int length(){//�Ϲݸ޼ҵ�
		return (w+h)*2;
	}
	
	public void print(int a){//�Ϲݸ޼ҵ�
		System.out.println("����: "+w+",����: "+h);
		System.out.println("����: "+a);
	}
	
	public void print(int a,int l){//�޼ҵ�����ε�(�ߺ�����)
		System.out.println("����: "+w+",����: "+h);
		System.out.println("����: "+a);
		System.out.println("�ѷ�: "+l);
	}
}

public class Test2 {

	public static void main(String[] args) {
		//�⺻������
		Rect ob1 = new Rect();
		ob1.set(10,20);
		int a = ob1.area();
		int l = ob1.length();
		ob1.print(a);
		ob1.print(a, l);
		
		//�����ε��� ������
		Rect ob2 = new Rect(100,200);
		a = ob2.area();
		l = ob2.length();
		ob2.print(a);
		ob2.print(a, l);
	}
}
