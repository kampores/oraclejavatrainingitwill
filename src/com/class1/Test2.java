package com.class1;
//20161020
import java.util.Scanner;

class Hap{
	int su,sum;
	Scanner sc = new Scanner(System.in);
	
	public void input(){
		System.out.println("�����Է�?");
		su = sc.nextInt();
	}
	
	public int cnt(){
		for(int i=1;i<=su;i++)
			sum+=i;
		return sum;
	}
	
	public void print(int sum){
		System.out.println("�հ�: "+sum);
	}
}

public class Test2 {
	public static void main(String[] args) {
		Hap h = new Hap();
		
		h.input();
		int sum=h.cnt();
		h.print(sum);
	}
}
