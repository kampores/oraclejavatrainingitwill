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
			System.out.print("아이디?");
			String id = sc.next();
			
			if(searchID(id)){
				System.out.println("동일한 아이디가 존재합니다!! 추가 실패!!");
				answer = false;
				break;
			}
			
			if(id.length()<8||id.length()>15)
				throw new MyException("아이디의 길이는 8~15자 입니다.");
			for(int i=0;i<id.length();i++){
				char ch=id.charAt(i);
				if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
					eng++;
				else if(ch>='0'&&ch<='9')
					num++;
			}
			if(eng==0||num==0){
				throw new MyException("영문자,숫자혼용만 가능합니다.");
			}
			vo.setId(id);
			System.out.println("아이디 등록했습니다.");
			answer = true;
			break;
		}
		return answer;
	}

	@Override
	public void inputPW(NaverVO vo) {
		do{
			System.out.print("암호?");
			vo.setPw1(sc.next());
			System.out.print("암호(재확인)?");
			vo.setPw2(sc.next());
		} while (!vo.getPw1().equals(vo.getPw2()));
	}

	@Override
	public void inputName(NaverVO vo) {
		System.out.print("이름?");
		vo.setName(sc.next());
	}

	@Override
	public void inputGender(NaverVO vo) {
		int gender = 0;
		do {
			System.out.print("성별(남:1, 여:2)?");
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
		System.out.print("생년?");
		year=sc.nextInt();
		System.out.print("생월?");
		month=sc.nextInt();
		System.out.print("생일?");
		date=sc.nextInt();
		birth.set(year, month-1, date);
		vo.setBirth(birth);
	}

	@Override
	public void inputEmail(NaverVO vo) {
		System.out.print("이메일?");
		vo.setEmail(sc.next());
	}



	@Override
	public void inputCellNum(NaverVO vo) {
		System.out.print("휴대전화번호?");
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
		
		System.out.println("추가 성공!\n");
		
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
		//아이디검사
		boolean answer = false;
		for (NaverVO vo : lists) {
			if(vo.getId().equals(id)){
				answer = true;//동일한 ID
				break;
			}
		}
		return answer;
	}

	@Override
	public void update() {
		System.out.print("정보수정할 아이디?");
		
		String id = sc.next();
		
		if(!searchID(id)){
			System.out.println("해당 아이디가 존재하지 않습니다.");//수정실패!!
			return;
		}
		else{//아이디가 있다->수정
			Iterator<NaverVO> it = lists.iterator();
			while (it.hasNext()) {
				NaverVO vo = it.next();
				if (vo.getId().equals(id)){
					System.out.println(vo.toString());

					int ch;
					
					do{
						System.out.print("수정대상 1.아이디 2.암호 3.이름 4.성별 5.생일 6.이메일 7.휴대폰번호 :");
						ch = sc.nextInt();
					}while(ch<1&&ch>7);
					switch(ch){
					case 1:
						do{
							System.out.print("아이디(다른아이디와겹치면 재질문)?");
							id = sc.next();
						} while(searchID(id));
						vo.setId(id);
						break;
					case 2:
						do{
							System.out.print("암호?");
							vo.setPw1(sc.next());
							System.out.print("암호(재확인)?");
							vo.setPw2(sc.next());
						} while (!vo.getPw1().equals(vo.getPw2()));
						break;
					case 3:
						System.out.print("이름?");
						vo.setName(sc.next());
						break;
					case 4:
						int gender = 0;
						do {
							System.out.print("성별(남:1, 여:2)?");
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
						System.out.print("생년?");
						year=sc.nextInt();
						System.out.print("생월?");
						month=sc.nextInt();
						System.out.print("생일?");
						date=sc.nextInt();
						birth.set(year, month-1, date);
						vo.setBirth(birth);
						break;
					case 6:
						System.out.print("이메일?");
						vo.setEmail(sc.next());
						break;
					case 7:
						System.out.print("휴대전화번호?");
						vo.setCell(sc.next());
						break;
					default:
						System.out.println("잘못눌렀습니다.");
					}//end switch
					System.out.println("아래와같이 수정되었습니다");
					System.out.println(vo.toString());
				}//endif
			}//end else
		}			
	}

	@Override
	public void withdraw() {
		String id;
		boolean search = false;
		
		System.out.print("탈퇴할 아이디?");
		id = sc.next();
		
		Iterator<NaverVO> it = lists.iterator();
		while (it.hasNext()) {
			NaverVO vo = it.next();
			if (vo.getId().equals(id)){
				it.remove();
				System.out.println("탈퇴되었습니다");
				search = true;
				break;
			}
		}
		if(!search)
			System.out.println("해당 아이디가 없습니다");
	}

	@Override
	public void findID() {
		boolean search = false;
		System.out.print("검색할 아이디?");
		String id = sc.next();
		
		if(!searchID(id)){
			System.out.println("해당 아이디가 존재하지 않습니다. 검색실패!!");
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
			System.out.println("해당 아이디가 없습니다");
	}

	@Override
	public void findName() {
		System.out.print("검색할 이름?");
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
			System.out.println("이름이 존재하지 않습니다. 검색실패!!");
	}

}
