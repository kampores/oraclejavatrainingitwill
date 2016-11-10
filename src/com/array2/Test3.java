package com.array2;
//20161019
public class Test3 {

	public static void main(String[] args) {
		//배열의 배열(다차원배열)
		int[][] arr = new int[6][3];
		Array sh = new Array();
		
		int i,j;
		int n=0;
		
		for(i=0;i<arr.length-1;i++)
			for(j=0;j<arr[i].length-1;j++){
				n++;
				arr[i][j]=n;
				arr[i][arr[i].length-1]+=n;
				arr[arr.length-1][j]+=n;
				arr[arr.length-1][arr[i].length-1]+=n;
			}
		
//		for(i=0;i<arr.length;i++){
//			for(j=0;j<arr.length;j++)
//				System.out.printf("%4d",arr[i][j]);
//			System.out.println();
//		}
		sh.array2DPrint(arr);		
	}

}
