package com.array;
//20161018
import com.array2.Rect;

public class Test7 {

	public static void main(String[] args) {

		//클래스의 재사용성
		Rect usa = new Rect();
		
		usa.input();
		int aa = usa.area();
		int ll = usa.length();
		
		usa.print(aa, ll);
	}
}
