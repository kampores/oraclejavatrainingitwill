package com.class2;

import java.util.ArrayList;
import java.util.Scanner;

//20161021
//3. �ϳ��� ���� �Է� �޾� �Ҽ����� �Ǻ�(3������� �Ǻ�)
//
//������ �Է��Ͻÿ� : 79
//����� �Է��� 79�� �Ҽ��Դϴ�
class Prime{
	public String primeResult(int num){
		ArrayList<Integer> prime = new ArrayList<Integer>();
		if(num==2) return "�Ҽ�";
		else if(num%2==0) return "2�ǹ��";
		if(num==3) return "�Ҽ�";
		else if(num%3==0) return "3�ǹ��";
		if(num==5) return "�Ҽ�";
		else if(num%5==0) return "5�ǹ��";
		if(num==7) return "�Ҽ�";
		else if(num%7==0) return "7�ǹ��";
		prime.add(2);
		prime.add(3);
		prime.add(5);
		prime.add(7);
		int numSqrt=(int)Math.sqrt(num);
		for(int i=3;i<=numSqrt;i+=2){
			if(num%i==0) return Integer.toString(i)+"�� ���";
		}
		return "�Ҽ�";
	}
}

public class Question3 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� :");
		num = sc.nextInt();
	
		System.out.printf("����� �Է��� %d��(��) %s�Դϴ�\n",num,new Prime().primeResult(num));
		
	}

}
