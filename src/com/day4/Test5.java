package com.day4;

import java.util.Scanner;
//20161017
public class Test5 {

	public static void main(String[] args) {

		//switch
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("1~3�̳��� ��?");
		num = sc.nextInt();
		
		switch(num){
		case 3:
			System.out.println("***");
			break;
		case 2:
			System.out.println("**");
			break;			
		case 1:
			System.out.println("*");
			break;			
		default:
			System.out.println("�����Է� ����!!");
		}
		sc.close();
	}
}
