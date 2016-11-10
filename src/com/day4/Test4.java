package com.day4;
//20161017
public class Test4 {
	public static void main(String[] args) {
		int i,j;
		/*for(i=1;i<=5;i++){
			for(j=1;j<=5-i;j++){
				System.out.print(" ");//°ø¹éÇÑÄ­
			}
			for(j=1;j<=i;j++){
				System.out.print("*");//*
			}
			System.out.println();//ÁÙ¹Ù²Þ
		}*/
		//»ï°¢Çü
/*		for(i=1;i<=5;i++){
			for(j=1;j<=5-i;j++){
				System.out.print(" ");//°ø¹éÇÑÄ­
			}
			for(j=1;j<=i*2-1;j++){
				System.out.print("*");//*
			}
			System.out.println();//ÁÙ¹Ù²Þ
*/		//¿ª»ï°¢Çü
/*		for(i=5;i>=1;i--){
				for(j=1;j<=5-i;j++){
					System.out.print(" ");//°ø¹éÇÑÄ­
				}
				for(j=1;j<=i*2-1;j++){
					System.out.print("*");//*
				}
				System.out.println();//ÁÙ¹Ù²Þ
		}*/
		//¸ð·¡½Ã°è
		for(i=5;i>=1;i--){
			for(j=1;j<=5-i;j++){
				System.out.print(" ");//°ø¹éÇÑÄ­
			}
			for(j=1;j<=i*2-1;j++){
				System.out.print("*");//*
			}
			System.out.println();//ÁÙ¹Ù²Þ
		}
		for(i=2;i<=5;i++){
			for(j=1;j<=5-i;j++){
				System.out.print(" ");//°ø¹éÇÑÄ­
			}
			for(j=1;j<=i*2-1;j++){
				System.out.print("*");//*
			}
			System.out.println();//ÁÙ¹Ù²Þ			
		}
	}
}
