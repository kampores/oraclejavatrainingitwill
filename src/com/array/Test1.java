package com.array;
//20161018
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		//����޷�
		//1��1��1�� ������
		//����:4�ǹ���̰� 100�� ����� �ƴϰų� 400�� ���
		
		Scanner sc = new Scanner(System.in);
		
		//���� ��¥���� �迭�� ����
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int y,m,nalsu,i,week;
		
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
		
		//1��1��1�Ϻ��� y-1�� 12�� 31�ϱ����� ����(��������)
		nalsu=(y-1)*365+(y-1)/4-(y-1)/100+(y-1)/400;
		
		//int yy=(y-1)/4-(y-1)/100+(y-1)/400;
		//System.out.println(nalsu);
		//System.out.println(yy);
		
		//(m-1)�������� ����
		//  0  1  2  3  4  5  6  7  8  9 10 11
		// 31,28,31,30,31,30,31,31,30,31,30,31
		//  1  2  3  4  5  6  7  8  9 10 11 12
		for(i=0;i<m-1;i++)
			nalsu+=months[i];
		
		nalsu+=1;//y��m��1�ϱ����� ����
		
		//���� ��
		week=nalsu%7;
		
		//System.out.println(week);
		
		System.out.printf("%14d�� %2d��\n",y,m);
		System.out.println("\n  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("------------------------------");
		
		//Ư�� ���Ϻ��� ���۵ǵ��� ����ä��
		for(i=0;i<week;i++)
			System.out.print("    ");//����4ĭ
		
		//�ش���� ��¥�� ���
		for(i=1;i<=months[m-1];i++) {
			System.out.printf("%4d",i);
			//������ ���ڰ� ��µǸ� �ٹٲ�
			week++;
			if(week%7==0)
				System.out.println();
		}
		if(week%7!=0)
			System.out.println();
		System.out.println("------------------------------");
		sc.close();
	}

}
