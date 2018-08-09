package com.mittalvk.learning.datastructure;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class QueueTest {
	
	 BaseQueue<String> queueTest;

	    @Before
	    public void setUp() throws Exception {
	        queueTest = new Queue<>(10);
	    }
	    
	    
	    @Test
	    public void testEnqueueAndDequeue() {
	    	
	        queueTest.enqueue("5");
	        assertEquals("5", queueTest.dequeue());
	        queueTest.enqueue("4");
	        assertNotEquals("5", queueTest.dequeue());
	     }
	    
	    @Test(expected = IndexOutOfBoundsException.class)
	    public void testEmptyDequeue() {
	    	 queueTest.dequeue();
	    	
	    }
	    
	    
	    
	    @Test
	    public void testHasItems() {
	    	
	    	assertEquals(false, queueTest.hasItems());
	    	queueTest.enqueue("5");
	    	assertEquals(true, queueTest.hasItems());
	    	queueTest.dequeue();
	    }
	    
	    
	    @Test
	    public void testSize() {
	    
	    	queueTest.enqueue("5");
	    	queueTest.enqueue("6");
	    	assertEquals(2, queueTest.size());
	    	queueTest.dequeue();
	    	queueTest.dequeue();
	    	
	    }
	    
	    @Test
	    public void testPeek() {
	    	
	    	queueTest.enqueue("5");
	    	queueTest.enqueue("6");
	    	assertEquals("5", queueTest.peek());
	    	assertEquals(2, queueTest.size());
	    	queueTest.dequeue();
	    	queueTest.dequeue();
	    	
	    	
	    	
	    }

}
