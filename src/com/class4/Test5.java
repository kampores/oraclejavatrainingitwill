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
		System.out.println("Demo Class print1 : write()ȣ��");
		write();
	}

	public void print2(){
		System.out.println("Demo Class print2 : SuperC write()ȣ��");
		super.write();
	}

}

public class Test5 {

	public static void main(String[] args) {

		Demo ob = new Demo();
		
		ob.write();//10,30,40
		ob.print1();
		ob.print2();//4. ������ ������
		
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
		�θ�-�ڽ�
		
		�θ�=�ڽ�		--0
		�θ�=(�θ�)�ڽ�	--0(UPCAST)
		
		�ڽ�=�θ�		--x
		�ڽ�=(�ڽ�)�θ�	--0(DOWNCAST)
		*/
		
		
	}

}
