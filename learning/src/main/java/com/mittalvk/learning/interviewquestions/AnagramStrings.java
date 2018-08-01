package com.mittalvk.learning.interviewquestions;

import java.util.Arrays;

/*
 * Check whether two strings are anagram of each other
Write a function to check whether two given strings are anagram of each other or not. 
An anagram of a string is another string that contains same characters, 
only the order of characters can be different. For example, “abcd” and “dabc” are anagram of each other.
 */

public class AnagramStrings {
	
	public static void main(String[] args) {
		
		/*
		 * Solution sort the character array and if two are same then they are anagram
		 */
		
		String str1="listen";
		String str2="silent";
		
		checkAnagram(str1,str2);
		System.out.println(checkAnagram(str1,str2));

		
		
		
		
		
	}

	private static boolean checkAnagram(String str1, String str2) {
		
		if(str1==null || str2==null)return false;
		if(str1.length()!=str2.length())return false;
		
		char[] chars1=str1.toLowerCase().toCharArray();
		Arrays.sort(chars1);
		
		String tmp1=String.valueOf(chars1);


		char[] chars2=str2.toLowerCase().toCharArray();
		Arrays.sort(chars2);

		String tmp2=String.valueOf(chars2);
		
		
		return tmp1.equals(tmp2);
		
	}
	

}
