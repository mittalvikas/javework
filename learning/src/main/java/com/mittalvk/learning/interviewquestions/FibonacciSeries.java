package com.mittalvk.learning.interviewquestions;

/*
 * Program for Fibonacci numbers
The Fibonacci numbers are the numbers in the following integer sequence.

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..

In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation

    Fn = Fn-1 + Fn-2
with seed values

   F0 = 0 and F1 = 1.

 */

public class FibonacciSeries {

	public static void main(String[] args) {
		
		
		printFib(5);
		
		System.out.println(fibRecursion(7));
		
		
		
	}

	private static int fibRecursion(int n) {
		if(n<0) return 0;
		if(n==1)return 0;
		if(n==2)return 1;
		
		return fibRecursion(n-1) + fibRecursion(n-2);
	}

	private static void printFib(int elements) {
	int first=0,second=1;
	if(elements<1)return;
	if(elements>=1) {
		System.out.print(first);
		
	}
	if(elements>=2) {
		System.out.print(", "+second);
	}
	
	for(int i=0;i<elements;i++) {
		System.out.print(", "+(first+second));
		int tmp=first;
		first=second;
		second=tmp+second;
	}
	System.out.println();
		
	}

}
