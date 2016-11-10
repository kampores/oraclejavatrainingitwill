package com.score1;

import java.util.Scanner;
//20161020
public class Score {
	int inwon;
	Record[] rec = null;
	Scanner sc = new Scanner(System.in);
	
	public void set(){
		do{
			System.out.print("인원수?");
			inwon=sc.nextInt();
		}while(inwon<1||inwon>10);
		//배열의 메모리 할당
		rec = new Record[inwon];
	}

	public void input(){
		String[] title = {"국어?","영어?","수학?"};
		for(int i=0;i<inwon;i++){
			rec[i] = new Record();
			
			System.out.print((i+1)+"번째 이름?");//이름
			rec[i].name=sc.next();
			for(int j=0;j<rec[i].score.length;j++){
				do{
					System.out.print(title[j]);
					rec[i].score[j] = sc.nextInt();//국영수
				}while(rec[i].score[j]<0||rec[i].score[j]>100);
				rec[i].tot += rec[i].score[j];//총점
			}
			rec[i].ave=rec[i].tot/3;//평균
		}
	}
	
	private void ranking(){//석차
		int i,j;
		
		for(i=0;i<inwon;i++)
			rec[i].rank=1;//초기화
		for(i=0;i<inwon-1;i++)
			for(j=i+1;j<inwon;j++)
				if(rec[i].tot>rec[j].tot)
					rec[j].rank++;
				else if(rec[i].tot<rec[j].tot)
					rec[i].rank++;
	}
	
	public void print(){
		ranking();
		System.out.printf("%4s %s %s %s %s %s %s\n","이름","국어","영어","수학","총점","평균","석차");
		System.out.println("------------------------------------");
		for(int i=0;i<inwon;i++){
			System.out.printf("%5s",rec[i].name);//이름
			for(int j=0;j<3;j++)
				System.out.printf("%5d",rec[i].score[j]);//국영수
			System.out.printf("%5d",rec[i].tot);//총점
			System.out.printf("%5d",rec[i].ave);//평균
			System.out.printf("%5d\n",rec[i].rank);//석차
		}
	}
}
