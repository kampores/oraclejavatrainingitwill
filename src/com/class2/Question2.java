package com.class2;

import java.util.Scanner;
//20161021
//2. �ϳ��� ������ �Է� �޾� ¦������ Ȧ������ ����
//
//������ �Է��ϼ��� : 7
//Ȧ��

public class Question2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("������ �Է��ϼ��� : ");
		System.out.println(sc.nextInt()%2==0?"¦��":"Ȧ��");
	}

}
