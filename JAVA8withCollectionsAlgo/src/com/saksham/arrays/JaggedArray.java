package com.saksham.arrays;

public class JaggedArray {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][4];		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;
		
		for(int i=0; i<=arr.length;i++) {
			System.out.println(arr[0][i]);
		}
		
		int[] numbers = new int[] {3,5,2,0};
		 
		for(int i=0;i<numbers.length;i++) {
			System.out.println("number is "+ numbers[i]);
		}
		
		String[][] words= {
				{"one","two","three"},
				{"1","2","3"},
				{"I","II","III"}
		}; 
		System.out.println("Words are");
		for(int i=0;i<words.length;i++) {
			for(int j=0;j<words[i].length;j++) {
				System.out.println("i = "+ i + " j = "+j + " is " +words[i][j]);
			}
			System.out.println("-----");	
		}
	
		//Jagged Array
		
		String[][] jaggedWords = {
				{"1","2"},
				{"A"},
				{"one", "two"}
		}; 
		
		for(int i=0;i<jaggedWords.length;i++) {
			for(int j=0;j<jaggedWords[i].length;j++) {
				System.out.println("i = "+ i + " j = "+j + " is " +jaggedWords[i][j]);
			}
			System.out.println("------");
		}
	}
}