package com.score5;
//20161103
import java.io.Serializable;
import java.util.Calendar;

public class ScoreVO implements Serializable{

	private static final long serialVersionUID = 3612310323883806964L;
	private String name;
	private Calendar birth;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Calendar getBirth() {
		return birth;
	}
	public String printBirth() {
		return String.format("%4s-%2s-%2s",
				birth.get(Calendar.YEAR),birth.get(Calendar.MONTH)+1,birth.get(Calendar.DATE));
	}
	public void setBirthDate(Calendar birthDate) {
		this.birth = birthDate;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("%s\t%s\t%s",getName(),printBirth(),getAge());
	}
}
/*
1.입력 2.출력 3.저장 4.종료:1
이름: 홍길동
생일: 2000-10-10
나이: 30

1.입력 2.출력 3.저장 4.종료:2
홍길동	2000-10-10	30

1.입력 2.출력 3.저장 4.종료:3
저장되었습니다...

1.입력 2.출력 3.저장 4.종료:1
이름: 배수지
생일: 1997-10-10
나이: 24

1.입력 2.출력 3.저장 4.종료:4   <-- 종료때 파일저장
=============================종료

1.입력 2.출력 3.저장 4.종료:2
홍길동	2000-10-10	30
배수지	1997-10-10	24

1.입력 2.출력 3.저장 4.종료:1
이름: 전지현
생일: 1980-09-20
나이: 37

1.입력 2.출력 3.저장 4.종료:2   <-- 파일내용 출력후 메모리내용 출력
홍길동	2000-10-10	30
배수지	1997-10-10	24
전지현	1980-09-20	37

[조건]
1.List
2.생성자에서 객체생성
3.Serializable
4.d:\\data\\score.txt
*/

