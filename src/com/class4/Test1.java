package com.class4;
//20161025
import java.util.Calendar;

public class Test1 {

	public static void main(String[] args) {
		//Calendar
		//���� ��ǻ�� �ý����� ��¥ �� �ð����� ��ü�� ����
		
		Calendar now = Calendar.getInstance();
		
		int y = now.get(Calendar.YEAR);//��
		int m = now.get(Calendar.MONTH)+1;//0-11(��)
		int d = now.get(Calendar.DATE);//��
		int w = now.get(Calendar.DAY_OF_WEEK);//1-7(���Ǽ�)
		
		System.out.println(y + "-" + m + "-" + d + "-" + w);
		
		String[] week = {"��","��","ȭ","��","��","��","��"};
		
		System.out.println(y + "-" + m + "-" + d + "-" + week[w-1]);
		
		int firstDay = now.getActualMinimum(Calendar.DATE);
		int lastDay = now.getActualMaximum(Calendar.DATE);
		
		System.out.println(firstDay + ":" + lastDay);
		
		System.out.printf("%tF\n",now);//��¥
		System.out.printf("%tT\n",now);//�ð�
		
		System.out.printf("%tF %tT\n",now,now);
		
		System.out.printf("%1$tF %1$tT\n",now);
		
		now.set(2020, 10-1, 10);
		
		y = now.get(Calendar.YEAR);//��
		m = now.get(Calendar.MONTH)+1;//0-11(��)
		d = now.get(Calendar.DATE);//��
		w = now.get(Calendar.DAY_OF_WEEK);//1-7(���Ǽ�)
		
		System.out.println(y + "-" + m + "-" + d + "-" + week[w-1]);
	}
}
