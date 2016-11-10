package com.array;
//20161018
import java.util.Scanner;

public class Test6 {
	
	public static void main(String[] args) {
		//10명 이내의 이름과 점수를 입력받아서 석차구하기
		Scanner sc = new Scanner(System.in);
		
		String[] name;
		int[] score,rank;
		int inwon,i,j;
		
		do{
			System.out.print("인원수[1-10]?");
			inwon=sc.nextInt();
		}while(inwon<1||inwon>10);
		
		//배열 메모리 할당
		name = new String[inwon];
		score = new int[inwon];
		rank = new int[inwon];
		
		//입력
		for(i=0;i<inwon;i++){
			System.out.println((i+1)+"번째 이름?");
			name[i]=sc.next();
			System.out.print("점수?");
			score[i]=sc.nextInt();
		}
		
		//석차구하기
		//초기화
		for(i=0;i<inwon;i++)
			rank[i]=1;
		//석차계산
		for(i=0;i<inwon-1;i++)
			for(j=i+1;j<inwon;j++)
				if(score[i]>score[j])
					rank[j]++;
				else if(score[i]<score[j])
					rank[i]++;
		//출력
		for(i=0;i<inwon;i++)
			System.out.printf("%8s %4d %4d\n",name[i],score[i],rank[i]);
		
		sc.close();
	}
}
