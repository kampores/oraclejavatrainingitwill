package com.array2;

import java.util.Scanner;
//20161019
//�簢���� ���̿� �ѷ��� ���
public class Rect {
	
	//����
	int w,h; //instance����,��������,�������
	
	//�Է�
	public void input(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����?");//10
		w=sc.nextInt();
		System.out.print("����?");//20
		h=sc.nextInt();
		
		//return;
		//sc.close();  //���� close �޼ҵ� �ʿ�
	}
	
	//����
	public int area(){//����
		int result; //��������
		result=w*h;
		return result;
	}
	
	public int length(){//�ѷ�
		return (w+h)*2;
	}
	
	//���
	public void print(int a, int l){
		System.out.println("����:"+w);
		System.out.println("����:"+h);
		System.out.println("����:"+a);
		System.out.println("�ѷ�:"+l);
	}
}
