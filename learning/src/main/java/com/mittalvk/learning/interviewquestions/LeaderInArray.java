package com.mittalvk.learning.interviewquestions;

/*
 * Leaders in an array
Write a program to print all the LEADERS in the array. 
An element is leader if it is greater than all the elements to its right side. And the rightmost element is always a leader. 
For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.

Let the input array be arr[] and size of the array be size.
 */

public class LeaderInArray {

	public static void main(String[] args) {
		int[] arr={16, 17, 4, 3, 5, 2};
		
		printLeaders(arr);
	}

	private static void printLeaders(int[] arr) {
		
		
		int tmp=arr[arr.length-1];
		System.out.println(tmp);
		
		for(int i=arr.length-1;i>=0;i--) {
			if(tmp<arr[i]) {
				System.out.println(arr[i]);
				tmp=arr[i];
			}
			
		}
		
	}
	
}
