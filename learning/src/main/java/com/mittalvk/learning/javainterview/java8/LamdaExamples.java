package com.mittalvk.learning.javainterview.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class LamdaExamples {
	
	public static void main(String[] args) {
		
		LamdaExamples example=new LamdaExamples();
		
		MathOperation addition=(int a,int b)->a+b;
		MathOperation substraction=(a,b)->a-b;
		
		
		
		
		System.out.println(example.operate(1,2, addition));
		System.out.println(example.operate(10,5, substraction));
		
		String hi="Hello ";
		
		Consumer sayHello=message->System.out.println(hi+message);
		
		sayHello.accept("Vikas");
		
		
		//Comparator example
		
		List<Employee> employeeList=new ArrayList<>();
		employeeList.add(new Employee("John",37));
		employeeList.add(new Employee("David",33));
		employeeList.add(new Employee("Mathew",18));
		
		Collections.sort(employeeList, (e1,e2)->e1.name.compareTo(e2.name));
		employeeList.forEach(System.out::println);
		
		
		//thread example
		
		Thread t1=new Thread(()->System.out.println("I am in thread"));
		
		t1.start();
		
		
		
	}
	private int operate(int a, int b, MathOperation mathOperation) {
	      return mathOperation.operation(a, b);
	}

}
interface MathOperation {
    int operation(int a, int b);
 }

class Employee{

	String name;
	int age;
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
	

}
