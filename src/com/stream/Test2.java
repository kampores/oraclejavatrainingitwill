package com.stream;
import java.io.IOException;
//20161102
import java.io.OutputStream;

//기본입출력 스트림 : out
public class Test2 {
	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;
		
		byte[] b = new byte[3];//buffer
		
		b[0] = 65;
		b[1] = 97;
		b[2] = 122;
		
		os.write(b); //스트림에 기록
		os.close();
		
		System.out.println("나 보이냐?...");
	}
}
