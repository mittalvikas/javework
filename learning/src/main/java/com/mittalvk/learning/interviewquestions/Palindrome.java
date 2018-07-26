package com.mittalvk.learning.interviewquestions;

/*
 * 
 * 
 * Input : malayalam
Output : Yes
Reverse of malayalam is also
malayalam.

Input : max
Output : No
Reverse of max is not max.
 * 
 */

public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome("malayalam"));
		System.out.println(isPalindrome("MAX"));
	
		String example1="malayalam";
		System.out.println(isPalindromeRec(example1,0,example1.length()-1));
		
		String example2="MAX";
		System.out.println(isPalindromeRec(example2,0,example2.length()-1));
		
		
	}

	
	
	
	
	
	/*
	 * Reccursive solution 
	 * compare the last 2 characters and break the string from edges until it goes till middle
	 */
	
	private static boolean isPalindromeRec(String string, int start, int end) {
		if(start==end)
		return true;
		
		if(string.charAt(start)!=string.charAt(end))return false;
		
		if(start<end)return isPalindromeRec(string, start+1, end-1);
		
		return true;
		
		
	}







	/*
	 * Solution 
	 * comparing half of the string with other half
	 */
	private static boolean isPalindrome(String string) {
		
		char[] chars=string.toCharArray();
		
		for(int i=0;i<chars.length/2;i++) {
			if(chars[i]!=chars[chars.length-i-1])
				return false;
		}
		
		return true;
	}

}
