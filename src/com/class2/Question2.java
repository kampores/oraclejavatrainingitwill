package com.class2;

import java.util.Scanner;
//20161021
//2. 하나의 정수를 입력 받아 짝수인지 홀수인지 구분
//
//정수를 입력하세요 : 7
//홀수

public class Question2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("정수를 입력하세요 : ");
		System.out.println(sc.nextInt()%2==0?"짝수":"홀수");
	}

}
