package com.thread;
//20161101

//������ �׷�
//�����带 ������ ���� ����Ҷ� �����带 �׷���� ���
public class Test11 {
	public static void main(String[] args) {
		System.out.println("���ν����� �׷�: " 
				+ Thread.currentThread().getThreadGroup());
		System.out.println("����: " + Thread.currentThread());
		
		Thread t1 = new Thread();
		System.out.println("t1������ �׷�: " +
				Thread.currentThread().getThreadGroup());
		System.out.println("t1: " + t1);
		System.out.println("-------------------------------");
		
		ThreadGroup tg = new ThreadGroup("sg");
		Thread t2 = new Thread(tg,"t2");
		Thread t3 = new Thread(tg,"t3");
		
		System.out.println("t2"
				+ ": " + t2);
		System.out.println("t3: " + t3);
	}

}
