package com.stream;
//20161102
import java.io.File;
import java.io.FileOutputStream;

public class Test13 {
	public static void main(String[] args) {
		String str1 = "d:\\temp\\java1\\test.txt";
		//[방법1]
		String path = str1.substring(0,str1.lastIndexOf("\\"));
		//System.out.println(path);
		
		File f = new File(path);
		
		if(!f.exists())
			f.mkdirs();
		//----------------------------------------------------
		/*
		//[방법2]
		File f = new File(str1);
		
		if(!f.getParentFile().exists())
			f.getParentFile().mkdirs();
		*/
		
		//공통영역
		try {
			FileOutputStream fos = new FileOutputStream(str1);
			System.out.print("문자열입력: ");
			
			int data;
			while ((data=System.in.read())!=-1) {
				fos.write(data);
				fos.flush();
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
