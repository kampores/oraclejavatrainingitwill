package com.class1;
//20161020
//this:Ŭ����,ME

class Circle{
	
	private int r;//instance����(����������ȭ,ĸ��ȭ)
	
	//�ʱ�ȭ�޼ҵ�
	public void setData(int r){//setData(int r,Circle this);
		this.r = r;
	}
	
	public double area(){//area(Circle this)
		return r*r*3.14;
	}
	
	public void write(double a){//write(double a,Circle this)
		System.out.println("������: "+r);
		System.out.println("����: "+a);
	}
}

public class Test3 {
	
	public static void main(String[] args) {
		Circle ob = new Circle();
		ob.setData(50);			//setData(50,ob);
		double a = ob.area();	//ob.area(ob)
		ob.write(a);			//write(a,ob)
	}

}
