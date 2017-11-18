package com.mittalvk.learning.javainterview.queue;

import java.util.Stack;

public class QueueWithOneStack {

	private Stack<Integer> stack = new Stack();

	public static void main(String[] args) throws Exception {
		QueueWithOneStack myqueue = new QueueWithOneStack();

		myqueue.enqueue(1);
		myqueue.enqueue(2);
		myqueue.enqueue(3);
		System.out.println(myqueue.dequeue());
		System.out.println(myqueue.dequeue());
		myqueue.enqueue(4);
		System.out.println(myqueue.dequeue());
		System.out.println(myqueue.dequeue());

	}

	public void enqueue(int num) {

		stack.push(num);
	}

	public int dequeue() throws Exception {

		if (stack.size() == 0)
			throw new Exception();

		if (stack.size() == 1) {
			return stack.pop();
		}
		int tmp = stack.pop();
		int recrs = dequeue();
		stack.push(tmp);
		return recrs;
	}

}
