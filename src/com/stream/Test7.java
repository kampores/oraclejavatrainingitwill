package com.stream;
//20161102
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

//파일 복사 프로그램

//원본파일:d:\\doc\\test.txt
//대상파일:d:\\doc\\out2.txt
//복사완료!!
public class Test7 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1,str2;
		int data;
		
		try {
			System.out.print("원본파일: ");
			str1 = br.readLine();
			System.out.print("대상파일: ");
			str2 = br.readLine();
			
			FileInputStream fis = new FileInputStream(str1);
			FileOutputStream fos = new FileOutputStream(str2);
			
			while((data=fis.read())!=-1){
				fos.write(data);
			}
			//fos.flush();
			fis.close();
			fos.close();//<-.close(); 는 자동으로 flush(); 를 호출
			System.out.println("복사완료!!");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
