package org.algorithm.week11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class StackQueue {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		//System.out.println(stack.pop());
		//System.out.println(stack.pop());
		//System.out.println(stack.pop());
		System.out.println(stack.size() + "\n");
		
		for(int i = 0; i < stack.size()+2; i++) {
			System.out.println(stack.pop());
		}
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.offer(3);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		// System.out.println(queue);
	}

}
