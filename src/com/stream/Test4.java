package com.stream;
//20161102
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

//OutputStreamReader
public class Test4 {
	public static void main(String[] args) throws IOException {
		int data;
		
		System.out.print("문자열입력[종료:ctrl+z]: ");
		Reader rd = new InputStreamReader(System.in);
		Writer wr = new OutputStreamWriter(System.out);
		
		while ((data=rd.read())!=-1) {
			wr.write(data);
			wr.flush();//->패킷이 다 차지 않았어도 출력
		}
	}
}
