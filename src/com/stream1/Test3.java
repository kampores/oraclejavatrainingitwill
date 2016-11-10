package com.stream1;
//20161103
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
//FileWriter
//출력할 유니코드 문자열을 시스템에 맞는 디폴트 문자 인코딩의
//바이트로 변환해서 파일에 저장하는 역할을 한다

//BufferedWriter
//필터스트림으로 다른 출력스트림의 생성자의 인자로 받아 생성하며
//문자를 버퍼링 하는 것에따라 문자,배열 또는 String을 문자 형태로
//출력 stream에 출력한다
public class Test3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw = new FileWriter("d:\\doc\\out8.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String str;
		
		System.out.println("문자열입력: ");
		while ((str=br.readLine())!=null) {
			bw.write(str);
			bw.newLine();//str + 엔터(\r\n)
		}
		bw.close();
		fw.close();
		//----------------------------------------
		FileReader fr = new FileReader("d:\\doc\\out8.txt");
		BufferedReader br1 = new BufferedReader(fr);
		
		try {
			String str1;
			while ((str1=br1.readLine())!=null)
				System.out.println(str1);
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
