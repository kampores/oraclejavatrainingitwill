package com.day4;
//20161017
public class Test2 {

	public static void main(String[] args) {
		int i,sum;
		sum=0;
		//1.100������ ��
		for(i=1;i<=100;i++)
			sum+=i;
		//2.Ȧ���� ��
		sum=0;		
		for(i=1;i<=100;i+=2)
			sum+=i;
		//3.¦���� ��
		sum=0;
		for(i=2;i<=100;i+=2)
			sum+=i;
		//4.3�� ����� ��
		sum=0;
		for(i=3;i<=100;i+=3)
			sum+=i;
		//5.for�� 100������ ��
		for(i=1,sum=0;i<=100;sum+=i,i++);
		System.out.println("���: "+sum);
	}

}
