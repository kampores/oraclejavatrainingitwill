package com.score3;
//20161027
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score {
	List<ScoreVO> lists = new ArrayList<ScoreVO>();
	Scanner sc = new Scanner(System.in);
	
	@Override
	public int input() {
		int result = 0;

		ScoreVO vo = new ScoreVO();

		System.out.print("학번?");
		vo.setHak(sc.next());
		System.out.print("이름?");
		vo.setName(sc.next());
		System.out.print("국어?");
		vo.setKor(sc.nextInt());
		System.out.print("영어?");
		vo.setEng(sc.nextInt());
		System.out.print("수학?");
		vo.setMat(sc.nextInt());

		lists.add(vo);
		return result;
	}

	@Override
	public void print() {
		Iterator<ScoreVO> it = lists.iterator();

		while (it.hasNext()) {
			ScoreVO vo = it.next();
			System.out.println(vo.toString());
		}
	}
	
	@Override
	public void searchHak() {
		System.out.print("검색할 학번?");
		String hak = sc.next();
		Iterator<ScoreVO> it = lists.iterator();
		Boolean searchOK = false;
		while (it.hasNext()) {
			ScoreVO vo = it.next();
			if (vo.getHak().equals(hak)){
				System.out.println("검색성공:" + vo.toString());
				searchOK=true;
				break;
			}
		}
		if(!searchOK)
			System.out.println("검색실패");
	}

	@Override
	public void searchName() {
		System.out.print("검색할 이름?");
		String name = sc.next();
		Iterator<ScoreVO> it = lists.iterator();
		Boolean searchOK = false;
		while (it.hasNext()) {
			ScoreVO vo = it.next();
			if (vo.getName().equals(name)){
				System.out.println("검색성공:" + vo.toString());
				searchOK=true;
				break;
			}
		}
		if(!searchOK)
			System.out.println("검색실패");
	}

	@Override
	public void descSortTot() {
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getTot() < vo2.getTot() ? 1: -1;
			}
		};
		
		Collections.sort(lists, comp);
		print();
	}

	@Override
	public void ascSortHak() {
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>(){

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getHak().compareTo(vo2.getHak());
			}
		};
		
		Collections.sort(lists, comp);
		print();
	}
}
