package com.mittalvk.learning.javainterview.java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		
		//strings.stream().filter(i->!i.isEmpty()).forEach(i->System.out.println(i));
		

		strings.stream().filter(i->!i.isEmpty()).map(i->"-->"+i).limit(5).sorted().forEach(i->System.out.println(i));
		
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());
		
		
		//count empty strings
		
		System.out.println("Empty strings: "+strings.stream().filter(s->s.isEmpty()).count());
		
		//string of length 3
		System.out.println("strings of length 3");
		strings.stream().filter(s->s.length()==3).forEach(System.out::println);
		
		List<String> filteredList=strings.stream().filter(s->!s.isEmpty()).collect(Collectors.toList());
		System.out.println("Filtered non empty strings");
		filteredList.forEach(System.out::println);
		
		
		 System.out.println("Merged String: "+filteredList.stream().collect(Collectors.joining("::")));
		 
		
	}

}
