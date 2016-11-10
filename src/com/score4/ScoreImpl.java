package com.score4;
//20161028
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ScoreImpl implements Score{
	private Map<String, ScoreVO> hMap = new HashMap<String, ScoreVO>();
	Scanner sc = new Scanner(System.in);
	String hak;	
	
	@Override
	public void input() {
		System.out.print("�й�?");
		hak = sc.next();
		
		if(searchHak(hak)){
			System.out.println("�й��� �����մϴ�!! �߰� ����!!");
			return;
		}
		
		ScoreVO vo = new ScoreVO();
		
		System.out.print("�̸�?");
		vo.setName(sc.next());
		System.out.print("����?");
		vo.setKor(sc.nextInt());
		System.out.print("����?");
		vo.setEng(sc.nextInt());
		System.out.print("����?");
		vo.setMat(sc.nextInt());
		
		hMap.put(hak, vo);
		
		System.out.println("�߰� ����!\n");
	}

	@Override
	public void print() {
		Iterator<String> it = hMap.keySet().iterator();
		
		while (it.hasNext()) {
			String key = it.next();//key
			ScoreVO vo = hMap.get(key);//value
			System.out.println(key + vo.toString());
		}
	}

	@Override
	public boolean searchHak(String hak) {
		//�й��˻�
		if(hMap.containsKey(hak))
			return true;//�ִ�
		return false;//����
		//return hMap.cotainsKey(hak);
	}

	@Override
	public void update() {
		System.out.print("������ �й�?");
		hak = sc.next();
		
		if(!searchHak(hak))
			System.out.println("�ش��й��� �������� �ʽ��ϴ�.");//��������!!
		else{//�й��� �ִ�->����
			//�̸��� �������� ������ NULL
			ScoreVO preVO = hMap.get(hak);
			String name = preVO.getName();
			
			ScoreVO vo = new ScoreVO();
			//ScoreVO vo = hMap.get(hak);
			
			vo.setName(name);
			
			System.out.print("����?");
			vo.setKor(sc.nextInt());
			System.out.print("����?");
			vo.setEng(sc.nextInt());
			System.out.print("����?");
			vo.setMat(sc.nextInt());
			
			hMap.put(hak,vo);
			
			System.out.println("��������!!");
		}			
	}

	@Override
	public void delete() {
		System.out.print("������ �й�?");
		hak = sc.next();
		
		if(searchHak(hak)){
			hMap.remove(hak);
			System.out.printf("%s�й� �л� ���� ����!!\n",hak);
		}
		else 
			System.out.println("���� ����!!");
	}

	@Override
	public void findHak() {
		System.out.print("�˻��� �й�?");
		hak = sc.next();
		/*
		//���1
		ScoreVO vo = hMap.get(hak);
		
		if(vo==null){
			System.out.println("�й��� �������� �ʽ��ϴ�. �˻�����!!");
			return;
		}
		System.out.println(hak + " " + vo.toString());
		*/
		//���2
		
		if(!searchHak(hak)){
			System.out.println("�й��� �������� �ʽ��ϴ�. �˻�����!!");
			return;
		}
		String key = hak;
		ScoreVO vo = hMap.get(key);
		
		System.out.println(hak + " " + vo.toString());
		
		/* //���ڵ�	
		if(!searchHak(hak)){
			ScoreVO vo = hMap.get(hak);//value
			System.out.println(hak + vo.toString());
		}
		else 
			System.out.printf("%s�й� �л��� �����ϴ�.\n",hak);
		*/
	}

	@Override
	public void findName() {
		System.out.print("�˻��� �̸�?");
		String name = sc.next();

		Iterator<String> it = hMap.keySet().iterator();
		
		boolean flag = false;
		
		while (it.hasNext()) {
			String key = it.next();//key
			ScoreVO vo = hMap.get(key);//value
			if(vo.getName().equals(name)){
				System.out.println(key + vo.toString());
				//break;
				flag = true;
			}
		}
		//if(!it.hasNext())
		if(!flag)
			System.out.println("�̸��� �������� �ʽ��ϴ�. �˻�����!!");
	}
}
//20161031
/*

List<�������ڷ���> lists = new ArrayList<�������ڷ���>();
List<�������ڷ���> lists = new ArrayList<>(); //JDK7.0

ArrayList<�������ڷ���> lists = new ArrayList<�������ڷ���>();
ArrayList<�������ڷ���> lists = new Vector<�������ڷ���>();

�߰�
lists.add(��)

���
Iterator<������ڷ���> it = lists.iterator();
while(it.hasNext()){
������ڷ��� data = it.next();
:
:
}

����
remove(�ε���):Ư�������ͻ���
clear : ��ü�����ͻ���
--------------------------------------------------
Map<Ű�ڷ���,�������ڷ���> map = new HashMap<Ű�ڷ���,�������ڷ���>()
Map<Ű�ڷ���,�������ڷ���> map = new HashTable<Ű�ڷ���,�������ڷ���>()

HashMap<Ű�ڷ���,�������ڷ���> map = new HashMap<Ű�ڷ���,�������ڷ���>()
HashTable<Ű�ڷ���,�������ڷ���> map = new HashTable<Ű�ڷ���,�������ڷ���>()

�߰�
map.put(Ű,��)

���
Iterator<������ڷ���> it = map.keySet().iterator();
while(it.hasNext()){
	Ű�ڷ��� key = it.next();
	������ڷ��� data = map.get(key);
	:
}

����
remove(key)
clear()

*/