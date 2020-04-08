package com.collectionmaps;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*add() throw Exceptio where offer() dont and same as add
		 *remove() throw Exceptio where poll() dont and same as remove
		 *element() throw Exceptio where peek() dont and same as examine 1st elements from queue
		 * */
		
		Queue<Integer> queueObj = new LinkedBlockingQueue<>(10);	//size 10
		queueObj.offer(1);		//same as queueObj.add(1);
		queueObj.offer(2);
		queueObj.offer(3);
		queueObj.offer(4);
		queueObj.offer(5);
		queueObj.offer(6);
		queueObj.offer(7);
		queueObj.offer(8);
		queueObj.offer(9);
		queueObj.offer(10);
		queueObj.offer(11);		//it dont thow exception IllegalstateException
		
		for(Integer element : queueObj) {
			System.out.println(element);
		}
		System.out.println();
		System.out.println("Access First Element : " + queueObj.peek());
		
		System.out.println("Remove First Element from queue : " + queueObj.poll());
	}

}
