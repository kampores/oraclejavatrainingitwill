package com.array2;

import java.util.Scanner;
//20161019
//사각형의 넓이와 둘레를 계산
public class Rect {
	
	//선언
	int w,h; //instance변수,전역변수,멤버변수
	
	//입력
	public void input(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로?");//10
		w=sc.nextInt();
		System.out.print("세로?");//20
		h=sc.nextInt();
		
		//return;
		//sc.close();  //따로 close 메소드 필요
	}
	
	//연산
	public int area(){//면적
		int result; //지역변수
		result=w*h;
		return result;
	}
	
	public int length(){//둘레
		return (w+h)*2;
	}
	
	//출력
	public void print(int a, int l){
		System.out.println("가로:"+w);
		System.out.println("세로:"+h);
		System.out.println("면적:"+a);
		System.out.println("둘레:"+l);
	}
}
