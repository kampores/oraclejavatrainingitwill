package com.class4;
//20161025
import java.util.Calendar;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//1. Calendar�� ����ؼ� ����޷�(y>=1900)�� ����ÿ�
		Scanner sc = new Scanner(System.in);		
		Calendar now = Calendar.getInstance();

		int y,m,week;		
		
		do{
			System.out.print("�⵵(y>=1900)?");
			y=sc.nextInt();
		}while(y<1900);
		
		do{
			System.out.print("��?");
			m=sc.nextInt();
		}while(m<1||m>12);
		
		now.set(y, m-1, 1);
		
		week = now.get(Calendar.DAY_OF_WEEK)-1;//1-7(���Ǽ�)
				
		//System.out.println("Calendar �̿� �޷�");
		System.out.printf("%14d�� %2d��\n",y,m);
		System.out.println("\n  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("------------------------------");
		
		int lastDay = now.getActualMaximum(Calendar.DATE);
					
		//Ư�� ���Ϻ��� ���۵ǵ��� ����ä��
		for(int i=0;i<week;i++)
			System.out.print("    ");//����4ĭ
		
		//�ش���� ��¥�� ���
		for(int i=1;i<=lastDay;i++) {
			System.out.printf("%4d",i);
			//������ ���ڰ� ��µǸ� �ٹٲ�
			week++;
			if(week%7==0)
				System.out.println();
		}
		if(week%7!=0)
			System.out.println();
		System.out.println("------------------------------");
		sc.close();
	}
}
