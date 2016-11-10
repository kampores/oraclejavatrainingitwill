package com.day4;
//20161017
public class Test2 {

	public static void main(String[] args) {
		int i,sum;
		sum=0;
		//1.100까지의 합
		for(i=1;i<=100;i++)
			sum+=i;
		//2.홀수의 합
		sum=0;		
		for(i=1;i<=100;i+=2)
			sum+=i;
		//3.짝수의 합
		sum=0;
		for(i=2;i<=100;i+=2)
			sum+=i;
		//4.3의 배수의 합
		sum=0;
		for(i=3;i<=100;i+=3)
			sum+=i;
		//5.for내 100까지의 합
		for(i=1,sum=0;i<=100;sum+=i,i++);
		System.out.println("결과: "+sum);
	}

}
