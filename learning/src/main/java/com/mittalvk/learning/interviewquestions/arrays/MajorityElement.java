package com.mittalvk.learning.interviewquestions.arrays;

import java.util.Arrays;

/*
 * Majority Element
Write a function which takes an array and prints the majority element (if it exists), otherwise prints “No Majority Element”. A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element).
Examples :

Input : {3, 3, 4, 2, 4, 4, 2, 4, 4}
Output : 4 

Input : {3, 3, 4, 2, 4, 4, 2, 4}
Output : No Majority Element
 */
public class MajorityElement {

	
	/**
	 * 
	 * many approached to solve this 
	 * Sort the array and check if first or element should be same as middle element 
	 * because if that element is in majority then it should be in all the elemnts of the array to its left or right.
	 * Complexity will O(nlogn)
	 * 
	 */
	public static void main(String[] args) {
		
		int[] arr={3, 3, 4, 2, 4, 4, 2, 4, 4};

		Arrays.sort(arr);
		
		if(arr[0]==arr[arr.length/2]  || arr[arr.length/2]==arr[arr.length-1]) {
			System.out.println("Majority element"+arr[arr.length/2]);
		}
		int[] arr1={3, 3, 4, 2, 4, 4, 2, 4, 4};
		mooresAlgorithm(arr1);
	}

	
	
	/*
	 * (Using Moore’s Voting Algorithm)
This is a two step process.

The first step gives the element that may be majority element in the array. If there is a majority element in an array, then this step will definitely return majority element, otherwise it will return candidate for majority element.
Check if the element obtained from above step is majority element.This step is necessary as we are not always sure that element return by first step is majority element.

	 */
	
	
	private static void mooresAlgorithm(int[] arr) {
		
		//Step 1 : Find the candidate
		
		int elementIndex=0,count=1;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[elementIndex]) {
				count++;
			}else {
				count--;
			}
			
			if(count==0) {
				elementIndex=i;
				count=1;
			}
		}
		System.out.println("element highly voted "+arr[elementIndex]);
		
		//Step 2 check if the element is in majority and it occurs more than n/2 times.
		
		int occurenceCount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==arr[elementIndex]) {
				occurenceCount++;
			}
			if(occurenceCount>arr.length/2) {
				System.out.println("Item is in majoroty "+ arr[elementIndex]);
			}
		}
		
	}

}
