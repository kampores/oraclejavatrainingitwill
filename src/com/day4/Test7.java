package com.day4;

import java.util.Scanner;
//20161017
public class Test7 {

	public static void main(String[] args) {
		//�迭
		int[] num = new int [5];
		//int num[] = new int [5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("5���� ����?");//4 7 6 8 9 		
		
		for(int i=0;i<num.length;i++){
			num[i] = sc.nextInt();
		}
		
		for(int i=0;i<num.length;i++){
			System.out.println("num["+i+"]:"+num[i]);
		}
		
		num[3] = 400;
		System.out.println("num[3]:"+num[3]);
		
		System.out.println("�迭�� ����: "+num.length+"��");
		
		int a;
		a=num[2];
		System.out.println(a);
		sc.close();
		/*
		 [�ڷ���]
		 boolean : 1byte(true/false)
		 
		 ����
		 byte : 1byte(-128~127)
		 short : 2byte
		 int : 4byte
		 long : 8byte
		 
		 10����:20
		 8����:016
		 16����:0x17
		 
		 �Ǽ�
		 float:4byte(������:3.14f)
		 double:8byte(������:3.14)
		 
		 ����
		 char : unicode
		 ���ڻ�� : 'a'
		 
		 [������]
		 ���������
		 +,-,*,/,%,++,--
		 
		 ���迬����
		 >,>=,<,<=,->
		 
		 �������
		 ==,!=
		 
		 ��������
		 &&(and),||(or),!(not)
		 
		 ��Ʈ����
		 &,|��,^,~,>>,<<,>>>
		 
		 ���׿�����
		 ����?���϶���:�����϶���
		 
		 ���Կ�����
		 
		 =,+=,-=,*=,/=,%=
		
		---------------------------------------
		
		int a=10;
		float b;
		
		b=a;		--�Ͻ�������ȯ(10.0)
		b=(float)a;	--���������ȯ(10.0)
		
		b=2.5;
		
		a=b;		--�ԷºҰ�
		a=int(b);	--����(2)
		
		[���]
		
		if(����){ //true�϶�
			�۾�
		}
		
		if(����){
			�۾�1
		}else{
			�۾�2
		}
		
		if(����1){
			�۾�1
		}else if(����2){
			�۾�2
		}else if(����3){
		}	�۾�3
		}else{
			�۾�4
		}
		
		while(����){
		 	�۾�
		}
		
		do{
			�۾�
		}while(����);
		
		for(���۰�;�ִ밪;������){
			�۾�
		}
		
		while(true){
			�۾�
		}
		
		*/
		
	}
}
