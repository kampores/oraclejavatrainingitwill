package com.array;
//20161018
import java.util.Random;

import com.array2.Array;

public class Test5 {

	public static void main(String[] args) {
		
		//1~45까지의 수중 6개의 난수를 발생시켜 크기순으로 정렬
		
		Random rd = new Random();
		Array ar = new Array();
		
		int[] num = new int[6];
		int i,j,su,temp;
		
		//난수 발생
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
		
		//오름차순정렬(1~10,ㄱ~ㅎ)-내림차순
		for(i=0;i<num.length-1;i++)
			for(j=i+1;j<num.length;j++)
				if(num[i]>num[j]){
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
		
		//출력
//		for(int n : num)
//			System.out.printf("%4d",n);
		ar.array1DPrint(num);
		
		System.out.println();
	}
}
