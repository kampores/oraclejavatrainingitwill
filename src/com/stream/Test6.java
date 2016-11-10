package com.stream;

import java.io.FileOutputStream;
//20161102

//FileOutputStream
public class Test6 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out1.txt");
			
			int data;
			System.out.print("¹®ÀÚ¿­: ");
			while((data=System.in.read())!=-1){
				fos.write(data);
				fos.flush();
			}
			fos.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
