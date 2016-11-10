package com.class2;

import java.util.Scanner;
//20161021
//1. 이름,국어,영어,수학을 입력받아 판정 구하기
//이름 국어 영어 수학 ?옥주현 78 54 89
//이름 : 옥주현 국어 : 78(미), 영어 : 54(가),  수학 : 89(우)
class Student{

	private String name;
	private int korean;
	private int english;
	private int math;

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public String getName() {
		return name;
	}

	
	public void setName(String name){
		this.name = name;
	}
}

class Controller{
	Scanner sc = new Scanner(System.in);
	
	public void input(Student st){
		System.out.print("이름 국어 영어 수학?");
		st.setName(sc.next());
		st.setKorean(sc.nextInt());
		st.setEnglish(sc.nextInt());
		st.setMath(sc.nextInt());
	}
	
	private char calculateGrade(int score){
		char grade;
		if(score>90) grade='수';
		else if(score>80) grade='우';
		else if(score>70) grade='미';
		else if(score>60) grade='양';
		else grade='가';
		return grade;
	}
	
	public void output(Student st){
		System.out.printf("이름 : %s 국어 : %d(%s), 영어 : %d(%s), 수학 : %d(%s)"
				,st.getName(),
				st.getKorean(),calculateGrade(st.getKorean()),
				st.getEnglish(),calculateGrade(st.getEnglish()),
				st.getMath(),calculateGrade(st.getMath()));
	}
}

public class Question1 {
	public static void main(String[] args) {
		Student st = new Student();
		Controller ct = new Controller();
		ct.input(st);
		ct.output(st);
	}
}
