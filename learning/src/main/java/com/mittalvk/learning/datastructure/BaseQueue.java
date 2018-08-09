package com.mittalvk.learning.datastructure;

public interface BaseQueue <T>{

	void enqueue(T t);
	T dequeue();
	T peek();
	boolean hasItems();
	int size();
	
}
