package com.array;
//20161018
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
	
		//10�� �̳��� �̸��� ������ �Է¹޾�
		//������ ����������� ������� ������ ����
		
		Scanner sc = new Scanner(System.in);
		
		String[] name;
		int[] score;
		int inwon,i,j,t1;
		String t2;
		
		do{
			System.out.print("�ο���[1~10]?");//3
			inwon=sc.nextInt();
		}while(inwon<1||inwon>10);
		
		//�迭�� ��ü����(�޸��Ҵ�)
		name = new String[inwon];
		score = new int[inwon];
		
		//�ο�����ŭ �̸��� �����Է�
		for(i=0;i<inwon;i++){
			System.out.print((i+1)+"��° �̸�?");
			name[i] = sc.next();
			
			System.out.print("����?");
			score[i] = sc.nextInt();
		}
		
		//����
		for(i=0;i<inwon-1;i++)
			for(j=i+1;j<inwon;j++)
				if(score[i]<score[j]){
					t2=name[i];
					name[i]=name[j];
					name[j]=t2;
					t1=score[i];
					score[i]=score[j];
					score[j]=t1;
				}
		
		//���
		for(i=0;i<inwon;i++)
			System.out.printf("%8s %4d\n",name[i],score[i]);
		
		sc.close();
	
	}
}
