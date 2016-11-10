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
		System.out.print("학번?");
		hak = sc.next();
		
		if(searchHak(hak)){
			System.out.println("학번이 존재합니다!! 추가 실패!!");
			return;
		}
		
		ScoreVO vo = new ScoreVO();
		
		System.out.print("이름?");
		vo.setName(sc.next());
		System.out.print("국어?");
		vo.setKor(sc.nextInt());
		System.out.print("영어?");
		vo.setEng(sc.nextInt());
		System.out.print("수학?");
		vo.setMat(sc.nextInt());
		
		hMap.put(hak, vo);
		
		System.out.println("추가 성공!\n");
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
		//학번검사
		if(hMap.containsKey(hak))
			return true;//있다
		return false;//없다
		//return hMap.cotainsKey(hak);
	}

	@Override
	public void update() {
		System.out.print("수정할 학번?");
		hak = sc.next();
		
		if(!searchHak(hak))
			System.out.println("해당학번이 존재하지 않습니다.");//수정실패!!
		else{//학번이 있다->수정
			//이름을 수정하지 않으면 NULL
			ScoreVO preVO = hMap.get(hak);
			String name = preVO.getName();
			
			ScoreVO vo = new ScoreVO();
			//ScoreVO vo = hMap.get(hak);
			
			vo.setName(name);
			
			System.out.print("국어?");
			vo.setKor(sc.nextInt());
			System.out.print("영어?");
			vo.setEng(sc.nextInt());
			System.out.print("수학?");
			vo.setMat(sc.nextInt());
			
			hMap.put(hak,vo);
			
			System.out.println("수정성공!!");
		}			
	}

	@Override
	public void delete() {
		System.out.print("삭제할 학번?");
		hak = sc.next();
		
		if(searchHak(hak)){
			hMap.remove(hak);
			System.out.printf("%s학번 학생 삭제 성공!!\n",hak);
		}
		else 
			System.out.println("삭제 실패!!");
	}

	@Override
	public void findHak() {
		System.out.print("검색할 학번?");
		hak = sc.next();
		/*
		//방법1
		ScoreVO vo = hMap.get(hak);
		
		if(vo==null){
			System.out.println("학번이 존재하지 않습니다. 검색실패!!");
			return;
		}
		System.out.println(hak + " " + vo.toString());
		*/
		//방법2
		
		if(!searchHak(hak)){
			System.out.println("학번이 존재하지 않습니다. 검색실패!!");
			return;
		}
		String key = hak;
		ScoreVO vo = hMap.get(key);
		
		System.out.println(hak + " " + vo.toString());
		
		/* //내코드	
		if(!searchHak(hak)){
			ScoreVO vo = hMap.get(hak);//value
			System.out.println(hak + vo.toString());
		}
		else 
			System.out.printf("%s학번 학생이 없습니다.\n",hak);
		*/
	}

	@Override
	public void findName() {
		System.out.print("검색할 이름?");
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
			System.out.println("이름이 존재하지 않습니다. 검색실패!!");
	}
}
//20161031
/*

List<저장할자료형> lists = new ArrayList<저장할자료형>();
List<저장할자료형> lists = new ArrayList<>(); //JDK7.0

ArrayList<저장할자료형> lists = new ArrayList<저장할자료형>();
ArrayList<저장할자료형> lists = new Vector<저장할자료형>();

추가
lists.add(값)

출력
Iterator<저장된자료형> it = lists.iterator();
while(it.hasNext()){
저장된자료형 data = it.next();
:
:
}

삭제
remove(인덱스):특정데이터삭제
clear : 전체데이터삭제
--------------------------------------------------
Map<키자료형,저장할자료형> map = new HashMap<키자료형,저장할자료형>()
Map<키자료형,저장할자료형> map = new HashTable<키자료형,저장할자료형>()

HashMap<키자료형,저장할자료형> map = new HashMap<키자료형,저장할자료형>()
HashTable<키자료형,저장할자료형> map = new HashTable<키자료형,저장할자료형>()

추가
map.put(키,값)

출력
Iterator<저장된자료형> it = map.keySet().iterator();
while(it.hasNext()){
	키자료형 key = it.next();
	저장된자료형 data = map.get(key);
	:
}

삭제
remove(key)
clear()

*/