package com.class2;

import java.io.IOException;
//20161021
//4. �ϳ��� ���ڸ� �Է� �޾� �빮���̸� �ҹ���, �ҹ����̸� �빮��
//��Ÿ �����̸� �Է� ���� ���� ���

class Change{
	
	public char change(char c){
		if((int)c>=65&&(int)c<=90) return (char)(((int)c)+32);
		if((int)c>=97&&(int)c<=122) return (char)(((int)c)-32);
		return c;
	}
}

public class Question4 {
	public static void main(String[] args) throws IOException {
		char c;
		Change ch = new Change();
		
		System.out.print("�����Է�?:");
		c = (char)System.in.read();
		System.out.println(ch.change(c));

	}

}
