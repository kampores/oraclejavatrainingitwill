package com.class2;

import java.util.ArrayList;
import java.util.Scanner;

//20161021
//3. 하나의 수를 입력 받아 소수인지 판별(3배수인지 판별)
//
//정수를 입력하시오 : 79
//당신이 입력한 79은 소수입니다
class Prime{
	public String primeResult(int num){
		ArrayList<Integer> prime = new ArrayList<Integer>();
		if(num==2) return "소수";
		else if(num%2==0) return "2의배수";
		if(num==3) return "소수";
		else if(num%3==0) return "3의배수";
		if(num==5) return "소수";
		else if(num%5==0) return "5의배수";
		if(num==7) return "소수";
		else if(num%7==0) return "7의배수";
		prime.add(2);
		prime.add(3);
		prime.add(5);
		prime.add(7);
		int numSqrt=(int)Math.sqrt(num);
		for(int i=3;i<=numSqrt;i+=2){
			if(num%i==0) return Integer.toString(i)+"의 배수";
		}
		return "소수";
	}
}

public class Question3 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 :");
		num = sc.nextInt();
	
		System.out.printf("당신이 입력한 %d은(는) %s입니다\n",num,new Prime().primeResult(num));
		
	}

}
