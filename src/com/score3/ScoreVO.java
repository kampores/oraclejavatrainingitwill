package com.score3;
//20161027
public class ScoreVO {// Value Object --> DTO : Data Transfer Object
						//DAO : Data Access Object
	private String hak;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;


	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTot() {
		return kor+eng+mat;
	}
	
	@Override
	public String toString() {
		if (hak == null || name == null)
			return null;
		String str = String.format("%4s %6s %d %d %d %d %5.1f",
				hak, name, kor,	eng, mat, getTot(), getTot() / 3.0);
		return str;
	}
}
