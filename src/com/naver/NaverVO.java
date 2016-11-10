package com.naver;
//20161031
import java.util.Calendar;

public class NaverVO {
	private String id;
	private String pw1,pw2;
	private String name;
	private boolean gender;
	private Calendar birth;
	private String email;
	private String cell;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw1() {
		return pw1;
	}
	public void setPw1(String pw1) {
		this.pw1 = pw1;
	}
	public String getPw2() {
		return pw2;
	}
	public void setPw2(String pw2) {
		this.pw2 = pw2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public String getGender() {
		return gender?"³²":"¿©";
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public Calendar getBirth() {
		return birth;
	}
	public String printBirth() {
		return String.format("%4s-%2s-%2s",
				birth.get(Calendar.YEAR),birth.get(Calendar.MONTH)+1,birth.get(Calendar.DATE));
	}
	public void setBirth(Calendar birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCell() {
		return cell;
	}
	public void setCell(String cell) {
		this.cell = cell;
	}
	
	@Override
	public String toString() {
		String str;
				
		str = String.format("%8s %8s %4s %2s %6s %12s %12s",
				id,pw1,name,getGender(),printBirth(),email,cell);
		return str;
	}
}
