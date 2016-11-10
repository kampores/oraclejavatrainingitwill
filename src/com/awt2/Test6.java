package com.awt2;
//20161107
import java.lang.reflect.Method;

class Exam{
	public Integer hap(Integer a, Integer b){
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public void write(String title, int result){
		System.out.println(title + ":" + result);
	}
}

public class Test6 {
	public static void main(String[] args) {
		try {
			//클래스의 정보
			Class cls = Class.forName("com.awt2.Exam");
			
			//객체생성
			Object ob = cls.newInstance();//newInstance가 new보다 자원을 덜먹음
			
			//Exam 클래스의 메소드 리턴
			Method hap = cls.getDeclaredMethod("hap", new Class[]{Integer.class, Integer.class});
			Method sub = cls.getDeclaredMethod("sub", new Class[]{int.class, int.class});
			Method write = cls.getDeclaredMethod("write", new Class[]{String.class, int.class});
			
			//인수가 없는 메소드
			//Method m = cls.getDeclaredMethod("write", null);
			
			//메소드 호출(invoke)
			Object h = hap.invoke(ob, new Object[]{20,10});
			write.invoke(ob, new Object[]{"합", h});
			
			Integer i = (Integer)sub.invoke(ob, new Object[]{20,10});
			write.invoke(ob, new Object[]{"차", i});
			
			//인수가 없는경우
			//write.invoke(ob, null);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
