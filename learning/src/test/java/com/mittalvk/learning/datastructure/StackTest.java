package com.mittalvk.learning.datastructure;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import com.mittalvk.learning.datastructure.base.BaseStack;
import com.mittalvk.learning.datastructure.impl.Stack;

public class StackTest {
	
	 BaseStack<String> stackTest;

	    @Before
	    public void setUp() throws Exception {
	        stackTest = new Stack<>(10);
	    }
	    
	    
	    @Test
	    public void testPushAndPop() {
	    	
	        stackTest.push("5");
	        assertEquals("5", stackTest.pop());
	        
	        stackTest.push("5");
	        stackTest.push("4");
	        assertNotEquals("5", stackTest.pop());
	        stackTest.pop();
	     }
	    
	    @Test(expected = IndexOutOfBoundsException.class)
	    public void testEmptyStack() {
	    	 stackTest.pop();
	    	
	    }
	    
	    
	    
	    
	    
	    
	    
	    @Test
	    public void testPeek() {
	    	
	    	stackTest.push("5");
	    	stackTest.push("6");
	    	assertEquals("6", stackTest.peek());
	    	
	    	
	    	
	    }

}
