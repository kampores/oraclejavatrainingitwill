package com.thread;
//20161101
import java.util.Calendar;

//���� �ý����� ���ڿ� �ð��� 1�ʸ��� ���

class TClock implements Runnable {

	@Override
	public void run() {
		while (true) {
			//Calendar now = Calendar.getInstance();
			//�۾�
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
