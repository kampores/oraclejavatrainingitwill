package com.stream;
//20161102
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

//InputStreamReader
//1byte�� stream�� 2byte stream���� ��ȯ���ִ� stream
//�긴����Ʈ��
public class Test3 {
	public static void main(String[] args) throws IOException {
		int data;
		
		System.out.print("���ڿ� �Է�[����:ctrl+z]: ");
		Reader rd = new InputStreamReader(System.in);
		while((data=rd.read())!=-1){
			char ch = (char)data;
			System.out.print(ch);
		}
	}
}
