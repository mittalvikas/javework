package com.mittalvk.learning.interviewquestions;

import java.util.Arrays;
import java.util.HashSet;

/*
 * Given an array A[] and a number x, check for pair in A[] with sum as x
Write a C program that, given an array A[] of n numbers and another number x, 
determines whether or not there exist two elements in S whose sum is exactly x.
 */
public class AraaySumofTwoElemets {

	public static void main(String[] args) {

		int[] arr = {10,20,40,30,70,90};
		
		
		checkForSum(arr,100);
		checkForSumSolution2(arr,100);
		
		
	}
	
	
	/*
	 * Solution: main 2 pointers in already sorted array from left and right
	 * increase the left pointer in sum is less or decrease the pointer if sum is greater 
	 * O(log n) complexity 
	 * 
	 * 
	 */
	
	private static void checkForSumSolution2(int[] arr, int sum) {
		
		
		System.out.println("Sorted array solution ");
		Arrays.sort(arr);
		
		int i=0,j=arr.length-1;
		while(i<=j) {
			
			if(arr[i]+arr[j]==sum) {
				System.out.println("Sum from:"+ arr[i] +" and "+arr[j]);
				i++;
			}else if(arr[i]+arr[j]>sum)j--;
			else if(arr[i]+arr[j]<sum)i++;
			
		}
		
	}


	/*
	 * Solution: Maintain a set with the values in each iteration and check if sum - value is present already.
	 * O(n) complexity solution
	 */

	private static void checkForSum(int[] arr, int count) {
		HashSet<Integer> remainingRequired=new HashSet();
		
		for(int i=0;i<arr.length;i++) {
			if(remainingRequired.contains((count-arr[i]))) {
				System.out.println("Sum from:"+ (count-arr[i]) +" and "+arr[i]);
			}else {
				remainingRequired.add(arr[i]);
			}
		}
		
		
	}

}
