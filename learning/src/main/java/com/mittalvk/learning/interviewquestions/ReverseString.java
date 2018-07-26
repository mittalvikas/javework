package com.mittalvk.learning.interviewquestions;

import java.util.Stack;

/*
 * 
 * reverse the string 
 * example apple === elppa
 * example mango === ognam
 * 
 */


public class ReverseString {

	
	
	public static void main(String[] args) {
		
		System.out.println(reverseString("apple"));
		System.out.println(reverseString("mango"));
		System.out.println(reverseString("hello"));
		
		
	}
	
	/**
	 * solution using swapping the characters
	 * @param string
	 * @return
	 */
	
	private static String reverseString(String string) {
		
		char[] chars=string.toCharArray();
		
		for(int i=0;i<chars.length/2;i++) {
			char tmp=chars[chars.length-i-1];
			chars[chars.length-i-1]=chars[i];
			chars[i]=tmp;
			
			
		}
		
		return String.valueOf(chars);
		}
			
	
/*
 * solution using add characters at begining
 */
/*private static String reverseString(String string) {
	
	String reverse="";
	for(int i=0;i<string.length();i++) {
		reverse=string.charAt(i)+reverse;
	}
	return reverse;
	}
	*/
/**
 * solution using the stack
 */
	/*private static String reverseString(String string) {
		
		Stack<Character> s=new Stack();
		
		for(char c:string.toCharArray()) {
			s.push(c);
		}
		
		String reverse="";
		while(!s.isEmpty())reverse=reverse+s.pop();
		return reverse;
	}*/
}
