package com.mittalvk.learning.javainterview.linkedlist;

public class SLinkedList {
	
	SNode head;
	
	public void pushAtBegining(int data){
		
		SNode node=new SNode(data);
		
		if(head==null){
			head=node;
			return;
		}
		node.next=head;
		head=node;
	}
	
	
	public void pushAtEnd(int data){
		
		SNode node=new SNode(data);
		
		if(head==null){
			head=node;
			return;
		}
		
		SNode tmp=head;
		while(tmp.next!=null){
			tmp=tmp.next;
		}
		tmp.next=node;
	}
	
	
	
	
	public void printList(){
		SNode tmp=head;
		
		while(tmp!=null){
			System.out.print(tmp.data+"->");
			tmp=tmp.next;
		}
		
	}
	
	
	public void swapPaiwiseNodes(){
		
		SNode tmp=head;
		if(tmp==null || tmp.next==null){
			return;
		}
		SNode prev=tmp;
		SNode curr=tmp.next;
		head=tmp.next;
		
		while(true){
			SNode next=curr.next;
			curr.next=prev;
			if(next==null || next.next==null){
				prev.next=next;
				break;	
			}
			prev.next=next.next;
			prev=next;
			curr=prev.next;
		}
		
		
	}
	

}
