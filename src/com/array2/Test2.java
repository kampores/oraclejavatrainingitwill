package com.array2;

import java.util.Scanner;
//20161019
public class Test2 {

	public static void main(String[] args) {
		//�ֹε�Ϲ�ȣ �˻�
		//������� ���� �ñ����� ��û���� �����ڵ�
		//850101  - 2   0795     1        8
		//����: 1900��� ��:1 ��:2
		//      2000��� ��:3 ��:4
		//�ܱ���1900��� ��:5 ��:6
		//�ܱ���2000��� ��:7 ��:8
		//
		//�������
		//900311-1076431
		//234567 892345
		//��=(9*2)+(0*3)+...+(3*5)
		//��=11-��%11
		//��=��%10
		//��==1 : ����
		
		/*
		String str = "seoul korea";
		//index:      01234567890
		
		System.out.println(str.substring(0,3));//seo
		System.out.println(str.substring(6,8));//ko
		System.out.println(str.substring(6));//korea
		*/
		
		Scanner sc = new Scanner(System.in);
		
		String str;
		int[] chk = {2,3,4,5,6,7,8,9,2,3,4,5};
		int i,tot,su;
		
		System.out.print("�ֹι�ȣ[xxxxxx-xxxxxxx]?");
		str = sc.next();
		
		if(str.length()!=14){
			System.out.println("�Է� ����!!");
			sc.close();
			return;//stop
		}
		
		tot=0;
		//idx: 01234567890123
		//str: 900311-1076431
		//chk: 234567 892345		
		for(i=0;i<12;i++)
			if(i>=6) //�ֹι�ȣ ���ڸ�
				tot+=chk[i]*Integer.parseInt(str.substring(i+1,i+2));//+1�Ѱ� '-'�ǳʶܿ�
			else //�������
				tot+=chk[i]*Integer.parseInt(str.substring(i,i+1));
		
		su=11-tot%11;
		su=su%10;
		if(su==Integer.parseInt(str.substring(13)))
			System.out.println("��Ȯ�� �ֹι�ȣ!!");//111111-1111118
		else
			System.out.println("����Ȯ�� �ֹι�ȣ!!");
		sc.close();
	}
}
