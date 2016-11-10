package com.naver;
//20161031
public interface Naver {
	public void join();//가입
	public boolean inputID(NaverVO vo) throws Exception;//아이디입력
	public void inputPW(NaverVO vo);//암호입력
	public void inputName(NaverVO vo);//이름입력
	public void inputGender(NaverVO vo);//성별입력
	public void inputBirth(NaverVO vo);//생일입력
	public void inputEmail(NaverVO vo);//이메일입력
	public void inputCellNum(NaverVO vo);//휴대폰번호입력
	public void print();//출력
	public boolean searchID(String id);//아이디검사
	public void update();//수정
	public void withdraw();//탈퇴
	public void findID();//아이디검색
	public void findName();//이름검색
}
