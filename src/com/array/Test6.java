package com.array;
//20161018
import java.util.Scanner;

public class Test6 {
	
	public static void main(String[] args) {
		//10�� �̳��� �̸��� ������ �Է¹޾Ƽ� �������ϱ�
		Scanner sc = new Scanner(System.in);
		
		String[] name;
		int[] score,rank;
		int inwon,i,j;
		
		do{
			System.out.print("�ο���[1-10]?");
			inwon=sc.nextInt();
		}while(inwon<1||inwon>10);
		
		//�迭 �޸� �Ҵ�
		name = new String[inwon];
		score = new int[inwon];
		rank = new int[inwon];
		
		//�Է�
		for(i=0;i<inwon;i++){
			System.out.println((i+1)+"��° �̸�?");
			name[i]=sc.next();
			System.out.print("����?");
			score[i]=sc.nextInt();
		}
		
		//�������ϱ�
		//�ʱ�ȭ
		for(i=0;i<inwon;i++)
			rank[i]=1;
		//�������
		for(i=0;i<inwon-1;i++)
			for(j=i+1;j<inwon;j++)
				if(score[i]>score[j])
					rank[j]++;
				else if(score[i]<score[j])
					rank[i]++;
		//���
		for(i=0;i<inwon;i++)
			System.out.printf("%8s %4d %4d\n",name[i],score[i],rank[i]);
		
		sc.close();
	}
}
