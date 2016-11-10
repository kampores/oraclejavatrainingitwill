package com.array;
//20161018
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		//만년달력
		//1년1월1일 월요일
		//윤년:4의배수이고 100의 배수가 아니거나 400의 배수
		
		Scanner sc = new Scanner(System.in);
		
		//월별 날짜수를 배열에 저장
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int y,m,nalsu,i,week;
		
		do{
			System.out.print("년도?");
			y=sc.nextInt();
		}while(y<1);
		
		do{
			System.out.print("월?");
			m=sc.nextInt();
		}while(m<1||m>12);
		
		//y년의 윤년확인후 2월의 날수 계산
		if(y%4==0&&y%100!=0||y%400==0)
			months[1]=29;
		
		//1년1월1일부터 y-1년 12월 31일까지의 날수(윤년포함)
		nalsu=(y-1)*365+(y-1)/4-(y-1)/100+(y-1)/400;
		
		//int yy=(y-1)/4-(y-1)/100+(y-1)/400;
		//System.out.println(nalsu);
		//System.out.println(yy);
		
		//(m-1)월까지의 날수
		//  0  1  2  3  4  5  6  7  8  9 10 11
		// 31,28,31,30,31,30,31,31,30,31,30,31
		//  1  2  3  4  5  6  7  8  9 10 11 12
		for(i=0;i<m-1;i++)
			nalsu+=months[i];
		
		nalsu+=1;//y년m월1일까지의 날수
		
		//주의 수
		week=nalsu%7;
		
		//System.out.println(week);
		
		System.out.printf("%14d년 %2d월\n",y,m);
		System.out.println("\n  일  월  화  수  목  금  토");
		System.out.println("------------------------------");
		
		//특정 요일부터 시작되도록 공백채움
		for(i=0;i<week;i++)
			System.out.print("    ");//공백4칸
		
		//해당월의 날짜만 출력
		for(i=1;i<=months[m-1];i++) {
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
