package com.day4;
//20161017
public class Question2 {

	public static void main(String[] args) {
		//2. 1에서 100까지 수의 홀수의 합, 짝수의 합, 전체의 합
		int i,evenSum,oddSum;
		oddSum=0;		
		evenSum=0;
		for(i=1;i<=100;i+=2)
			oddSum+=i;
		for(i=2;i<=100;i+=2)
			evenSum+=i;
		System.out.println("1에서 100까지");		
		System.out.println("홀수의합:"+oddSum);		
		System.out.println("짝수의합:"+evenSum);		
		System.out.println("전체의합:"+(oddSum+evenSum));		
	}

}
