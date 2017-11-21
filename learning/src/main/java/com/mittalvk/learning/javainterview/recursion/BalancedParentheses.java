package com.mittalvk.learning.javainterview.recursion;

import java.util.Stack;

/**
 * 
 * @author Vikas
 * Check for balanced parentheses in an expression
1.9
Given an expression string exp , 
write a program to examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp. 
For example, the program should print true for exp = “[()]{}{[()()]()}” and false for exp = “[(])”
 *
 */
public class BalancedParentheses {

	public static void main(String[] args) {
		
		
		System.out.println(validateExpression("[()]{}{[()()]()}"));
		System.out.println(validateExpression("[(])"));

	}

	private static boolean validateExpression(String string) {
		Stack<Character> stack=new Stack();
		for(char c:string.toCharArray()){
			if(c=='(' || c=='{'||c=='['){
				stack.push(c);
			}else if(c==')' || c=='}'||c==']'){
				char tmp=stack.pop();
				if(!validPair(tmp,c)){
					return false;
				}
				
			}
			
		}
		return true;
	}
	
	
//	private static char validateExpressionRecursion(String string,char tmp) {
//	
//		if(string==null || string.length()==0)return 'T';
//		
//		char c=string.charAt(0);
//		if(c=='(' || c=='{'||c=='['){
//			tmp=validateExpressionRecursion(string.substring(1),c);
//		}
//		
//		
//		return 'T';
//		
//		
//		
//	}

	private static boolean validPair(char character1, char character2) {
		 if (character1 == '(' && character2 == ')')
	         return true;
	       else if (character1 == '{' && character2 == '}')
	         return true;
	       else if (character1 == '[' && character2 == ']')
	         return true;
	       else
	         return false;
	}

}
