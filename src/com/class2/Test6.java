package com.class2;

import java.util.Calendar;

//20161021
//Call By Value
//stack영역의 데이터가 heap영역으로 넘어가서 연산되는것

//Call By Reference
//heap영역의 데이터가 stack영역으로 넘어오는것이 아니라 주소만 넘어감

class Test{
	public int x =10;
	
	public void sub(int a){
		x+=a;
	}
	
}

public class Test6 {

	public static void main(String[] args) {
		Test ob1 = new Test();
		int a=20;
		
		//Call by value
		System.out.println("sub()메소드 실행전 x: "+ob1.x);//10
		ob1.sub(a);
		System.out.println("sub()메소드 실행후 x: "+ob1.x);//30
		
		//Call by reference
		int k = 10;
		int j;
		
		j=k;
		Test ob2;
		ob2 = ob1;
		
		System.out.println(ob1.x);//30
		System.out.println(ob2.x);//30
		
		Calendar now1 = Calendar.getInstance();
		
	}

}
