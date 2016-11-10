package com.stream1;
//20161103
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//DataInputStream
//int,byte,short...등과 같은 기본 자료형을 직업 읽을 수 있게 해주고
//이런 읽기동작은 플랫폼 무관하게 동작하도록 한다
public class Test4 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out9.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeUTF("대한민국");
			dos.writeByte(10);
			dos.writeChar('A');
			dos.writeInt(20);
			dos.writeUTF("서울");
			
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
