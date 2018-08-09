package com.mittalvk.learning.datastructure.impl;

import com.mittalvk.learning.datastructure.base.BaseQueue;

public class Queue<T> implements BaseQueue<T> {
	
	private T[] dataArray;
	private int front=0, size=0, back=-1;

    public final static int DEFAULT_INITIAL_ARRAY_SIZE = 25;
	
    
	public Queue(int capacity) throws IllegalArgumentException{
		if(capacity<0) throw new IllegalArgumentException("Size can't be negative ");
		if(capacity>DEFAULT_INITIAL_ARRAY_SIZE) throw new IllegalArgumentException("Size can't be beyod the permitted limit");
		
		@SuppressWarnings("unchecked")
		T[] tempData = (T[]) new Object[capacity];
        this.dataArray = tempData;
		
	}

	public Queue() {
		this(DEFAULT_INITIAL_ARRAY_SIZE);
		
	}

	@Override
	public void enqueue(T t) throws IllegalArgumentException{
		if(t==null) throw new IllegalArgumentException("Nulls are not allowed");
		if (back == dataArray.length-1) // deal with wraparound
		      back = -1;
		dataArray[++back]=t;
		size++;
		
		
	}

	@Override
	public T dequeue() throws IndexOutOfBoundsException{
		if(size==0) throw new IndexOutOfBoundsException("No item found in Queue");
		T tmp=dataArray[front++]; 
		if (front == dataArray.length) // deal with wraparound
		      front = 0;
		size--;
		
		return tmp;
	}

	@Override
	public boolean hasItems() {
		return size>0?true:false;
	}

	@Override
	public int size() {
		
		return size;
	}

	@Override
	public T peek() {
		if(size==0) throw new IndexOutOfBoundsException("No item found in Queue");
		return dataArray[front];
	}

	
}
