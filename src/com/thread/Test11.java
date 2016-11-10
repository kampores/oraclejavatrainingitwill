package com.thread;
//20161101

//스레드 그룹
//스레드를 여러개 만들어서 사용할때 스레드를 그룹지어서 사용
public class Test11 {
	public static void main(String[] args) {
		System.out.println("메인스레드 그룹: " 
				+ Thread.currentThread().getThreadGroup());
		System.out.println("메인: " + Thread.currentThread());
		
		Thread t1 = new Thread();
		System.out.println("t1스레드 그룹: " +
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
