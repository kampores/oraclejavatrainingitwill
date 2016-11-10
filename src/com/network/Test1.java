package com.network;
//20161107
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class Test1 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String host;
			
			System.out.print("호스트[www.naver.com]? ");
			host = br.readLine();
			
			InetAddress ia = InetAddress.getByName(host);
			
			System.out.println("ip주소: " + ia.getHostAddress());
			System.out.println("호스트: " + ia.getHostName());
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
