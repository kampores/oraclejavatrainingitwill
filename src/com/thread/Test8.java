package com.thread;
//20161101

//동기화(은행잔고)
class MyThread8 implements Runnable{
	private int bank = 10000;
	
	private int getBank(){
		return bank; //잔액확인
	}

	private int drawMoney(int m){
		bank -= m;//인출
		
		return m;//인출금액
	}
	
	@Override
	public void run() {
		synchronized (this) {
			int money_need = 6000;//인출할 금액
			int money;
			
			String msg="";
			
			try {
				if(getBank()>=money_need){
					Thread.yield();//CPU를 다른 스레드한테 양보
					money = drawMoney(money_need);
					msg = "인출 성공";
				}else{
					money = 0;
					msg = "인출 실패";
				}
				System.out.println(Thread.currentThread().getName() +
						msg + getBank());
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

public class Test8 {
	public static void main(String[] args) {
		MyThread8 ob = new MyThread8();
		
		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(ob);
		
		t1.start();
		t2.start();
	}
}
