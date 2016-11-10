package com.class1;

import java.util.Calendar;

//20161021
public class CusInfoMain {

	public static void main(String[] args) {
		//CusInfo info = new CusInfo();
		//info.print();
		
		CusInfo.getInstance();//static method 이름은 보통 getInstance로 함
		
		//Calendar now = new Calendar();--error
		Calendar now = Calendar.getInstance();
		
//		Calendar now1 = new Calendar();
//		Calendar now2 = new Calendar();
//		Calendar now3 = new Calendar();
//		Calendar now4 = new Calendar();
	}

}
