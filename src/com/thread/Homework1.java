package com.thread;
//20161101
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class MemberThread implements Runnable{
	int seq;
	MemberVO memberVO;
	
	public MemberThread(int seq, MemberVO memberVO) {
		this.seq = seq;
		this.memberVO = memberVO;
	}

	@Override
	public void run() {
		Random rd = new Random();
		
		try {
			Thread.sleep(rd.nextInt(memberVO.getMemberLists().size()*100));
		} catch (Exception e) {
			// TODO: handle exception
		}
		String tempString = memberVO.getMemberLists().get(seq);
		synchronized (this) {
			if(memberVO.getSortitionMemberLists().size()<memberVO.getNum())
				memberVO.getSortitionMemberLists().add(tempString);	
		}
	}
}

public class Homework1 {

	public static List<String> init(MemberVO memberVO){
		List<String> memberLists = new ArrayList<String>();
		String[] members = memberVO.getMembers();
		
		for (int i = 0; i < members.length; i++) {
			String mb = members[i];
			memberLists.add(mb);
		}
		return memberLists;
	}
	
	public static void main(String[] args) {
		int num, memberNum;
		Scanner sc = new Scanner(System.in);
		MemberVO memberVO = new MemberVO();

		List<Thread> threadLists = new ArrayList<Thread>();
		
		List<String> memberLists = init(memberVO);
		memberVO.setMemberLists(memberLists);
		List<String> sortitionMemberLists = new ArrayList<String>();
		memberVO.setSortitionMemberLists(sortitionMemberLists);
		
		memberNum = memberVO.getMemberLists().size();
		do{
			System.out.print("발표자 인원수?");
			num = sc.nextInt();
			memberVO.setNum(num);
		}while (num<1||num>memberNum);
				
		System.out.print("고민중");
        for(int i=0; i<memberNum; i++) {
    	    Thread t = new Thread(new MemberThread(i, memberVO));
            t.start();
            threadLists.add(t);
        }

        boolean loop=true;
        boolean status=false;
        while(loop){
        	loop=false;
	        for(int i=0; i<memberVO.getMemberLists().size(); i++) {
	            Thread t = threadLists.get(i);
	            try {
	                status=t.isAlive();
	            }catch(Exception e) {
	            }
	            if(status)
                	loop|=status;
//	            else
//	            	System.out.printf("%d스레드 종료\n", i);
	        }
	        System.out.print(".");
	        try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
        }

        System.out.println();
        for(int i=0; i<memberVO.getMemberLists().size(); i++) {
            Thread t = threadLists.get(i);
            try {
                t.join();
            }catch(Exception e) {
            }
        }
        
		System.out.println("축하합니다!!,발표자 입니다");
		
		Iterator<String> it = memberVO.getSortitionMemberLists().iterator();
		int i=0;
		while (it.hasNext()) {
			i++;
			String memberName = it.next();
			System.out.printf("%d번 발표자 : %s\n",i,memberName);
		}
	}
}
