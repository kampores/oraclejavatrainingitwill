package com.day4;

import java.util.Scanner;
//20161017
public class Question5 {

	public static void main(String[] args) {
		//5. �μ��� �Է¹޾� ���� ������ ū�������� ��
		Scanner sc = new Scanner(System.in);
		int num1,num2,sum;
		sum=0;
		
		System.out.print("�� ��?");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		if(num1>num2){
			num1=num1^num2; //XOR ��Ʈ����
			num2=num1^num2;
			num1=num1^num2;
		}
		
		for(int i=num1;i<=num2;i++)
			sum+=i;
		System.out.println(num1+"���� "+num2+"������ �� : "+sum);
		sc.close();
	}

}
