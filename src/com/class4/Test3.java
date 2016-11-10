package com.class4;
//20161025
import java.util.Calendar;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		//2. 년월일,및일후를 입력받아 년월일요일구하기
		Scanner sc = new Scanner(System.in);
		Calendar now = Calendar.getInstance();
		
		String[] weekName = {"일","월","화","수","목","금","토"};
		int year,month,day,week,dayAfter;
		
		do{
			System.out.print("년도(y>=1900)?");
			year=sc.nextInt();
		}while(year<1900);
		
		do{
			System.out.print("월?");
			month=sc.nextInt();
		}while(month<1||month>12);

		now.set(year, month-1, 1);
		
		int lastDay = now.getActualMaximum(Calendar.DATE);
		
		do{
			System.out.print("일?");
			day=sc.nextInt();
		}while(day<1||day>lastDay);
		
		do{
			System.out.print("몇일후?");
			dayAfter=sc.nextInt();
		}while(dayAfter<1);
		
		now.set(year, month-1, day);
		week = now.get(Calendar.DAY_OF_WEEK);//1-7(주의수)
		
		System.out.printf("만난날: %d년 %d월 %d일 %s요일\n",year,month,day,weekName[week-1]);
		
		//now.set(year, month-1, day+dayAfter);
		now.add(Calendar.DATE,dayAfter);
		
		year = now.get(Calendar.YEAR);//년
		month = now.get(Calendar.MONTH)+1;//0-11(월)
		day = now.get(Calendar.DATE);//일
		week = now.get(Calendar.DAY_OF_WEEK);//1-7(주의수)
		
		System.out.printf("%d일 후: %d년 %d월 %d일 %s요일\n",dayAfter,year,month,day,weekName[week-1]);
		sc.close();
	}
}
