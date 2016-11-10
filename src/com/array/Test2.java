package com.array;
//20161018
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		//년,월,일을 입력받아
		//2016년 10월 18일 화요일
		
		Scanner sc = new Scanner(System.in);
		
		//월별 날짜수를 배열에 저장
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		char yoil[] = {'일','월','화','수','목','금','토'};
		int y,m,d,nalsu,i,week;
		
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

		do{
			System.out.print("일?");
			d=sc.nextInt();
		}while(d<1||d>months[m-1]);
		
		//1년1월1일부터 y-1년 12월 31일까지의 날수(윤년포함)
		nalsu=(y-1)*365+(y-1)/4-(y-1)/100+(y-1)/400;
		
		for(i=0;i<m-1;i++)
			nalsu+=months[i];
		
		nalsu+=d;//y년m월d일까지의 날수
		
		//주의 수
		week=nalsu%7;
		
		System.out.printf("%d년 %d월 %d일 %c요일\n",y,m,d,yoil[week]);
		sc.close();
	}

}
