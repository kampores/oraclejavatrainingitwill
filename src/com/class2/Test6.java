package com.class2;

import java.util.Calendar;

//20161021
//Call By Value
//stack������ �����Ͱ� heap�������� �Ѿ�� ����Ǵ°�

//Call By Reference
//heap������ �����Ͱ� stack�������� �Ѿ���°��� �ƴ϶� �ּҸ� �Ѿ

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
		System.out.println("sub()�޼ҵ� ������ x: "+ob1.x);//10
		ob1.sub(a);
		System.out.println("sub()�޼ҵ� ������ x: "+ob1.x);//30
		
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
