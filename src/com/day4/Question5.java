package com.day4;

import java.util.Scanner;
//20161017
public class Question5 {

	public static void main(String[] args) {
		//5. 두수를 입력받아 적은 수에서 큰수까지의 합
		Scanner sc = new Scanner(System.in);
		int num1,num2,sum;
		sum=0;
		
		System.out.print("두 수?");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		if(num1>num2){
			num1=num1^num2; //XOR 비트연산
			num2=num1^num2;
			num1=num1^num2;
		}
		
		for(int i=num1;i<=num2;i++)
			sum+=i;
		System.out.println(num1+"에서 "+num2+"까지의 합 : "+sum);
		sc.close();
	}

}
