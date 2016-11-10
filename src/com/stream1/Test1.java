package com.stream1;
//20161103
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
//RandomAccessFile
//일반적인 파일은 순차적으로 Data를 읽음(카세트테입)
//RandomAccess는 원하는 곳으로 이동해서 읽음(CD)

//단점: 느리다
public class Test1 {
	public static void main(String[] args) throws IOException {
		File f = File.createTempFile("imsi", ".tmp");
		f.deleteOnExit();//프로그램이 종료하면 삭제
		
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
