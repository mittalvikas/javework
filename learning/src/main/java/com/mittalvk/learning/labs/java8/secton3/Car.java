package com.mittalvk.learning.labs.java8.secton3;

public class Car {

	String color = "Green";
	
	{
		color="Blue";
	}
	
	
	
	public Car() {
		this.color = "Orange";
	}



	public static void main(String[] args) {
		
		Car c = new Car();
		
		System.out.println("Final color: "+c.color);
		
	}
	
}
