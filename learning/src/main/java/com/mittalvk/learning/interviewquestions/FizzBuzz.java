package com.mittalvk.learning.interviewquestions;
/**
 * 
 * @author Vikas Mittal
 * 
 * Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. 
For numbers which are multiples of both three and five output “FizzBuzz”.
 *
 */
public class FizzBuzz {
	
	public static void main(String[] args) {
		
		
		int exampleNumber=100;
		
		for(int i=1; i<exampleNumber; i++) {
			
			if(i%3==0 && i%5==0) {
				System.out.println("FIZZBUZZ");
			}else if(i%3==0){
				System.out.println("FIZZ");
			}else if(i%5==0){
				System.out.println("BUZZ");
			}else {
				System.out.println(i);
			}
		}
		
		
		
	}

}
