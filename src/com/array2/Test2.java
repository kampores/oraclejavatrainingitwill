package com.array2;

import java.util.Scanner;
//20161019
public class Test2 {

	public static void main(String[] args) {
		//주민등록번호 검사
		//생년월일 성별 시구군동 신청순서 검증코드
		//850101  - 2   0795     1        8
		//성별: 1900년대 남:1 녀:2
		//      2000년대 남:3 녀:4
		//외국생1900년대 남:5 녀:6
		//외국생2000년대 남:7 녀:8
		//
		//검증방법
		//900311-1076431
		//234567 892345
		//합=(9*2)+(0*3)+...+(3*5)
		//합=11-합%11
		//합=합%10
		//합==1 : 정상
		
		/*
		String str = "seoul korea";
		//index:      01234567890
		
		System.out.println(str.substring(0,3));//seo
		System.out.println(str.substring(6,8));//ko
		System.out.println(str.substring(6));//korea
		*/
		
		Scanner sc = new Scanner(System.in);
		
		String str;
		int[] chk = {2,3,4,5,6,7,8,9,2,3,4,5};
		int i,tot,su;
		
		System.out.print("주민번호[xxxxxx-xxxxxxx]?");
		str = sc.next();
		
		if(str.length()!=14){
			System.out.println("입력 오류!!");
			sc.close();
			return;//stop
		}
		
		tot=0;
		//idx: 01234567890123
		//str: 900311-1076431
		//chk: 234567 892345		
		for(i=0;i<12;i++)
			if(i>=6) //주민번호 뒷자리
				tot+=chk[i]*Integer.parseInt(str.substring(i+1,i+2));//+1한건 '-'건너뜀용
			else //생년월일
				tot+=chk[i]*Integer.parseInt(str.substring(i,i+1));
		
		su=11-tot%11;
		su=su%10;
		if(su==Integer.parseInt(str.substring(13)))
			System.out.println("정확한 주민번호!!");//111111-1111118
		else
			System.out.println("부정확한 주민번호!!");
		sc.close();
	}
}
