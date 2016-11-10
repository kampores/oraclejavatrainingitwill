package com.score1;

import java.util.Scanner;
//20161020
public class Score {
	int inwon;
	Record[] rec = null;
	Scanner sc = new Scanner(System.in);
	
	public void set(){
		do{
			System.out.print("�ο���?");
			inwon=sc.nextInt();
		}while(inwon<1||inwon>10);
		//�迭�� �޸� �Ҵ�
		rec = new Record[inwon];
	}

	public void input(){
		String[] title = {"����?","����?","����?"};
		for(int i=0;i<inwon;i++){
			rec[i] = new Record();
			
			System.out.print((i+1)+"��° �̸�?");//�̸�
			rec[i].name=sc.next();
			for(int j=0;j<rec[i].score.length;j++){
				do{
					System.out.print(title[j]);
					rec[i].score[j] = sc.nextInt();//������
				}while(rec[i].score[j]<0||rec[i].score[j]>100);
				rec[i].tot += rec[i].score[j];//����
			}
			rec[i].ave=rec[i].tot/3;//���
		}
	}
	
	private void ranking(){//����
		int i,j;
		
		for(i=0;i<inwon;i++)
			rec[i].rank=1;//�ʱ�ȭ
		for(i=0;i<inwon-1;i++)
			for(j=i+1;j<inwon;j++)
				if(rec[i].tot>rec[j].tot)
					rec[j].rank++;
				else if(rec[i].tot<rec[j].tot)
					rec[i].rank++;
	}
	
	public void print(){
		ranking();
		System.out.printf("%4s %s %s %s %s %s %s\n","�̸�","����","����","����","����","���","����");
		System.out.println("------------------------------------");
		for(int i=0;i<inwon;i++){
			System.out.printf("%5s",rec[i].name);//�̸�
			for(int j=0;j<3;j++)
				System.out.printf("%5d",rec[i].score[j]);//������
			System.out.printf("%5d",rec[i].tot);//����
			System.out.printf("%5d",rec[i].ave);//���
			System.out.printf("%5d\n",rec[i].rank);//����
		}
	}
}
