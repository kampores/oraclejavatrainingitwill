package com.stream;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Test10 {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out5.txt");
			PrintStream ps = new PrintStream(fos);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str;
			while ((str=br.readLine())!=null)
				System.out.println("문자열");
				ps.print(str);
			ps.close();
			fos.close();//열었던 순서의 반대로 닫는게 좋다
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
