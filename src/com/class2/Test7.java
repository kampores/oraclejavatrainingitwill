package com.class2;
//20161021
//상속(부모가 자식한테 주는것)
//1. 부모꺼는 내꺼다
//2. private로 선언한것은 상속 불가
//3. protected로 선언한것은 상속 가능
//4. 내꺼는 내꺼다
//5. 부모와 자식이 같은 객체를 가지고 있으면 내꺼쓴다
class ParentClass{
	private String title;
	private int area;
	
	public void set(String title, int area){//메소드
		this.area = area;
		this.title = title;
	}
	
	public void print(){
		System.out.println(title+":"+area);
	}
}

class ChildClass extends ParentClass{
	private int w,h;
	
	public ChildClass(int w, int h){//생성자오버로딩
		this.w = w;
		this.h = h;
	}
	
	public void rectArea(){
		int a = w*h;
		set("사각형", a);//1. 부모꺼는 내꺼다
	}
}

public class Test7 {
	public static void main(String[] args) {
		ChildClass ob = new ChildClass(10, 5);
		
		ob.rectArea();
		ob.print();//1. 부모꺼는 내꺼다
	}
}
