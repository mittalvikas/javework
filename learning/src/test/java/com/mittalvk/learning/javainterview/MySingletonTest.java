package com.mittalvk.learning.javainterview;

import org.junit.Test;

import junit.framework.Assert;

public class MySingletonTest {
	
	
	@Test
	public void testMysingleton(){
		
		MySingleton obj1=MySingleton.getInstance();
		MySingleton obj2=MySingleton.getInstance();
		
		Assert.assertEquals(true, obj1==obj2);
		Assert.assertEquals(true, obj1.hashCode()==obj2.hashCode());
		
		
	}
	
	

}
