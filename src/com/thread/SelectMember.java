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
				{"이경훈","임동현","한나래","강민석","김유상",
				"우은비","김상수","장창기","강인혁","추승필",
				"이현성","박경환","이준영","최숙향","신동화",
				"신익창","김상성","이동찬","정현희","이승진",
				"박정아","유서하","최효영","이재원","염대영"}; 		
				
		do{
			System.out.print("발표자 인원수?");
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
				
		
		System.out.print("고민중");
		ob.start();
		
		try {
			ob.join();
									
		} catch (Exception e) {
			// TODO: handle exception
		}
		
				
		//출력		
		System.out.println();
		System.out.println();	
		System.out.println("축하합니다!!,발표자 입니다");
		System.out.println();
		
		int cnt=1;
		for(int su : num){
			
			System.out.printf(cnt + "번 발표자 : %5s\n",name[su-1]);
					
			cnt++;
		}
		
		System.out.println();			
				
	}

}


