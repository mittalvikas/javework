package com.mittalvk.learning.interviewquestions.arrays;
/*
 * Smallest subarray with sum greater than a given value
Given an array of integers and a number x, find the smallest subarray with sum greater than the given value.
 
 *Examples:
arr[] = {1, 4, 45, 6, 0, 19}
   x  =  51
Output: 3
Minimum length subarray is {4, 45, 6}

arr[] = {1, 10, 5, 2, 7}
   x  = 9
Output: 1
Minimum length subarray is {10}

arr[] = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250}
    x = 280
Output: 4
Minimum length subarray is {100, 1, 0, 200}

arr[] = {1, 2, 4}
    x = 8
Output : Not Possible
Whole array sum is smaller than 8.
 */
public class SmallestSubArraySum {
	
	
	public static void main(String[] args) {
		int arr[] = {1, 4, 45, 6, 0, 19};
		  int x  =  51;
		
		  solution(arr,x);
		
		
	}
/*
 * initialize a variable tmpSum as first element. 
 * tmpSum indicates the sum of current subarray. 
 * Start from the second element and add all elements one by one to the tmpSum. If tmpSum becomes equal to sum, then print the solution. If tmpSum exceeds the sum, then remove trailing elements while tmpSum is greater than sum.
 */
	private static int solution(int[] arr, int sum) {

		int curr_sum = arr[0], start = 0, i,n=arr.length;
		 
        // Pick a starting point
        for (i = 1; i <= n; i++) 
        {
            // If curr_sum exceeds the sum, then remove the starting elements
            while (curr_sum > sum && start < i-1)
            {
                curr_sum = curr_sum - arr[start];
                start++;
            }
             
            // If curr_sum becomes equal to sum, then return true
            if (curr_sum == sum) 
            {
                int p = i-1;
                System.out.println("Sum found between indexes " + start
                        + " and " + p);
                return 1;
            }
             
            // Add this element to curr_sum
            if (i < n)
            curr_sum = curr_sum + arr[i];
             
        }
 
        System.out.println("No subarray found");
        return 0;
		
	}

}
