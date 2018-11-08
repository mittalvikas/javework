package com.mittalvk.learning.interviewquestions.arrays;

/*
 * Find duplicates in O(n) time and O(1) extra space | Set 1
Given an array of n elements which contains elements from 0 to n-1, with any of these numbers appearing any number of times. Find these repeating numbers in O(n) and using only constant memory space.

For example, let n be 7 and array be {1, 2, 3, 1, 3, 6, 6}, the answer should be 1, 3 and 6.
 */

public class DuplicateNumber {

	
	/*
	 * Solution
	 * traverse the list for i= 0 to n-1 elements
{
  check for sign of A[abs(A[i])] ;
  if positive then
     make it negative by   A[abs(A[i])]=-A[abs(A[i])];
  else  // i.e., A[abs(A[i])] is negative
     this   element (ith element of list) is a repetition
}
	 */
	public static void main(String[] args) {
		int []arr={1, 2, 3, 1, 3, 6, 6};
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[Math.abs(arr[i])]>=0) {
				arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
			}else {
				System.out.println(Math.abs(arr[i]));
			}
			
		}

	}

}
