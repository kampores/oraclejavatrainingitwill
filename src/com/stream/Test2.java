package com.stream;
import java.io.IOException;
//20161102
import java.io.OutputStream;

//�⺻����� ��Ʈ�� : out
public class Test2 {
	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;
		
		byte[] b = new byte[3];//buffer
		
		b[0] = 65;
		b[1] = 97;
		b[2] = 122;
		
		os.write(b); //��Ʈ���� ���
		os.close();
		
		System.out.println("�� ���̳�?...");
	}
}
