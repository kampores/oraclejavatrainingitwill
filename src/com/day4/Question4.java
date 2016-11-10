package com.day4;
//20161017
public class Question4 {
	public static void main(String[] args) {
		//4. 1에서 100까지의 수중 3의 배수의 갯수
		int i,cnt;
		cnt=0;
		for(i=3;i<=100;i+=3){
			cnt++;
		}
		System.out.println(cnt);
	}
}
