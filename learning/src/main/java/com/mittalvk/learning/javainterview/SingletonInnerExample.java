package com.mittalvk.learning.javainterview;

public class SingletonInnerExample {
	
	private SingletonInnerExample() {}
	
	private static class SingletonInnerClassExampleHolder{
		static final SingletonInnerExample INSTANCE= new SingletonInnerExample();
	}
	
	public static SingletonInnerExample getInstance() {
		return SingletonInnerClassExampleHolder.INSTANCE;
	}
	

}
