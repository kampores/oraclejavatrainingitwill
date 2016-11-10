package com.class4;
//20161025
import java.util.Calendar;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//1. Calendar를 사용해서 만년달력(y>=1900)을 만드시오
		Scanner sc = new Scanner(System.in);		
		Calendar now = Calendar.getInstance();

		int y,m,week;		
		
		do{
			System.out.print("년도(y>=1900)?");
			y=sc.nextInt();
		}while(y<1900);
		
		do{
			System.out.print("월?");
			m=sc.nextInt();
		}while(m<1||m>12);
		
		now.set(y, m-1, 1);
		
		week = now.get(Calendar.DAY_OF_WEEK)-1;//1-7(주의수)
				
		//System.out.println("Calendar 이용 달력");
		System.out.printf("%14d년 %2d월\n",y,m);
		System.out.println("\n  일  월  화  수  목  금  토");
		System.out.println("------------------------------");
		
		int lastDay = now.getActualMaximum(Calendar.DATE);
					
		//특정 요일부터 시작되도록 공백채움
		for(int i=0;i<week;i++)
			System.out.print("    ");//공백4칸
		
		//해당월의 날짜만 출력
		for(int i=1;i<=lastDay;i++) {
			System.out.printf("%4d",i);
			//한주의 날자가 출력되면 줄바꿈
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
