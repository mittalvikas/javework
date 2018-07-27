package com.mittalvk.learning.interviewquestions;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Return maximum occurring character in an input string
Write an efficient C function to return maximum occurring character in the input string e.g., if input string is “test” then function should return ‘t’.
 * 
 * @author Vikas Mittal
 *
 */

public class MaxOccuringChar {

	public static void main(String[] args) {
		String example="test";
		Map<Character,Integer> charsMap=new HashMap<Character,Integer>();
		for(int i=0;i<example.length();i++) {
			charsMap.put(example.charAt(i), charsMap.get(example.charAt(i))!=null?(charsMap.get(example.charAt(i))+1):1);
		}

		System.out.println(charsMap);
		
		char answer = 0;
		int max=1;
		for(Character c:charsMap.keySet()) {
			if(charsMap.get(c)>max) {
				max=charsMap.get(c);
				answer=c;
			}
			
		}
System.out.println("Ansert:"+answer);
	}

}
