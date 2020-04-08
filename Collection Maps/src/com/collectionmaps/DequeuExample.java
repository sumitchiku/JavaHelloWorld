package com.collectionmaps;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class DequeuExample {		//double ended queue

	/*First Elements				|		Last Elements
	addFirst(e)==offerFirst(e)		|	addLast(e)==offerLast(e)
	removeFirst(e)==pollFirst(e)	|	removeLast(e)==pollLast(e)
	getFirst(e)==peekFirst(e)		|	getLast(e)==peekLast(e)
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<Integer> deQueueObj = new LinkedBlockingDeque<>();
		deQueueObj.offer(1);		//same as queueObj.add(1);
		deQueueObj.offer(2);
		deQueueObj.offer(3);
		deQueueObj.offer(4);
		deQueueObj.offer(5);
		deQueueObj.offer(6);
		deQueueObj.offer(7);
		deQueueObj.offer(8);
		deQueueObj.offer(9);
		deQueueObj.offer(10);
		deQueueObj.offer(11);	
		
		for(Integer element : deQueueObj) {
			System.out.println(element);
		}
		System.out.println("***********************");
		
		deQueueObj.addFirst(0);
		deQueueObj.removeLast();
		
		for(Integer element : deQueueObj) {
			System.out.println(element);
		}
		System.out.println("***********************");
		
		System.out.println("Last Element of Queue is : " + deQueueObj.getLast());

	}

}
