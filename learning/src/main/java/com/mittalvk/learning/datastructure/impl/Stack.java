package com.mittalvk.learning.datastructure.impl;

import com.mittalvk.learning.datastructure.base.BaseStack;

public class Stack<T> implements BaseStack<T> {

	private T[] dataArray;
	private int size=0, top=-1;
	 public final static int DEFAULT_INITIAL_ARRAY_SIZE = 25;
		
	    
		public Stack(int capacity) throws IllegalArgumentException{
			if(capacity<0) throw new IllegalArgumentException("Size can't be negative ");
			if(capacity>DEFAULT_INITIAL_ARRAY_SIZE) throw new IllegalArgumentException("Size can't be beyod the permitted limit");
			
			@SuppressWarnings("unchecked")
			T[] tempData = (T[]) new Object[capacity];
	        this.dataArray = tempData;
			
		}

		public Stack() {
			this(DEFAULT_INITIAL_ARRAY_SIZE);
			
		}
	
	@Override
	public void push(T t) throws IllegalArgumentException{
		
		if(t==null) throw new IllegalArgumentException("Nulls are not allowed");
		if (top == dataArray.length) throw new IllegalArgumentException("Stack is already full");
			dataArray[++top]=t;
			size++;
		
		
	}

	@Override
	public T pop() throws IndexOutOfBoundsException{
		if(size==0) throw new IndexOutOfBoundsException("No item found in Stack");
		T tmp=dataArray[top--]; 
		size--;
		
		return tmp;
	}

	@Override
	public T peek() {
		if(size==0) throw new IndexOutOfBoundsException("No item found in Stack");
		T tmp=dataArray[top]; 
		return tmp;
	}

}
