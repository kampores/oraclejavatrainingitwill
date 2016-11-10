package com.stream1;
//20161103
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//�ܼ��� buffer�� ���
public class Test2 {
	public final static int BUFFER_SIZE = 512;//1M�̸�
	
	public static void main(String[] args) {
		byte[] buffer = new byte[BUFFER_SIZE];
		try {
			FileInputStream fis = new FileInputStream("d:\\doc\\test1.txt");
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out7.txt");
			//Buffer�� �ѹ��� ������ ����
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos,BUFFER_SIZE);
			int n,len=0;
			
			while ((n=bis.read(buffer))!=-1) {
				System.out.println("���� ������ ����: " + n);
				len+=n;
				bos.write(buffer,0,n);//buffer������ 0�������� ��(n)
				bos.flush();
			}
			//�ѱ�2,����2,�����̽�1
			System.out.println("�о���� ��ü ����: " + len);
			fis.close();
			fos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
