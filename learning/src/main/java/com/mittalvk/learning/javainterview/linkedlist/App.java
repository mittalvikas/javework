package com.mittalvk.learning.javainterview.linkedlist;

public class App {

	public static void main(String[] args) {
		
		SLinkedList list=new SLinkedList();
		
		list.pushAtBegining(1);
		list.pushAtBegining(2);
		list.pushAtBegining(3);
		list.pushAtBegining(4);
		list.pushAtBegining(5);
		
		System.out.println("Push at begining>>");
		list.printList();
		
		
		SLinkedList list1=new SLinkedList();
		
		list1.pushAtEnd(1);
		list1.pushAtEnd(2);
		list1.pushAtEnd(3);
		list1.pushAtEnd(4);
		list1.pushAtEnd(5);
		
		System.out.println("\nPush at End>>");
		list1.printList();
		
		//input 1->2->3->4->5
		//output 2->1->4->3->5
		System.out.println("\nSwap Nodes in pairs>>");
		list1.swapPaiwiseNodes();
		list1.printList();
		

	}

}
