package com.class6;
//20161027

//4.내부클래스(Anonymous,익명,무명의 클래스)
public class Test4 {
	public Object getTitle(){
		//코딩
		return new Object(){
			@Override
			public String toString() {
				return "익명의 클래스!";
			}
		};
	}

	public static void main(String[] args) {
		Test4 ob = new Test4();
		
		System.out.println(ob.getTitle());
	}
}
