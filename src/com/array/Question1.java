package com.array;
//20161018
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		//1. 5���� ������ �Է¹޾� �Է¹��� ���� ����ϰ� �Է¹��� ����
		//   ���� ū���� �������� ���
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		int i,j;
		
		System.out.print("5���� ���� �Է�:");
		for(i=0;i<num.length;i++)
			num[i]=sc.nextInt();
		
		System.out.print("�Էµ� ��:");
		for(i=0;i<num.length;i++)
			System.out.print(num[i]+" ");
		System.out.println();
		
		for(i=0;i<num.length-1;i++)
			for(j=i+1;j<num.length;j++)
				if(num[i]>num[j]){
					num[i]=num[i]^num[j];
					num[j]=num[i]^num[j];
					num[i]=num[i]^num[j];
				}
		
		System.out.println("���� ū ��:"+num[num.length-1]);
		System.out.println("���� ���� ��:"+num[0]);
		
		sc.close();
		
	}

}
