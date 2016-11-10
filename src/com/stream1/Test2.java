package com.stream1;
//20161103
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//단순히 buffer를 사용
public class Test2 {
	public final static int BUFFER_SIZE = 512;//1M미만
	
	public static void main(String[] args) {
		byte[] buffer = new byte[BUFFER_SIZE];
		try {
			FileInputStream fis = new FileInputStream("d:\\doc\\test1.txt");
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out7.txt");
			//Buffer로 한번더 감싸준 형태
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos,BUFFER_SIZE);
			int n,len=0;
			
			while ((n=bis.read(buffer))!=-1) {
				System.out.println("읽은 문자의 길이: " + n);
				len+=n;
				bos.write(buffer,0,n);//buffer내용을 0에서부터 끝(n)
				bos.flush();
			}
			//한글2,엔터2,스페이스1
			System.out.println("읽어들인 전체 길이: " + len);
			fis.close();
			fos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
