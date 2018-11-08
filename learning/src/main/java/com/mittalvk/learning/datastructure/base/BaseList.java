package com.mittalvk.learning.datastructure.base;

import java.util.Comparator;

public interface BaseList<T> {
	
	int size();
	void addFirst(T t);
	void addLast(T t);
	void removeFirst();
	void removeLast();
	T getFirst();
	T getLast();
	void addAt(int i,T t);
	T getAt(int i);
	void removeAt(int i);
	void clear();

}
