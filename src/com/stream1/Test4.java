package com.stream1;
//20161103
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//DataInputStream
//int,byte,short...��� ���� �⺻ �ڷ����� ���� ���� �� �ְ� ���ְ�
//�̷� �б⵿���� �÷��� �����ϰ� �����ϵ��� �Ѵ�
public class Test4 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out9.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeUTF("���ѹα�");
			dos.writeByte(10);
			dos.writeChar('A');
			dos.writeInt(20);
			dos.writeUTF("����");
			
			fos.close();
			
			FileInputStream fis = new FileInputStream("d:\\doc\\out9.txt");
			DataInputStream dis = new DataInputStream(fis);
			
			System.out.println(dis.readUTF());
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readUTF());
			
			fis.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
