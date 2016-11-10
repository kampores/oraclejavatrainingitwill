package com.thread;
//20161101

//인터럽트
//우선순위가 높은 프로그램을 먼저 실행시키고 다시 돌아옴

//세수->밥->교육원
//세수->전화->택배->밥->교육원

class MyThread7 extends Thread{
	private Thread next;
	
	public void setNext(Thread next){
		this.next = next;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=20;i++){
			try {
				sleep(2000);
			} catch (Exception e) {
				//e.printStackTrace(); //잠자고 있는 스레드를 강제로 깨웠기 때문에 에러메시지 출력(?)
			}
			
			System.out.println(getName() + ":" + i);
			
			//실제 코딩 내용은 스레드가 살아있으면 중지시키는 코딩
			//현재 스레드가 중지되면 다음 스레드가 자동으로 시작됨
			if(next.isAlive())
				next.interrupt();
			
		}
	}
}

public class Test7 {
	public static void main(String[] args) {
		MyThread7 t1 = new MyThread7();
		MyThread7 t2 = new MyThread7();
		MyThread7 t3 = new MyThread7();
		
		t1.setNext(t2);//t1다음이 t2
		t2.setNext(t3);//t2다음이 t3
		t3.setNext(t1);//t3다음이 t1
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.interrupt();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("main 종료...");
	}
}

