package com.day4;

import java.io.IOException;
import java.util.Scanner;
//20161017
public class Test1 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int num,sum;
		char ch;
		
		while(true){//���ѷ���
			do{
				System.out.print("���Է�?");
				num = sc.nextInt();
			}while(num<1||num>5000);
			sum=0;
			for(int i=1;i<=num;i++){
				sum+=i;
			}
			//���
			System.out.println("1~"+num+"������ ��: "+sum);
			//������࿩��
			System.out.print("����ҷ�?[Y/N]");//Y,y,N,n
			ch = (char)System.in.read();
			if(ch!='Y'&&ch!='y'){
				System.out.println("�����մϴ�!");
				break;//while,do~while,for,switch�������� ��밡��
			}
		}//end..while(true)
		sc.close();
	}//end..main
}
