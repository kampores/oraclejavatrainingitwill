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
			if(!f.getParentFile().exists())//ó�������
				f.getParentFile().mkdirs();
			if(f.exists()){//�ι�° ���� �����
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

	//��������
	public void writeFile() {
		try {
			if(lists!=null){
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(lists);
				oos.close();
				fos.close();//����ȭ ��
				System.out.println("�������� ����!!");
			}
		} catch (Exception e) {
			//System.out.println(e.toString());
		}
	}
	
	//���
	public void write() {
		Iterator<ScoreVO> it = lists.iterator();
		
		while (it.hasNext()) {
			ScoreVO vo = it.next();
			//System.out.printf("%s\t%s\t%s\n",vo.getName(),vo.printBirth(),vo.getAge());
			System.out.println(vo.toString());
		}		
	}
	
	//�Է�
	public void input() {
		Scanner sc = new Scanner(System.in);
		ScoreVO vo = new ScoreVO();
		int inputYear,inputMonth,inputDay;
		Calendar now = Calendar.getInstance();
		int currentYear;
		currentYear = now.get(Calendar.YEAR);
		
		System.out.print("�̸�?");
		vo.setName(sc.next());
		
		do{
			System.out.print("����?");
			inputYear=sc.nextInt();
		} while (inputYear<1900);
		
		do{
		System.out.print("����?");
		inputMonth=sc.nextInt();
		} while (inputMonth<1||inputMonth>12);
		
		now.set(inputYear, inputMonth-1, 1);
		
		do{
		System.out.print("����?");
		inputDay=sc.nextInt();
		} while (inputDay<1||inputDay>now.getActualMaximum(Calendar.DATE));
		now.set(inputYear, inputMonth-1, inputDay);
		
		vo.setBirthDate(now);

//		System.out.print("����?");
//		vo.setAge(sc.nextInt());
		vo.setAge((currentYear-inputYear)+1);

		if(lists==null)
			lists = new ArrayList<ScoreVO>();
		
		lists.add(vo);
		
		System.out.println("�߰� ����!\n");
	}


//	@SuppressWarnings("unchecked")
//	public void load() {
//		try {
//			//������ȭ
//			FileInputStream fis = new FileInputStream(filepath);
//			System.out.println("score.txt ������ �о�鿴���ϴ�.");
//			ObjectInputStream ois = new ObjectInputStream(fis);
//
//			try {
//				lists = (ArrayList<ScoreVO>) ois.readObject();//->EOF �߻��� java.io.EOFException �߻��Ͽ� catch�� �̵�
//			} catch (Exception e) {
//				//System.out.println(e.toString());
//				System.out.println("����Ʈ�� �ҷ������� ���Ͽ� ����Ʈ�� �����մϴ�."); //�����ڵ�
//				setLists(new ArrayList<ScoreVO>());
//			}
//			ois.close();
//			fis.close();
//		} catch (Exception e) {
//			System.out.println("���� score.txt ������ ��� ����Ʈ�� �����մϴ�.");
//			setLists(new ArrayList<ScoreVO>());
//		}
//	}
}
