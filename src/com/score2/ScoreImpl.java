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
			System.out.print("�ο���?");
			inwon = sc.nextInt();
		}while(inwon<1||inwon>10);
		
		rec = new Record[inwon];//�迭�ǰ�ü����
	}

	@Override
	public void input() {
		//inwon����ŭ �й�,�̸�,����,����,������ �Է¹޾�
		//rec�迭�� ����
		String[] title = {"����?","����?","����?"};
		int[] score = new int[title.length];
		for(int i=0;i<inwon;i++){
			rec[i] = new Record();
			System.out.print((i+1)+"��° �й�?");//�й�
			rec[i].hak=sc.next();
			System.out.print((i+1)+"��° �̸�?");//�̸�
			rec[i].name=sc.next();
			for(int j=0;j<title.length;j++){
				do{
					System.out.print(title[j]);
					score[j] = sc.nextInt();//������
				}while(score[j]<0||score[j]>100);
				rec[i].tot += score[j];//����
			}
			rec[i].kor=score[0];
			rec[i].eng=score[1];
			rec[i].mat=score[2];
/*			System.out.print("�й�?");//�й�	//�����Թ��
			rec[i].hak=sc.next();
			System.out.print("�̸�?");//�̸�
			rec[i].name=sc.next();
			System.out.print("����?");//����
			rec[i].kor=sc.nextInt();
			System.out.print("����?");//����
			rec[i].eng=sc.nextInt();
			System.out.print("����?");//����
			rec[i].mat=sc.nextInt();
			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;//����
*/			rec[i].ave=rec[i].tot/3;//���
		}
		ranking();
	}
	
	private String panjung(int score) {
		String grade;
		if(score>90) grade="��";
		else if(score>80) grade="��";
		else if(score>70) grade="��";
		else if(score>60) grade="��";
		else grade="��";
		return grade;
		/*String pan;	//�����Թ��
		switch(score/10){
		case (10):
		case 9:
			pan = "��";break;
		case (8):
			pan = "��";break;
		case (7):
			pan = "��";break;
		case (6):
			pan = "��";break;
		default:
			pan = "��";break;
		}
		return pan;*/
	}
	
	private void ranking(){//���������� ��������߰�
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

	@Override
	public void print() {
		//111 ���� 90(��) 70(��) 40(��)
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n","�й�","�̸�","����","����","����","����","���","����");
		System.out.println("--------------------------------------------------------------");
		for(int i=0;i<inwon;i++){
			/*System.out.printf("%s %s %d(%s) %d(%s) %d(%s) %d %d\n", //�����Թ��
					rec[i].hak,rec[i].name,
					rec[i].kor,panjung(rec[i].kor),
					rec[i].eng,panjung(rec[i].eng),
					rec[i].mat,panjung(rec[i].mat),
					rec[i].tot,rec[i].ave);*/
			System.out.printf("%s\t",rec[i].hak);//�й�
			System.out.printf("%s\t",rec[i].name);//�̸�
			System.out.printf("%d",rec[i].kor);//����
			System.out.printf("(%s)\t",panjung(rec[i].kor));//��������
			System.out.printf("%d",rec[i].eng);//����
			System.out.printf("(%s)\t",panjung(rec[i].eng));//��������
			System.out.printf("%d",rec[i].mat);//����
			System.out.printf("(%s)\t",panjung(rec[i].mat));//��������
			System.out.printf("%d\t",rec[i].tot);//����
			System.out.printf("%d",rec[i].ave);//���
			System.out.printf("(%s)\t",panjung(rec[i].ave));//�������
			System.out.printf("%d��\n",rec[i].rank);//����
			System.out.println();
		}		
	}
	
}
