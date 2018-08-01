package com.mittalvk.learning.interviewquestions;

/**
 * 
 * Print a given matrix in spiral form
Given a 2D array, print it in spiral form. See the following examples.

Input:
        1    2   3   4
        5    6   7   8
        9   10  11  12
        13  14  15  16
Output: 
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 


Input:
        1   2   3   4  5   6
        7   8   9  10  11  12
        13  14  15 16  17  18
Output: 
1 2 3 4 5 6 12 18 17 16 15 14 13 7 8 9 10 11

 * @author Vikas Mittal
 *
 */

public class MatrixSpiralRotation {

	public static void main(String[] args) {
		
		int[][] arr = new int[][] { 
			{ 1, 2, 3, 4 }, 
			{ 5, 6, 7, 8 }, 
			{ 9, 10, 11, 12 }, 
			{ 13, 14, 15, 16 } };
			
			
			int[][] arr1 = new int[][] { 
				{ 1, 2, 3 }, 
				{ 8, 9, 4 }, 
				{ 7, 6, 5 } };	
			
		//printSpiral(arr,4,4);
		
		printSpiral(arr1,3,3);
		
	}

	private static void printSpiral(int[][] arr, int rows, int columns) {

		int startRow=0;
		int endRow=rows-1;
		int startCol=0;
		int endCol=columns-1;
		
		while(startRow<=endRow && startCol<=endCol) {
			
			//printing first row left to right
			
			for(int i=startCol;i<=endCol;i++) {
				System.out.print(arr[startRow][i] +" ");
			}
			startRow++;
			
			//printing last column and going down
			
			for(int i=startRow; i<=endRow;i++) {
				System.out.print(arr[i][endCol] +" ");
			}
			endCol--;
			
			//move from end column to start column from right to left for bottom row
			
			for(int i=endCol;i>=startCol;i--) {
				System.out.print(arr[endRow][i] +" ");
			}
			endRow--;
			
			
			//going up till start row to print first column
			for(int i=endRow;i>=startRow;i--) {
				System.out.print(arr[i][startCol] +" ");
			}
			startCol++;
			
			
		}
		
		
		
		
		
	}
	
}
