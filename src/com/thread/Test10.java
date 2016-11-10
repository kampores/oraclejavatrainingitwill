package com.thread;
//20161101
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

//정해진 시간마다 특정 작업을 할려고 할때 
public class Test10 extends Thread{
	private int num=0;
	public Test10(){
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				//반복실행할 작업
				num=0;
			}
		};
		
		Timer t = new Timer();
		Calendar d = Calendar.getInstance();
		
		//내일 0시0분0초부터 하루에 한번씩 반복
		//d.add(Calendar.DATE, 1);
		//d.set(Calendar.HOUR, 0);//오후1시는 13
		//d.set(Calendar.MINUTE, 0);//분
		//d.set(Calendar.SECOND, 0);//초
		//d.set(Calendar.MILLISECOND, 0);
		
		//t.schedule(task, d.getTime(), 1000*60*60*24);//(초,분,시)
		t.schedule(task, d.getTime(), 5000);//5초마다
	}
	
	@Override
	public void run() {
		while (true) {
			System.out.println(num++);
			try {
				sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void main(String[] args) {
		//Test10 ob = new Test10();
		//ob.start();
		new Test10().start();
	}
}
