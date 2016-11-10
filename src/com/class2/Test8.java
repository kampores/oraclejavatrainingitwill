package com.class2;
//20161021
//상속(부모가 자식한테 주는것)
//1. 부모꺼는 내꺼다
//2. private로 선언한것은 상속 불가
//3. protected로 선언한것은 상속 가능
//4. 내꺼는 내꺼다
//5. 부모와 자식이 같은 객체를 가지고 있으면 내꺼쓴다
class ParentClassA{
	private String title;
	//private int area;
	protected int area;//3. protected로 선언한것은 상속 가능 //package내 사용가능(일가친척)
	
	public void set(String title){//메소드
		this.title = title;
	}
	
	public void print(){
		System.out.println(title+":"+area);
	}
}

class ChildClassA extends ParentClassA{
	private int w,h;
	
	public ChildClassA(int w, int h){//생성자오버로딩
		this.w = w;
		this.h = h;
	}
	
	public void rectArea(){
		area = w*h;//3. protected로 선언한것은 상속 가능
		set("사각형");//1. 부모꺼는 내꺼다
	}
}

public class Test8 {
	public static void main(String[] args) {
		ChildClassA ob = new ChildClassA(10, 5);
		
		ob.rectArea();
		ob.print();//1. 부모꺼는 내꺼다
	}
}
