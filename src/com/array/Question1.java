package com.array;
//20161018
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		//1. 5개의 정수를 입력받아 입력받은 수를 출력하고 입력받은 수중
		//   가장 큰수와 적은수를 출력
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		int i,j;
		
		System.out.print("5개의 정수 입력:");
		for(i=0;i<num.length;i++)
			num[i]=sc.nextInt();
		
		System.out.print("입력된 수:");
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
		
		System.out.println("가장 큰 수:"+num[num.length-1]);
		System.out.println("가장 작은 수:"+num[0]);
		
		sc.close();
		
	}

}
