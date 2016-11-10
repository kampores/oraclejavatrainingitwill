package com.class4;

class SuperC{
	protected int a=10, b=20;
	
	public void write(){
		System.out.println("Super Class write()...");
		System.out.println("a: " + a + ", b: " + b);
	}
}

class Demo extends SuperC{
	protected int b=30, c=40;
	
	@Override
	public void write() {
		System.out.println("Demo Class write()...");
		System.out.println("a: " + a + ", b: " + b + ", c: " + c);
	}
	
	public void print1(){
		System.out.println("Demo Class print1 : write()호출");
		write();
	}

	public void print2(){
		System.out.println("Demo Class print2 : SuperC write()호출");
		super.write();
	}

}

public class Test5 {

	public static void main(String[] args) {

		Demo ob = new Demo();
		
		ob.write();//10,30,40
		ob.print1();
		ob.print2();//4. 내꺼는 내꺼다
		
		System.out.println("ob.b: " + ob.b);//30
		System.out.println("((SuperC)ob).b: " + ((SuperC)ob).b);//20 //upcast
		
		((SuperC)ob).write();//upcast
		
		/*
		int a=10;
		double b;
		
		b=a; 		--0
		b=(double)a;--0
		
		b=2.5;
		a=b; 		--x
		a=(int)b 	--0
		--------------------------
		부모-자식
		
		부모=자식		--0
		부모=(부모)자식	--0(UPCAST)
		
		자식=부모		--x
		자식=(자식)부모	--0(DOWNCAST)
		*/
		
		
	}

}
