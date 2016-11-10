package com.class4;
//20161025
import java.util.Calendar;

public class Test1 {

	public static void main(String[] args) {
		//Calendar
		//현재 컴퓨터 시스템의 날짜 및 시간으로 객체를 생성
		
		Calendar now = Calendar.getInstance();
		
		int y = now.get(Calendar.YEAR);//년
		int m = now.get(Calendar.MONTH)+1;//0-11(월)
		int d = now.get(Calendar.DATE);//일
		int w = now.get(Calendar.DAY_OF_WEEK);//1-7(주의수)
		
		System.out.println(y + "-" + m + "-" + d + "-" + w);
		
		String[] week = {"일","월","화","수","목","금","토"};
		
		System.out.println(y + "-" + m + "-" + d + "-" + week[w-1]);
		
		int firstDay = now.getActualMinimum(Calendar.DATE);
		int lastDay = now.getActualMaximum(Calendar.DATE);
		
		System.out.println(firstDay + ":" + lastDay);
		
		System.out.printf("%tF\n",now);//날짜
		System.out.printf("%tT\n",now);//시간
		
		System.out.printf("%tF %tT\n",now,now);
		
		System.out.printf("%1$tF %1$tT\n",now);
		
		now.set(2020, 10-1, 10);
		
		y = now.get(Calendar.YEAR);//년
		m = now.get(Calendar.MONTH)+1;//0-11(월)
		d = now.get(Calendar.DATE);//일
		w = now.get(Calendar.DAY_OF_WEEK);//1-7(주의수)
		
		System.out.println(y + "-" + m + "-" + d + "-" + week[w-1]);
	}
}
