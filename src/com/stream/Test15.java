package com.stream;
//20161102
import java.io.IOException;

//�⺻ ����� ��Ʈ�� ����
//����
//System.in.read()�޼ҵ常 �̿��Ͽ� ���ڸ� �Է¹ް�
//�Է��� �������� �հ踦 ���Ͻÿ�
//BufferedReader,Scanner ���Ұ�
public class Test15 {
	public static void main(String[] args) throws IOException {
		int num=0,sum=0;
		int data;
//		String numBuffer = "";
		
		System.out.print("���?:");//1(49)2(50)3(51)
		while((data=System.in.read())!=13)
			num=num*10+(data-48);
/*			numBuffer = String.format("%s%s",numBuffer,String.valueOf((char)data));
		num = Integer.valueOf(numBuffer);*/ //�����ڵ�		
		for(int i=1;i<=num;i++)
			sum+=i;
		System.out.println("�հ�:" + sum);
	}
}
