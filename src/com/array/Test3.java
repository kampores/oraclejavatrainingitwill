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
		
		System.out.print("5개의 정수?: ");

		for(i=0;i<num.length;i++)
			num[i]=sc.nextInt();
		
		System.out.print("Source Data: ");
		
//		for(i=0;i<num.length;i++)
//			System.out.printf("%4d",num[i]);
		ar.array1DPrint(num);		
		
		System.out.println();
		
		//정렬연산
		//Selection sort(왼쪽부터 정렬)
		for(i=0;i<num.length-1;i++)
			for(j=i+1;j<num.length;j++)
				//System.out.println(i+":"+j);
				if(num[i]>num[j]){
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
		
		//결과출력
		System.out.print("Sorted Data: ");
		
		//50,30,40,10,20
//		for(int su : num)//확장 for문
//			System.out.printf("%4d",su);
		ar.array1DPrint(num);
		
		System.out.println();
		sc.close();
	}

}
