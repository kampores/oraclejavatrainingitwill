package com.day4;

import java.io.IOException;
import java.util.Scanner;
//20161017
public class Test1 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int num,sum;
		char ch;
		
		while(true){//무한루프
			do{
				System.out.print("수입력?");
				num = sc.nextInt();
			}while(num<1||num>5000);
			sum=0;
			for(int i=1;i<=num;i++){
				sum+=i;
			}
			//출력
			System.out.println("1~"+num+"까지의 합: "+sum);
			//계속진행여부
			System.out.print("계속할래?[Y/N]");//Y,y,N,n
			ch = (char)System.in.read();
			if(ch!='Y'&&ch!='y'){
				System.out.println("종료합니다!");
				break;//while,do~while,for,switch문에서만 사용가능
			}
		}//end..while(true)
		sc.close();
	}//end..main
}
