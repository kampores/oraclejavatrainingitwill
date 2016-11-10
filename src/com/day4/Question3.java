package com.day4;
//20161017
public class Question3 {

	public static void main(String[] args) {
		//3. 1-2+3-4+5-6+7-8+9-10
		int i,sum;
		sum=0;
		for(i=1;i<=10;i++)
			sum+=i*(i%2*2-1);
		System.out.println(sum);
	}

}
