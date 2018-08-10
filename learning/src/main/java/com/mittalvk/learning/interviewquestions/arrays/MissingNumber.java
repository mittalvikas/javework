package com.mittalvk.learning.interviewquestions.arrays;
/*
 * 
 * 
 * Find the Missing Number
You are given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in list. One of the integers is missing in the list. Write an efficient code to find the missing integer.


Example :
I/P    [1, 2, 4, ,6, 3, 7, 8]
O/P    5
 * 
 */
public class MissingNumber {

	
	public static void main(String[] args) {
		
		int[] arr= {1, 2, 4, 6, 3, 7, 8};
		
		sumSolution(arr);
		
		xorSolution(arr);
		
		
	}

	/*
	 * 
	 */
	
	private static void xorSolution(int[] arr) {
		
		
		
		int x1=arr[0];
		int x2=1;
		
		for(int i=1;i<arr.length;i++) {
			x1=x1^arr[i];
		}
		
		for(int i=2;i<=arr.length+1;i++) {
			x2=x2^i;
		}
		
		System.out.println("Missing "+(x1^x2));
		
	}


	/*
	 * Sum of numbers should be n*(n+1)/2
	 * since we have 2 number missing so leghth is already less by 1 thats why adding additional 1
	 * 
	 */
	private static void sumSolution(int[] arr) {
		int total=(arr.length+1)*(arr.length+2)/2;
		int tmpTotal=0;
		for(int i=0;i<arr.length;i++) {
			
			tmpTotal+=arr[i];
		}
		
		System.out.println("Missing "+(total-tmpTotal));
	}
	
}
