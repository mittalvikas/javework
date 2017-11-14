package com.mittalvk.learning.javainterview;

public class MySingleton {
	
	private static MySingleton _instance;
	
	private MySingleton(){
		
	}
	
	public static MySingleton getInstance(){
		
		if(_instance==null){
			synchronized (MySingleton.class) {
				if(_instance==null)_instance=new MySingleton();
			}
			
		}
		return _instance;
	}
	
	

}
