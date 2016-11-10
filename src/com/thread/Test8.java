package com.thread;
//20161101

//����ȭ(�����ܰ�)
class MyThread8 implements Runnable{
	private int bank = 10000;
	
	private int getBank(){
		return bank; //�ܾ�Ȯ��
	}

	private int drawMoney(int m){
		bank -= m;//����
		
		return m;//����ݾ�
	}
	
	@Override
	public void run() {
		synchronized (this) {
			int money_need = 6000;//������ �ݾ�
			int money;
			
			String msg="";
			
			try {
				if(getBank()>=money_need){
					Thread.yield();//CPU�� �ٸ� ���������� �纸
					money = drawMoney(money_need);
					msg = "���� ����";
				}else{
					money = 0;
					msg = "���� ����";
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
