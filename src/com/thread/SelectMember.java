package com.thread;
//20161101
import java.util.Random;
import java.util.Scanner;

class MyThread extends Thread{
		
	int cnt = 0;
	String str;
	
	public void run(){
		
		while(true){
						
			System.out.print(".");
						
			try {
				sleep(300);
				
				if(cnt==20)
					break;	
				
				cnt++;				
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}		
			
		}
	}
	
}

public class SelectMember{
		
		public static void main(String[] args) {		
				
		Thread ob = new MyThread();
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int[] num;
		int inwon,i,n;
		String[] name = 
				{"�̰���","�ӵ���","�ѳ���","���μ�","������",
				"������","����","��â��","������","�߽���",
				"������","�ڰ�ȯ","���ؿ�","�ּ���","�ŵ�ȭ",
				"����â","���","�̵���","������","�̽���",
				"������","������","��ȿ��","�����","���뿵"}; 		
				
		do{
			System.out.print("��ǥ�� �ο���?");
			inwon = sc.nextInt();
		}while(inwon<1||inwon>25);
		
		num = new int[inwon];		
		
		n=0;
		while(n<inwon){
			
			num[n] = rd.nextInt(inwon)+1;
			
			for(i=0;i<n;i++){
				
				if(num[i]==num[n]){
					n--;
					break;
				}				
			}			
			
			n++;
		}
				
		
		System.out.print("�����");
		ob.start();
		
		try {
			ob.join();
									
		} catch (Exception e) {
			// TODO: handle exception
		}
		
				
		//���		
		System.out.println();
		System.out.println();	
		System.out.println("�����մϴ�!!,��ǥ�� �Դϴ�");
		System.out.println();
		
		int cnt=1;
		for(int su : num){
			
			System.out.printf(cnt + "�� ��ǥ�� : %5s\n",name[su-1]);
					
			cnt++;
		}
		
		System.out.println();			
				
	}

}


