package com.day4;
//20161017
public class Question1 {

	public static void main(String[] args) {
		//1. (1)+(1+2)+(1+2+3)+...+(1+2+3+...+10)
		int i,sum,tsum;
		sum=0;
		tsum=0;
		for(i=1;i<=10;i++){
			sum+=i;
			tsum+=sum;
		}
		System.out.println(tsum);
	}

}
