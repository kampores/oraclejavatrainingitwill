package com.array2;
//20161019
public class Array {

	public int[][] array2DPlus(int arr1[][], int arr2[][]) {
		int[][] sum = new int[arr1.length][arr1[0].length];
		for(int i=0;i<arr1.length;i++)
			for(int j=0;j<arr1[i].length;j++)
				sum[i][j] = arr1[i][j] + arr2[i][j];		
		return sum;
	}
	
	public void array1DPrint(int arr[]){
		for(int n : arr)
			System.out.printf("%4d",n);	
	}	
	
	public void array2DPrint(int arr[][]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++)
				System.out.printf("%4d",arr[i][j]);
			System.out.println();
		}
	}
}
