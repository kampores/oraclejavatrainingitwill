package com.score2;
//20161026
import java.util.Scanner;

public class ScoreImpl implements Score{
	Scanner sc = new Scanner(System.in);
		
	private int inwon;
	private Record[] rec;
	
	@Override
	public void set() {
		do{
			System.out.print("인원수?");
			inwon = sc.nextInt();
		}while(inwon<1||inwon>10);
		
		rec = new Record[inwon];//배열의객체생성
	}

	@Override
	public void input() {
		//inwon수만큼 학번,이름,국어,영어,수학을 입력받아
		//rec배열에 저장
		String[] title = {"국어?","영어?","수학?"};
		int[] score = new int[title.length];
		for(int i=0;i<inwon;i++){
			rec[i] = new Record();
			System.out.print((i+1)+"번째 학번?");//학번
			rec[i].hak=sc.next();
			System.out.print((i+1)+"번째 이름?");//이름
			rec[i].name=sc.next();
			for(int j=0;j<title.length;j++){
				do{
					System.out.print(title[j]);
					score[j] = sc.nextInt();//국영수
				}while(score[j]<0||score[j]>100);
				rec[i].tot += score[j];//총점
			}
			rec[i].kor=score[0];
			rec[i].eng=score[1];
			rec[i].mat=score[2];
/*			System.out.print("학번?");//학번	//선생님방법
			rec[i].hak=sc.next();
			System.out.print("이름?");//이름
			rec[i].name=sc.next();
			System.out.print("국어?");//국어
			rec[i].kor=sc.nextInt();
			System.out.print("영어?");//영어
			rec[i].eng=sc.nextInt();
			System.out.print("수학?");//수학
			rec[i].mat=sc.nextInt();
			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;//총점
*/			rec[i].ave=rec[i].tot/3;//평균
		}
		ranking();
	}
	
	private String panjung(int score) {
		String grade;
		if(score>90) grade="수";
		else if(score>80) grade="우";
		else if(score>70) grade="미";
		else if(score>60) grade="양";
		else grade="가";
		return grade;
		/*String pan;	//선생님방법
		switch(score/10){
		case (10):
		case 9:
			pan = "수";break;
		case (8):
			pan = "우";break;
		case (7):
			pan = "미";break;
		case (6):
			pan = "양";break;
		default:
			pan = "가";break;
		}
		return pan;*/
	}
	
	private void ranking(){//개인적으로 석차기능추가
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

	@Override
	public void print() {
		//111 수지 90(수) 70(양) 40(가)
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n","학번","이름","국어","영어","수학","총점","평균","석차");
		System.out.println("--------------------------------------------------------------");
		for(int i=0;i<inwon;i++){
			/*System.out.printf("%s %s %d(%s) %d(%s) %d(%s) %d %d\n", //선생님방법
					rec[i].hak,rec[i].name,
					rec[i].kor,panjung(rec[i].kor),
					rec[i].eng,panjung(rec[i].eng),
					rec[i].mat,panjung(rec[i].mat),
					rec[i].tot,rec[i].ave);*/
			System.out.printf("%s\t",rec[i].hak);//학번
			System.out.printf("%s\t",rec[i].name);//이름
			System.out.printf("%d",rec[i].kor);//국어
			System.out.printf("(%s)\t",panjung(rec[i].kor));//국어판정
			System.out.printf("%d",rec[i].eng);//영어
			System.out.printf("(%s)\t",panjung(rec[i].eng));//영어판정
			System.out.printf("%d",rec[i].mat);//수학
			System.out.printf("(%s)\t",panjung(rec[i].mat));//수학판정
			System.out.printf("%d\t",rec[i].tot);//총점
			System.out.printf("%d",rec[i].ave);//평균
			System.out.printf("(%s)\t",panjung(rec[i].ave));//평균판정
			System.out.printf("%d등\n",rec[i].rank);//석차
			System.out.println();
		}		
	}
	
}
