package com.array;
//20161018
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) throws IOException {
		//3. 1~3������ ������ �߻����� ����,����,�� ���� ���α׷� �ۼ�
		//   1:����, 2:����, 3:��
		//
		//1:����, 2:����, 3:�� ? 2
		//��ǻ�Ͱ� �̰���ϴ�(������ 3�ΰ��)
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		String[] gawiBawiBo = {"����","����","��"};
		
		int inputNum,answerNum;
		char yn;
		
		do{
			answerNum = rd.nextInt(3)+1;
			do{
				System.out.print("1:����, 2:����, 3:�� ?");
				inputNum = sc.nextInt();
			}while(inputNum<1||inputNum>3);
			if(inputNum==answerNum)
				System.out.println("�����ϴ�. ��� : "+gawiBawiBo[inputNum-1]+" ��ǻ�� : "+gawiBawiBo[answerNum-1]);
			else if((inputNum+1)%3==answerNum%3)
				System.out.println("��ǻ�Ͱ� �̰���ϴ�. ��� : "+gawiBawiBo[inputNum-1]+" ��ǻ�� : "+gawiBawiBo[answerNum-1]);
			else System.out.println("����� �̰���ϴ�. ��� : "+gawiBawiBo[inputNum-1]+" ��ǻ�� : "+gawiBawiBo[answerNum-1]);
			
			while(true){
				System.out.print("����Ͻðڽ��ϱ�?[Y/N]:");
				yn = (char)System.in.read();
				if(yn=='Y'||yn=='y'||yn=='N'||yn=='n')
					break;
			}
			if(yn=='N'||yn=='n')
				break;		
		}while(true);
		sc.close();
	}
}
