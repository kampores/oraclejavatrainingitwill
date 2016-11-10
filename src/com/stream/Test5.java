package com.stream;
//20161102
import java.io.FileInputStream;

//FileInputStream(파일입력)
public class Test5 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("d:\\doc\\test.txt");
			int data;
			
			while((data=fis.read())!=-1){
				//System.out.print((char)data);
				System.out.write(data);//->엔터를 기준으로 저장
				System.out.flush();//->엔터 입력전 자료 출력
			}
			fis.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
