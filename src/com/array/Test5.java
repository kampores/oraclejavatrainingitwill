package com.array;
//20161018
import java.util.Random;

import com.array2.Array;

public class Test5 {

	public static void main(String[] args) {
		
		//1~45������ ���� 6���� ������ �߻����� ũ������� ����
		
		Random rd = new Random();
		Array ar = new Array();
		
		int[] num = new int[6];
		int i,j,su,temp;
		
		//���� �߻�
		su = 0;
		
		while(su<6){
			num[su] = rd.nextInt(45)+1;
			for(i=0;i<su;i++)
				if(num[i]==num[su]){
					su--;
					break;
				}
			su++;
		}
		
		//������������(1~10,��~��)-��������
		for(i=0;i<num.length-1;i++)
			for(j=i+1;j<num.length;j++)
				if(num[i]>num[j]){
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
		
		//���
//		for(int n : num)
//			System.out.printf("%4d",n);
		ar.array1DPrint(num);
		
		System.out.println();
	}
}
