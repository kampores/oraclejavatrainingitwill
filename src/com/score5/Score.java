package com.score5;
//20161103
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Scanner;

public class Score {

	ArrayList<ScoreVO> lists;
	//final String filepath = "d:\\doc\\score.txt"; 
	//private String path = System.getProperty("user.dir");
	private String path = System.getProperty("d:\\");
	private File f = new File(path,"\\doc\\score.txt");
	
	@SuppressWarnings("unchecked")
	public Score(){
//		this.lists = new ArrayList<ScoreVO>();
		try {
			if(!f.getParentFile().exists())//처음실행시
				f.getParentFile().mkdirs();
			if(f.exists()){//두번째 이후 실행시
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				lists = (ArrayList<ScoreVO>)ois.readObject();
				fis.close();
				ois.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
//	public ArrayList<ScoreVO> getLists() {
//		return lists;
//	}
//
//	public void setLists(ArrayList<ScoreVO> lists) {
//		this.lists = lists;
//	}

	//파일저장
	public void writeFile() {
		try {
			if(lists!=null){
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(lists);
				oos.close();
				fos.close();//직렬화 끝
				System.out.println("파일저장 성공!!");
			}
		} catch (Exception e) {
			//System.out.println(e.toString());
		}
	}
	
	//출력
	public void write() {
		Iterator<ScoreVO> it = lists.iterator();
		
		while (it.hasNext()) {
			ScoreVO vo = it.next();
			//System.out.printf("%s\t%s\t%s\n",vo.getName(),vo.printBirth(),vo.getAge());
			System.out.println(vo.toString());
		}		
	}
	
	//입력
	public void input() {
		Scanner sc = new Scanner(System.in);
		ScoreVO vo = new ScoreVO();
		int inputYear,inputMonth,inputDay;
		Calendar now = Calendar.getInstance();
		int currentYear;
		currentYear = now.get(Calendar.YEAR);
		
		System.out.print("이름?");
		vo.setName(sc.next());
		
		do{
			System.out.print("생년?");
			inputYear=sc.nextInt();
		} while (inputYear<1900);
		
		do{
		System.out.print("생월?");
		inputMonth=sc.nextInt();
		} while (inputMonth<1||inputMonth>12);
		
		now.set(inputYear, inputMonth-1, 1);
		
		do{
		System.out.print("생일?");
		inputDay=sc.nextInt();
		} while (inputDay<1||inputDay>now.getActualMaximum(Calendar.DATE));
		now.set(inputYear, inputMonth-1, inputDay);
		
		vo.setBirthDate(now);

//		System.out.print("나이?");
//		vo.setAge(sc.nextInt());
		vo.setAge((currentYear-inputYear)+1);

		if(lists==null)
			lists = new ArrayList<ScoreVO>();
		
		lists.add(vo);
		
		System.out.println("추가 성공!\n");
	}


//	@SuppressWarnings("unchecked")
//	public void load() {
//		try {
//			//역직렬화
//			FileInputStream fis = new FileInputStream(filepath);
//			System.out.println("score.txt 파일을 읽어들였습니다.");
//			ObjectInputStream ois = new ObjectInputStream(fis);
//
//			try {
//				lists = (ArrayList<ScoreVO>) ois.readObject();//->EOF 발생시 java.io.EOFException 발생하여 catch로 이동
//			} catch (Exception e) {
//				//System.out.println(e.toString());
//				System.out.println("리스트를 불러들이지 못하여 리스트를 생성합니다."); //개인코드
//				setLists(new ArrayList<ScoreVO>());
//			}
//			ois.close();
//			fis.close();
//		} catch (Exception e) {
//			System.out.println("현재 score.txt 파일이 없어서 리스트를 생성합니다.");
//			setLists(new ArrayList<ScoreVO>());
//		}
//	}
}
