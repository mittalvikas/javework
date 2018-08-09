package com.mittalvk.learning.datastructure.base;

public interface BaseQueue <T>{

	void enqueue(T t);
	T dequeue();
	T peek();
	boolean hasItems();
	int size();
	
}
