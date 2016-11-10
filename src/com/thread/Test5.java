package com.thread;
//20161101

//���󽺷���
//�ٸ� �����忡 ������ �ִ� ������� �ٸ������尡
//����Ǹ� ���󽺷��尡 ������� ���� ���¶� ���μ����� ����

class MyThread5 implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=200;i++)
			System.out.println(i);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

public class Test5 {
	public static void main(String[] args) {
		System.out.println("main start......");
		
		Thread t1 = new Thread(new MyThread5());
		Thread t2 = new Thread(new MyThread5());
		Thread t3 = new Thread(new MyThread5());
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			t1.join();//�����尡 ����ɶ����� main������ ��ٷ���
			t2.join();
			t3.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("main end......");
	}
}
