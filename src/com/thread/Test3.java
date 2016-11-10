package com.thread;
//20161101
import java.util.Calendar;

//현재 시스템의 날자와 시간을 1초마다 출력

class TClock implements Runnable {

	@Override
	public void run() {
		while (true) {
			//Calendar now = Calendar.getInstance();
			//작업
			System.out.printf("%1$tF %1$tT\n",Calendar.getInstance());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

public class Test3 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new TClock());
		t1.start();
	}
}
