package com.day4;
//20161017
public class Question2 {

	public static void main(String[] args) {
		//2. 1���� 100���� ���� Ȧ���� ��, ¦���� ��, ��ü�� ��
		int i,evenSum,oddSum;
		oddSum=0;		
		evenSum=0;
		for(i=1;i<=100;i+=2)
			oddSum+=i;
		for(i=2;i<=100;i+=2)
			evenSum+=i;
		System.out.println("1���� 100����");		
		System.out.println("Ȧ������:"+oddSum);		
		System.out.println("¦������:"+evenSum);		
		System.out.println("��ü����:"+(oddSum+evenSum));		
	}

}
