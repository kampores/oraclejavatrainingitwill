package com.array2;
//20161019
public class Test1 {

	public static void main(String[] args) {
		//Bubble Sort(오른쪽부터 정렬)
		int[] num = {28,35,16,21,33};
		int i,j,temp;
		
		Array sh = new Array();
		
		System.out.print("Source data: ");
		
//		for(i=0;i<num.length;i++)
//			System.out.printf("%4d",num[i]);
		sh.array1DPrint(num);
		
		System.out.println();
		
		//Bubble Sort
		for(i=1;i<num.length;i++)
			for(j=0;j<num.length-i;j++)
				//System.out.println(j+":"+i);
				if(num[j]>num[j+1]){
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
		
		System.out.print("Sorted data: ");
//		for(int n : num)
//			System.out.printf("%4d",n);
		sh.array1DPrint(num);
	}

}
