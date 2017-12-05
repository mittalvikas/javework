package com.mittalvk.learning.javainterview.java8;

public class InterfaceMethods {

	public static void main(String[] args) {
		
		
		Car car=new Car();
		
		car.drive();

	}

}

interface Vehicle{
	
	default void drive(){
		System.out.println("I am driving Vehicle");
	}
	
	static void print(){
		System.out.println("Print :: Vehicle");
	}
	
	
}

interface FourWheeler{
	
	default void drive(){
		System.out.println("I am driving Four Wheeler");
	}
	
	static void print(){
		System.out.println("Print :: FourWheeler");
	}
	
	
}


class Car implements Vehicle,FourWheeler{

	@Override
	public void drive() {
		Vehicle.super.drive();
		FourWheeler.super.drive();
		System.out.println("I am driving Car");
		
		Vehicle.print();
		FourWheeler.print();
		
	}
	
}
