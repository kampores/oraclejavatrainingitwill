package com.naver;
//20161031
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class NaverImpl implements Naver{
	List<NaverVO> lists = new ArrayList<NaverVO>();
	Scanner sc = new Scanner(System.in);

	@Override
	public boolean inputID(NaverVO vo) throws MyException {
		boolean answer = false;
		while(true){
			int eng=0,num=0;
			System.out.print("���̵�?");
			String id = sc.next();
			
			if(searchID(id)){
				System.out.println("������ ���̵� �����մϴ�!! �߰� ����!!");
				answer = false;
				break;
			}
			
			if(id.length()<8||id.length()>15)
				throw new MyException("���̵��� ���̴� 8~15�� �Դϴ�.");
			for(int i=0;i<id.length();i++){
				char ch=id.charAt(i);
				if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
					eng++;
				else if(ch>='0'&&ch<='9')
					num++;
			}
			if(eng==0||num==0){
				throw new MyException("������,����ȥ�븸 �����մϴ�.");
			}
			vo.setId(id);
			System.out.println("���̵� ����߽��ϴ�.");
			answer = true;
			break;
		}
		return answer;
	}

	@Override
	public void inputPW(NaverVO vo) {
		do{
			System.out.print("��ȣ?");
			vo.setPw1(sc.next());
			System.out.print("��ȣ(��Ȯ��)?");
			vo.setPw2(sc.next());
		} while (!vo.getPw1().equals(vo.getPw2()));
	}

	@Override
	public void inputName(NaverVO vo) {
		System.out.print("�̸�?");
		vo.setName(sc.next());
	}

	@Override
	public void inputGender(NaverVO vo) {
		int gender = 0;
		do {
			System.out.print("����(��:1, ��:2)?");
			gender = sc.nextInt();
		} while (gender!=1&&gender!=2);
		if (gender==1)
			vo.setGender(true);
		else 
			vo.setGender(false);
	}

	@Override
	public void inputBirth(NaverVO vo) {
		int year,month,date;
		Calendar birth = Calendar.getInstance();
		System.out.print("����?");
		year=sc.nextInt();
		System.out.print("����?");
		month=sc.nextInt();
		System.out.print("����?");
		date=sc.nextInt();
		birth.set(year, month-1, date);
		vo.setBirth(birth);
	}

	@Override
	public void inputEmail(NaverVO vo) {
		System.out.print("�̸���?");
		vo.setEmail(sc.next());
	}



	@Override
	public void inputCellNum(NaverVO vo) {
		System.out.print("�޴���ȭ��ȣ?");
		vo.setCell(sc.next());
	}

	@Override
	public void join() {
		
		NaverVO vo = new NaverVO();
		boolean answer = false;
		do{
			try {
				answer = inputID(vo);
			} catch (MyException e) {
				System.out.println(e.toString());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}				
		} while (!answer);
		inputPW(vo);
		inputName(vo);
		inputGender(vo);
		inputBirth(vo);
		inputEmail(vo);
		inputCellNum(vo);
		
		lists.add(vo);
		
		System.out.println("�߰� ����!\n");
		
	}

	@Override
	public void print() {
		Iterator<NaverVO> it = lists.iterator();

		while (it.hasNext()) {
			NaverVO vo = it.next();
			System.out.println(vo.toString());
		}		
	}

	@Override
	public boolean searchID(String id) {
		//���̵�˻�
		boolean answer = false;
		for (NaverVO vo : lists) {
			if(vo.getId().equals(id)){
				answer = true;//������ ID
				break;
			}
		}
		return answer;
	}

	@Override
	public void update() {
		System.out.print("���������� ���̵�?");
		
		String id = sc.next();
		
		if(!searchID(id)){
			System.out.println("�ش� ���̵� �������� �ʽ��ϴ�.");//��������!!
			return;
		}
		else{//���̵� �ִ�->����
			Iterator<NaverVO> it = lists.iterator();
			while (it.hasNext()) {
				NaverVO vo = it.next();
				if (vo.getId().equals(id)){
					System.out.println(vo.toString());

					int ch;
					
					do{
						System.out.print("������� 1.���̵� 2.��ȣ 3.�̸� 4.���� 5.���� 6.�̸��� 7.�޴�����ȣ :");
						ch = sc.nextInt();
					}while(ch<1&&ch>7);
					switch(ch){
					case 1:
						do{
							System.out.print("���̵�(�ٸ����̵�Ͱ�ġ�� ������)?");
							id = sc.next();
						} while(searchID(id));
						vo.setId(id);
						break;
					case 2:
						do{
							System.out.print("��ȣ?");
							vo.setPw1(sc.next());
							System.out.print("��ȣ(��Ȯ��)?");
							vo.setPw2(sc.next());
						} while (!vo.getPw1().equals(vo.getPw2()));
						break;
					case 3:
						System.out.print("�̸�?");
						vo.setName(sc.next());
						break;
					case 4:
						int gender = 0;
						do {
							System.out.print("����(��:1, ��:2)?");
							gender = sc.nextInt();
						} while (gender!=1&&gender!=2);
						if (gender==1)
							vo.setGender(true);
						else 
							vo.setGender(false);
						break;
					case 5:
						int year,month,date;
						Calendar birth = Calendar.getInstance();
						System.out.print("����?");
						year=sc.nextInt();
						System.out.print("����?");
						month=sc.nextInt();
						System.out.print("����?");
						date=sc.nextInt();
						birth.set(year, month-1, date);
						vo.setBirth(birth);
						break;
					case 6:
						System.out.print("�̸���?");
						vo.setEmail(sc.next());
						break;
					case 7:
						System.out.print("�޴���ȭ��ȣ?");
						vo.setCell(sc.next());
						break;
					default:
						System.out.println("�߸��������ϴ�.");
					}//end switch
					System.out.println("�Ʒ��Ͱ��� �����Ǿ����ϴ�");
					System.out.println(vo.toString());
				}//endif
			}//end else
		}			
	}

	@Override
	public void withdraw() {
		String id;
		boolean search = false;
		
		System.out.print("Ż���� ���̵�?");
		id = sc.next();
		
		Iterator<NaverVO> it = lists.iterator();
		while (it.hasNext()) {
			NaverVO vo = it.next();
			if (vo.getId().equals(id)){
				it.remove();
				System.out.println("Ż��Ǿ����ϴ�");
				search = true;
				break;
			}
		}
		if(!search)
			System.out.println("�ش� ���̵� �����ϴ�");
	}

	@Override
	public void findID() {
		boolean search = false;
		System.out.print("�˻��� ���̵�?");
		String id = sc.next();
		
		if(!searchID(id)){
			System.out.println("�ش� ���̵� �������� �ʽ��ϴ�. �˻�����!!");
			return;
		}
		Iterator<NaverVO> it = lists.iterator();
		while (it.hasNext()) {
			NaverVO vo = it.next();
			if (vo.getId().equals(id)){
				System.out.println(vo.toString());
				search = true;
				break;
			}
		}
		if(!search)
			System.out.println("�ش� ���̵� �����ϴ�");
	}

	@Override
	public void findName() {
		System.out.print("�˻��� �̸�?");
		String name = sc.next();

		Iterator<NaverVO> it = lists.iterator();
		
		boolean flag = false;
		
		while (it.hasNext()) {
			NaverVO vo = it.next();
			if(vo.getName().equals(name)){
				System.out.println(vo.toString());
				flag = true;
			}
		}
		if(!flag)
			System.out.println("�̸��� �������� �ʽ��ϴ�. �˻�����!!");
	}

}
