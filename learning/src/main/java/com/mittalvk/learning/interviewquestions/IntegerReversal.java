package com.mittalvk.learning.interviewquestions;

public class IntegerReversal {

	public static void main(String[] args) {
		
		int source=123;  //expected output should be 321 number
		
		int target=0;
		
		
		/**
		 * Solution 
		 * multiply target in each iteration
		 * get the last attribute and add it to the target
		 * devide the input number by 10 to exclude the last number
		 */
		while(source>0) {
			
			target=target*10+(source%10);
			source=source/10;
		}
		
	
		System.out.println("Output:"+target);
		
	}
	
	
}
