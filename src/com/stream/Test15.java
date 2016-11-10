package com.stream;
//20161102
import java.io.IOException;

//기본 입출력 스트림 문제
//조건
//System.in.read()메소드만 이용하여 숫자를 입력받고
//입력한 수까지의 합계를 구하시오
//BufferedReader,Scanner 사용불가
public class Test15 {
	public static void main(String[] args) throws IOException {
		int num=0,sum=0;
		int data;
//		String numBuffer = "";
		
		System.out.print("어떤수?:");//1(49)2(50)3(51)
		while((data=System.in.read())!=13)
			num=num*10+(data-48);
/*			numBuffer = String.format("%s%s",numBuffer,String.valueOf((char)data));
		num = Integer.valueOf(numBuffer);*/ //개인코드		
		for(int i=1;i<=num;i++)
			sum+=i;
		System.out.println("합계:" + sum);
	}
}
