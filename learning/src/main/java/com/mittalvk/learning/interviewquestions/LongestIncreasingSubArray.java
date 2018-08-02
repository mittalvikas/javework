package com.mittalvk.learning.interviewquestions;

/*
 * Length of the largest subarray with contiguous elements | Set 1
Given an array of distinct integers, find length of the longest subarray which contains numbers that can be arranged in a continuous sequence.

Examples:

Input:  arr[] = {10, 12, 11};
Output: Length of the longest contiguous subarray is 2

Input:  arr[] = {14, 12, 11, 20};
Output: Length of the longest contiguous subarray is 2

Input:  arr[] = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
Output: Length of the longest contiguous subarray is 4
 */

public class LongestIncreasingSubArray {

	public static void main(String[] args) {
		int arr[] = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};

		System.out.println("longestSubArray: "+longestSubArrayLength(arr));
		
		
	}

	private static int longestSubArrayLength(int[] arr) {
		int finalLength=1,currentSArrayLength=1;
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i-1]<=arr[i]) {
				++currentSArrayLength;
				
			}else if(finalLength<currentSArrayLength){
				finalLength=currentSArrayLength;
				currentSArrayLength=1;
			}
			
			

			
			
		}
		
		return finalLength<currentSArrayLength?currentSArrayLength:finalLength;
	}

}
