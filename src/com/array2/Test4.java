package com.array2;
//20161019
public class Test4 {

	public static void main(String[] args) {
		int[][] a = {{5,3,6},{2,5,9},{6,7,9}};
		int[][] b = {{1,2,6},{5,8,9},{4,5,2}};
		int[][] sum = new int[3][3];
		
		Array sh = new Array();
		
		int i,j;
		
//		for(i=0;i<a.length;i++)
//			for(j=0;j<a[i].length;j++)
//				sum[i][j] = a[i][j] + b[i][j];
		sum = sh.array2DPlus(a, b);

		sh.array2DPrint(sum);
	}

}
