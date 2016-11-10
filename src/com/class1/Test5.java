package com.class1;
//20161020
class Rect{
	
	private int w,h;
	
	public void set(int w,int h){//�ʱ�ȭ �޼ҵ�
		this.w = w;
		this.h = h;
	}
	
	public int area(){
		return w*h;
	}
	
	public int length(){
		return (w+h)*2;
	}
	
	public void print(int a, int l){
		System.out.println("����: "+w);
		System.out.println("����: "+h);
		System.out.println("����: "+a);
		System.out.println("�ѷ�: "+l);
	}

	//Overloading(�޼ҵ� �ߺ�����)
	//�޼ҵ��� �̸��� ���������� ��ȣ�ȿ�(�Ű�����)�ִ�
	//�μ��� ������ ������ Ÿ���� �ٸ��� �ٸ� �޼ҵ�� �νĵȴ�
	//���ϼ����ؼ� �ۼ�
	public void print(){
		System.out.println("����: "+w);
		System.out.println("����: "+h);
	}
	
	public void print(int a){
		System.out.println("����: "+w);
		System.out.println("����: "+h);
		System.out.println("����: "+a);
	}
	
	public void print(double l){
		System.out.println("����: "+w);
		System.out.println("����: "+h);
		System.out.println("�ѷ�: "+(int)l);
	}
}

public class Test5 {
	public static void main(String[] args) {
		Rect ob = new Rect();
		
		ob.set(10, 20);
		int a = ob.area();
		int l = ob.length();
		
		ob.print();
		ob.print(a);
		ob.print(a, l);
		ob.print((double)l);
	}
}
