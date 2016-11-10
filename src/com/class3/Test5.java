package com.class3;
//20161024

//StringBuffer : ����-����ȭ��������
//StringBuilder : ����-����ȭ��������
public class Test5 {
	public void stringTime(){
		System.out.println("String....");
		//long start = System.currentTimeMillis();
		long start = System.nanoTime();
		
		String str = "a";
		for(int i=1;i<=50000;i++)
			str+="a";
		
		long end = System.nanoTime();
		System.out.println("����ð�: " + (end - start) + "ns");
	}

	public void stringBufferTime(){
		System.out.println("StringBuffer....");
		//long start = System.currentTimeMillis();
		long start = System.nanoTime();
		
		StringBuffer str = new StringBuffer("a");
		for(int i=1;i<=50000;i++)
			str.append("a");
		
		long end = System.nanoTime();
		System.out.println("����ð�: " + (end - start) + "ns");
	}
		
	public void stringBuilderTime(){
		System.out.println("StringBuilder....");
		//long start = System.currentTimeMillis();
		long start = System.nanoTime();
		
		StringBuilder str = new StringBuilder("a");
		for(int i=1;i<=50000;i++)
			str.append("a");
		
		long end = System.nanoTime();
		System.out.println("����ð�: " + (end - start) + "ns");
	}

	public static void main(String[] args) {
		Test5 ob = new Test5();
		
		ob.stringTime();
		ob.stringBufferTime();
		ob.stringBuilderTime();
	}
}
