package com.naver;
//20161031
public interface Naver {
	public void join();//����
	public boolean inputID(NaverVO vo) throws Exception;//���̵��Է�
	public void inputPW(NaverVO vo);//��ȣ�Է�
	public void inputName(NaverVO vo);//�̸��Է�
	public void inputGender(NaverVO vo);//�����Է�
	public void inputBirth(NaverVO vo);//�����Է�
	public void inputEmail(NaverVO vo);//�̸����Է�
	public void inputCellNum(NaverVO vo);//�޴�����ȣ�Է�
	public void print();//���
	public boolean searchID(String id);//���̵�˻�
	public void update();//����
	public void withdraw();//Ż��
	public void findID();//���̵�˻�
	public void findName();//�̸��˻�
}
