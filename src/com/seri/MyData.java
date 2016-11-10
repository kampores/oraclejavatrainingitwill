package com.seri;
//20161103
import java.io.Serializable;

public class MyData implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private int score;
	private transient String password; //<- 파일에는 저장안함
	
	public MyData() {
	
	}
	
	public MyData(String name, int score, String password) {
		this.name = name;
		this.score = score;
		this.password = password;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
