package com.array;
//20161018
import java.util.Scanner;

import com.array2.Array;

public class Test3 {

	public static void main(String[] args) {

		int[] num = new int[5];
		int i,j,temp;
		
		Scanner sc = new Scanner(System.in);
		Array ar = new Array();
		
		System.out.print("5���� ����?: ");

		for(i=0;i<num.length;i++)
			num[i]=sc.nextInt();
		
		System.out.print("Source Data: ");
		
//		for(i=0;i<num.length;i++)
//			System.out.printf("%4d",num[i]);
		ar.array1DPrint(num);		
		
		System.out.println();
		
		//���Ŀ���
		//Selection sort(���ʺ��� ����)
		for(i=0;i<num.length-1;i++)
			for(j=i+1;j<num.length;j++)
				//System.out.println(i+":"+j);
				if(num[i]>num[j]){
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
		
		//������
		System.out.print("Sorted Data: ");
		
		//50,30,40,10,20
//		for(int su : num)//Ȯ�� for��
//			System.out.printf("%4d",su);
		ar.array1DPrint(num);
		
		System.out.println();
		sc.close();
	}

}
