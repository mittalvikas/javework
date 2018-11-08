package com.mittalvk.learning.datastructure;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.mittalvk.learning.datastructure.impl.LinkedList;

public class LinkedListTest {
	
	@Test
    public void testCreateEmptyList() {
 		LinkedList<String> linkedList=new LinkedList<>();
 		assertEquals(0, linkedList.size());
 	}
	@Test
    public void testCreateListWithHead() {
 		LinkedList<String> linkedList=new LinkedList<>("Head Node");
 		assertEquals(1, linkedList.size());
 	}
	
	 	@Test
	    public void testEmptyListSize() {
	 		LinkedList<String> linkedList=new LinkedList<>();
	 		assertEquals(0, linkedList.size());
	 	}
	 
	 	@Test
	    public void testaddFirst() {
	 		LinkedList<String> linkedList=new LinkedList<>();
	 		linkedList.addFirst("first");
	 		linkedList.addFirst("second");
	 		assertEquals(2, linkedList.size());
	 	}
	 	@Test
	    public void testgetLast() {
	 		LinkedList<String> linkedList=new LinkedList<>();
	 		linkedList.addFirst("first");
	 		linkedList.addFirst("second");
	 		assertEquals("first", linkedList.getLast());
	 	}
	 	@Test
	    public void testAddLast() {
	 		LinkedList<String> linkedList=new LinkedList<>();
	 		linkedList.addLast("first");
	 		linkedList.addLast("second");
	 		assertEquals("second", linkedList.getLast());
	 	}
	 	
	 	@Test
	    public void testRemoveLast() {
	 		LinkedList<String> linkedList=new LinkedList<>();
	 		linkedList.removeFirst();//should not throw exception
	 		linkedList.addLast("first");
	 		
	 		linkedList.removeFirst();//removing only one element
	 		assertEquals(0, linkedList.size());
	 		
	 		linkedList.addLast("first");
	 		linkedList.addLast("second");
	 		linkedList.removeFirst();
	 		assertEquals(1, linkedList.size());
	 		assertEquals("second", linkedList.getLast());
	 		
	 		
	 	}
	 	
	 	
	 	@Test
	    public void testgetFirst() {
	 		LinkedList<String> linkedList=new LinkedList<>();
	 		assertNull(linkedList.getFirst());
	 		linkedList.addFirst("first");
	 		linkedList.addFirst("second");
	 		assertEquals("second", linkedList.getFirst());
	 	}
	 	
	 	@Test
	    public void testToString() {
	 		LinkedList<String> linkedList=new LinkedList<>();
	 		linkedList.addFirst("first");
	 		linkedList.addFirst("second");
	 		
	 		assertEquals("LinkedList [second->first]", linkedList.toString());
	 	}
	 	@Test
	    public void testClear() {
	 	
	 		LinkedList<String> linkedList=new LinkedList<>();
	 		linkedList.addFirst("first");
	 		linkedList.clear();
	 		assertEquals(0,linkedList.size());
	 		
	 	}
	 	
	 	
	 	
}
