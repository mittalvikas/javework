package com.mittalvk.learning.javainterview;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsume {

	public static void main(String[] args) {

		List<Integer> numbers=new ArrayList<>();
		
		Thread t1=new Thread(new Producer(numbers),"Producer");
		Thread t2=new Thread(new Consumer(numbers),"Consumer");
		
		t1.start();
		t2.start();


	}

}


class Producer implements Runnable{
	private List<Integer> numbers;
	private static int counter=1;

	public Producer(List<Integer> numbers) {
		super();
		this.numbers = numbers;
	}

	@Override
	public void run() {


		while(true){

			try {
				synchronized (numbers) {
					if(numbers.size()>=10)
						numbers.wait();
					System.out.println("Produced::"+counter);
					numbers.add(counter++);
					numbers.notifyAll();
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}



		}

	}




}

class Consumer implements Runnable{
	private List<Integer> numbers;

	public Consumer(List<Integer> numbers) {
		super();
		this.numbers = numbers;
	}

	@Override
	public void run() {

		while(true){

			try {
				synchronized (numbers) {
					if(numbers.size()==0)
						numbers.wait();
					System.out.println("Consumed::"+numbers.remove(0));
					numbers.notifyAll();
					Thread.sleep(2000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}


		}
	}
}	

