package com.stream;
//20161102
import java.io.IOException;

//����� ��Ʈ�� -> ��Ʈ���� ��������
//������ ����½� ��� �����͸� ���¿ʹ� �������
//�Ϸõ� �帧���� �����ϴ°�

//����Ʈ��Ʈ��
//�⺻����� ��Ʈ�� : in
public class Test1 {
	public static void main(String[] args) throws IOException {
		int data;
		
		System.out.print("���ڿ� �Է�[����:ctrl+z]: ");
		while ((data=System.in.read())!=-1) {
			char ch = (char)data;
			System.out.print(ch);
		}
	}
}
