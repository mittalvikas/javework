package com.mittalvk.learning.datastructure.impl;

import com.mittalvk.learning.datastructure.base.BaseList;

public class LinkedList<T> implements BaseList<T> {
	
	private Node<T> head;
	
   /*
    * initialize linked list with head node already 
    */
  	public LinkedList(T data) {
		this.head = new Node<T>(data);
	}
	/*
	 * default constructor where head is not defined
	 */
	public LinkedList() {
		
	}

	
	@Override
	public int size() {
		int size=0;
		if(this.head!=null) {
			Node<T> node=this.head;
			size++;
			while(node.getNext()!=null) {
				node=node.getNext();
				size++;
			}
		}
		return size;
	}

	

	
	@Override
	public void addFirst(T t) {
		Node<T> node=new <T>Node(t);
		if(this.head!=null) {
			node.setNext(this.head);
		}
		this.head=node;
		return;
		
	}
	@Override
	public void addLast(T t) {
		Node<T> lastNode=getLastNode();
		if(lastNode!=null) {
			lastNode.setNext(new Node<T>(t));
		}else {
			this.head = new Node<T>(t);
		}
		
	}
	@Override
	public void removeFirst() {
		if(this.head!=null) {  //check if list has atheast head
			if(this.head.getNext()!=null) {  // check if list has 2 or more nodes
				this.head=this.head.getNext();
			}else {  // list has only one element then remove head
				this.head=null;
			}
		}
		
	}
	@Override
	public void removeLast() { //TODO
		Node<T> lastNode=getLastNode();
		if(lastNode!=null) {
			
		}
	}
	@Override
	public T getFirst() {
		if(this.head!=null) {
			return this.head.getData();
		}
		return null;
	}
	
	private Node<T> getLastNode() {
		Node<T> node=null;
		if(this.head!=null) {
			node=this.head;
			while(node.getNext()!=null) {
				node=node.getNext();
			}
		}
		return node;
	}

	@Override
	public T getLast() {
		Node<T> lastNode=getLastNode();
		if(lastNode!=null)return lastNode.getData();
		return null;
	}

	@Override
	public void addAt(int i, T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T getAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeAt(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		this.head=null;
	}
	@Override
	public String toString() {
		StringBuilder str=new StringBuilder();
		str.append("LinkedList [");
				if(this.head!=null) {
					Node<T> node=this.head;
					str.append(node.getData());
					while(node.getNext()!=null) {
						node=node.getNext();
						str.append("->").append(node.getData().toString());
					}
				}
				str.append("]");
				
		return str.toString();		
	}
	
	
	

}
