package com.array;
//20161018
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		//��,��,���� �Է¹޾�
		//2016�� 10�� 18�� ȭ����
		
		Scanner sc = new Scanner(System.in);
		
		//���� ��¥���� �迭�� ����
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		char yoil[] = {'��','��','ȭ','��','��','��','��'};
		int y,m,d,nalsu,i,week;
		
		do{
			System.out.print("�⵵?");
			y=sc.nextInt();
		}while(y<1);
		
		do{
			System.out.print("��?");
			m=sc.nextInt();
		}while(m<1||m>12);
		
		//y���� ����Ȯ���� 2���� ���� ���
		if(y%4==0&&y%100!=0||y%400==0)
			months[1]=29;

		do{
			System.out.print("��?");
			d=sc.nextInt();
		}while(d<1||d>months[m-1]);
		
		//1��1��1�Ϻ��� y-1�� 12�� 31�ϱ����� ����(��������)
		nalsu=(y-1)*365+(y-1)/4-(y-1)/100+(y-1)/400;
		
		for(i=0;i<m-1;i++)
			nalsu+=months[i];
		
		nalsu+=d;//y��m��d�ϱ����� ����
		
		//���� ��
		week=nalsu%7;
		
		System.out.printf("%d�� %d�� %d�� %c����\n",y,m,d,yoil[week]);
		sc.close();
	}

}
