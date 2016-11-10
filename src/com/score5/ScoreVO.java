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
1.�Է� 2.��� 3.���� 4.����:1
�̸�: ȫ�浿
����: 2000-10-10
����: 30

1.�Է� 2.��� 3.���� 4.����:2
ȫ�浿	2000-10-10	30

1.�Է� 2.��� 3.���� 4.����:3
����Ǿ����ϴ�...

1.�Է� 2.��� 3.���� 4.����:1
�̸�: �����
����: 1997-10-10
����: 24

1.�Է� 2.��� 3.���� 4.����:4   <-- ���ᶧ ��������
=============================����

1.�Է� 2.��� 3.���� 4.����:2
ȫ�浿	2000-10-10	30
�����	1997-10-10	24

1.�Է� 2.��� 3.���� 4.����:1
�̸�: ������
����: 1980-09-20
����: 37

1.�Է� 2.��� 3.���� 4.����:2   <-- ���ϳ��� ����� �޸𸮳��� ���
ȫ�浿	2000-10-10	30
�����	1997-10-10	24
������	1980-09-20	37

[����]
1.List
2.�����ڿ��� ��ü����
3.Serializable
4.d:\\data\\score.txt
*/

