package com.day4;

import java.io.IOException;
import java.util.Scanner;
//20161017
public class Test6 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		char oper;
		
		System.out.print("ù��°��?");//40
		num1=sc.nextInt();
		
		System.out.print("�ι�°��?");//5
		num2=sc.nextInt();
		
		System.out.print("������[+,-,*,/]?");//+,-,*,/
		oper=(char)System.in.read();
		
		//switch
		switch(oper){
		case '+':
			System.out.printf("%d%c%d=%d\n",num1,oper,num2,(num1+num2));
			break;
		case '-':
			System.out.printf("%d%c%d=%d\n",num1,oper,num2,(num1-num2));
			break;			
		case '*':
			System.out.printf("%d%c%d=%d\n",num1,oper,num2,(num1*num2));
			break;
		case '/':
			System.out.printf("%d%c%d=%d\n",num1,oper,num2,(num1/num2));
			break;			
		default:
			System.out.println("�������Է� ����!!");
		}
		sc.close();
	}
}
