package com.mittalvk.learning.interviewquestions;

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
		
		
	}

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
