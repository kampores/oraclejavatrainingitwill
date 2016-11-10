package com.array;
//20161018
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
	
		//10명 이내의 이름과 점수를 입력받아
		//점수가 높은사람에서 낮은사람 순으로 정렬
		
		Scanner sc = new Scanner(System.in);
		
		String[] name;
		int[] score;
		int inwon,i,j,t1;
		String t2;
		
		do{
			System.out.print("인원수[1~10]?");//3
			inwon=sc.nextInt();
		}while(inwon<1||inwon>10);
		
		//배열의 객체생성(메모리할당)
		name = new String[inwon];
		score = new int[inwon];
		
		//인원수만큼 이름과 점수입력
		for(i=0;i<inwon;i++){
			System.out.print((i+1)+"번째 이름?");
			name[i] = sc.next();
			
			System.out.print("점수?");
			score[i] = sc.nextInt();
		}
		
		//정렬
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
		
		//출력
		for(i=0;i<inwon;i++)
			System.out.printf("%8s %4d\n",name[i],score[i]);
		
		sc.close();
	
	}
}
