package com.class4;
//20161025
import java.util.Calendar;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		//2. �����,�����ĸ� �Է¹޾� ����Ͽ��ϱ��ϱ�
		Scanner sc = new Scanner(System.in);
		Calendar now = Calendar.getInstance();
		
		String[] weekName = {"��","��","ȭ","��","��","��","��"};
		int year,month,day,week,dayAfter;
		
		do{
			System.out.print("�⵵(y>=1900)?");
			year=sc.nextInt();
		}while(year<1900);
		
		do{
			System.out.print("��?");
			month=sc.nextInt();
		}while(month<1||month>12);

		now.set(year, month-1, 1);
		
		int lastDay = now.getActualMaximum(Calendar.DATE);
		
		do{
			System.out.print("��?");
			day=sc.nextInt();
		}while(day<1||day>lastDay);
		
		do{
			System.out.print("������?");
			dayAfter=sc.nextInt();
		}while(dayAfter<1);
		
		now.set(year, month-1, day);
		week = now.get(Calendar.DAY_OF_WEEK);//1-7(���Ǽ�)
		
		System.out.printf("������: %d�� %d�� %d�� %s����\n",year,month,day,weekName[week-1]);
		
		//now.set(year, month-1, day+dayAfter);
		now.add(Calendar.DATE,dayAfter);
		
		year = now.get(Calendar.YEAR);//��
		month = now.get(Calendar.MONTH)+1;//0-11(��)
		day = now.get(Calendar.DATE);//��
		week = now.get(Calendar.DAY_OF_WEEK);//1-7(���Ǽ�)
		
		System.out.printf("%d�� ��: %d�� %d�� %d�� %s����\n",dayAfter,year,month,day,weekName[week-1]);
		sc.close();
	}
}
