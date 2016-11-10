package com.stream;
//20161102
import java.io.File;
import java.util.Date;

//File
//파일 및 폴더를 관리할 수 있도록 기능을 제공해주는 클래스
//파일의 복사 또는 이름변경등의 조작을 할 경우에 사용될뿐
//파일의 내용을 입출력하기위한 메소드를 제공하지 않는다
public class Test12 {
	public static void main(String[] args) {
		try {
			File f = new File("d:\\doc\\test1.txt");
			
			System.out.println("파일 정보.....");
			System.out.println("파일명: " + f.getName());
			System.out.println("파일크기: " + f.length());
			System.out.println("파일경로: " + f.getAbsolutePath());
			System.out.println("표준경로: " + f.getCanonicalPath());
			System.out.println("작성일: " +	new Date(f.lastModified()));
			System.out.println("파일패스: " + f.getParent());
			System.out.println("읽기속성: " + f.canRead());
			System.out.println("쓰기속성: " + f.canWrite());
			
			//현재 프로그램상 경로
			String p = System.getProperty("user.dir");
			System.out.println("현재 경로: " + p);//d:\\java\\work\\demo
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

