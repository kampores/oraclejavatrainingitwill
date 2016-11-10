package com.array2;
//20161019
public class Homework1 {

	public static void main(String[] args) {
		//배열의 배열(다차원배
		//ㄹ형 배치
		int[][] arr = new int[6][6];
		Array sh = new Array();
		
		int i,j;
		int n=0;
		
		for(i=0;i<5;i++)
			for(j=0;j<5;j++){
				n++;
				arr[i][((i+1)%2)*j+(i%2)*(4-j)]=n;
				arr[i][5]+=n;
				arr[5][j]+=n;
				arr[5][5]+=n;
				//System.out.printf("%4d",arr[i][j]);
			}
//		for(i=0;i<arr.length;i++){
//			for(j=0;j<arr.length;j++)
//				System.out.printf("%4d",arr[i][j]);
//			System.out.println();
//		}
		sh.array2DPrint(arr);		
	}

}
