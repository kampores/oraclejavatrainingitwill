package com.class1;
//20161020
//this:클래스,ME

class Circle{
	
	private int r;//instance변수(정보의은닉화,캡슐화)
	
	//초기화메소드
	public void setData(int r){//setData(int r,Circle this);
		this.r = r;
	}
	
	public double area(){//area(Circle this)
		return r*r*3.14;
	}
	
	public void write(double a){//write(double a,Circle this)
		System.out.println("반지름: "+r);
		System.out.println("넓이: "+a);
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
