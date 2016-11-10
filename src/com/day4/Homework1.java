package com.day4;
//20161017
public class Homework1 {

	public static void main(String[] args) {
		//숙제
		/*
		2*1=2	3*1=3	4*1=4	5*1=5
		.		.		.		.
		.		.		.		.
		2*9=18	3*9=27	4*9=36	5*9=45

		6*1=6	7*1=7	8*1=8	9*1=9
		.		.		.		.
		.		.		.		.
		6*9=54	7*9=63	8*9=72	9*9=81
		
		hint
		1.3중 for문을 사용
		2.가끔 2중 for
		3.3가지 방법
		*/
		int a,b,i;
		for(i=0;i<=4;i+=4){
			for(b=1;b<=9;b++){
				for(a=2+i;a<=5+i;a++){
					System.out.printf("%d*%d=%d\t",a,b,(a*b));
				}
				System.out.println();
			}
			System.out.println();
		}
//		for(b=1;b<=9;b++){
//			for(a=6;a<=9;a++){
//				System.out.printf("%d*%d=%d\t",a,b,(a*b));
//			}
//			System.out.println();
//		}
	}

}
