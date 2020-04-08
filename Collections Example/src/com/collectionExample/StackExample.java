package com.collectionExample;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> demo = new Stack<Integer>();
		demo.push(0);
		demo.push(1);
		demo.push(2);
		demo.push(3);
		demo.push(4);
		demo.push(5);
		demo.push(6);
		demo.push(7);
		
		demo.pop();
		for(int i : demo) {
			System.out.println(i);
		}
		System.out.println();
		
		System.out.println("Last Element in Stack : " + demo.peek());
		
		if(demo.isEmpty()) {
			System.out.println("Stack Is Empty");
		}else {
			System.out.println("Stack Is Not Empty");
		}
		System.out.println();
		
		System.out.println("Searching 51 in Stack result is : " + demo.search(51));

	}

}
