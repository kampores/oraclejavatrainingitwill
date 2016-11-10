package com.array;
//20161018
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) throws IOException {
		//2. 1~10사이의 난수를 발생시켜 발생시킨 난수를 3번안에 알아 맞추는 게임
		//   (3번안에 알아맞추지 못하면 발생된 난수를 출력)
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int i,inputNum,answerNum;
		char yn;
		
		while(true){
			answerNum = rd.nextInt(10)+1;
			for(i=1;i<=3;i++){
				System.out.print("난수맞추기: 1~10 사이의 수를 입력하세요 :");
				inputNum = sc.nextInt();
				if(inputNum==answerNum){
					System.out.println("맞췄습니다!");
					break;
				}else if(i!=3){
					System.out.println("틀렸습니다! 기회는 "+(3-i)+"번");
				}else System.out.println("세번 다 틀렸습니다.");
			}
			while(true){
				System.out.print("컴퓨터 : "+answerNum+" 계속하시겠습니까?[Y/N]:");
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
