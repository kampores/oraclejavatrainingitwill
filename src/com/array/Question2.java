package com.array;
//20161018
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) throws IOException {
		//2. 1~10������ ������ �߻����� �߻���Ų ������ 3���ȿ� �˾� ���ߴ� ����
		//   (3���ȿ� �˾Ƹ����� ���ϸ� �߻��� ������ ���)
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int i,inputNum,answerNum;
		char yn;
		
		while(true){
			answerNum = rd.nextInt(10)+1;
			for(i=1;i<=3;i++){
				System.out.print("�������߱�: 1~10 ������ ���� �Է��ϼ��� :");
				inputNum = sc.nextInt();
				if(inputNum==answerNum){
					System.out.println("������ϴ�!");
					break;
				}else if(i!=3){
					System.out.println("Ʋ�Ƚ��ϴ�! ��ȸ�� "+(3-i)+"��");
				}else System.out.println("���� �� Ʋ�Ƚ��ϴ�.");
			}
			while(true){
				System.out.print("��ǻ�� : "+answerNum+" ����Ͻðڽ��ϱ�?[Y/N]:");
				yn = (char)System.in.read();
				if(yn=='Y'||yn=='y'||yn=='N'||yn=='n')
					break;
			}
			if(yn=='N'||yn=='n')
				break;
		}			
		sc.close();
	}
}
