package com.stream;
//20161102
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Test11 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos;
			PrintStream ps;
			
			fos = new FileOutputStream("d:\\doc\\out6.txt");
			ps = new PrintStream(fos);
			ps.println("배수지");
			ps.println("송지효");
			ps.println("전지현");
			ps.println("천송이");
			
			//true:append
			fos = new FileOutputStream("d:\\doc\\out6.txt",true);
			ps = new PrintStream(fos);
			
			ps.println("수요일");
			ps.println("목요일");
			ps.println("금요일");
			
			ps.close();
			fos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
