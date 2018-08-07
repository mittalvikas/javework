package com.mittalvk.learning.interviewquestions.arrays;

/*
 *     Union and Intersection of two sorted arrays
Given two sorted arrays, find their union and intersection.

Example:

Input : arr1[] = {1, 3, 4, 5, 7}
        arr2[] = {2, 3, 5, 6} 
Output : Union : {1, 2, 3, 4, 5, 6, 7} 
         Intersection : {3, 5}

Input : arr1[] = {2, 5, 6}
        arr2[] = {4, 6, 8, 10} 
Output : Union : {2, 4, 5, 6, 8, 10} 
         Intersection : {6}
 */
public class UnionAndIntersaction {

	public static void main(String[] args) {
		int arr1[] = {2, 5, 6};
        int arr2[] = {4, 6, 8, 10}; 

        union(arr1,arr2);
        System.out.println();
        intersaction(arr1,arr2);
        
	}

	
	private static void intersaction(int[] arr1, int[] arr2) {
		int i=0,j=0;
		System.out.print("Intersaction ");
	
		while(i<arr1.length && j<arr2.length) {
		
			if(arr1[i]<arr2[j]) {
				i++;
			}else if(arr1[i]>arr2[j]) {
				j++;
			} else if(arr1[i]==arr2[j]) {
				System.out.print(arr2[j]+", ");
				i++;
				j++;
			}
		}
			
		
	}


	private static void union(int[] arr1, int[] arr2) {
		int i=0,j=0;
		System.out.print("Union ");
	
		while(i<arr1.length && j<arr2.length) {
		
			if(arr1[i]<arr2[j]) {
				System.out.print(arr1[i]+", ");
				i++;
			}else if(arr1[i]>arr2[j]) {
				System.out.print(arr2[j]+", ");
				j++;
			} else if(arr1[i]==arr2[j]) {
				System.out.print(arr2[j]+", ");
				i++;
				j++;
			}
			
			
		
	}
		
		while(i<arr1.length) {
			System.out.print(arr1[i++]+", ");
			
		}
		
		while(j<arr2.length) {
			System.out.print(arr2[j++]+", ");
			
		}
		
	}
	
}


