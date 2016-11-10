package com.stream1;
//20161103
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
//RandomAccessFile
//�Ϲ����� ������ ���������� Data�� ����(ī��Ʈ����)
//RandomAccess�� ���ϴ� ������ �̵��ؼ� ����(CD)

//����: ������
public class Test1 {
	public static void main(String[] args) throws IOException {
		File f = File.createTempFile("imsi", ".tmp");
		f.deleteOnExit();//���α׷��� �����ϸ� ����
		
		FileOutputStream fos = new FileOutputStream(f);
		
		for(int i=0;i<=100;i++)
			fos.write(i);
		fos.close();
		
		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		
		raf.seek(30);
		System.out.println("seek(30): " + raf.readByte());
		
		raf.seek(0);
		System.out.println("seek(0): " + raf.readByte());
		
		for(int i=0;i<=100;i++){
			raf.seek(i);
			System.out.println(raf.readByte());
		}
		raf.close();
	}
}
