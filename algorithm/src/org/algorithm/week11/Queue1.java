package org.algorithm.week11;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(1);
		queue.offer(3);
		System.out.println(queue.poll()); // 출력하고 제거 
		System.out.println(queue);
		queue.remove();
		queue.clear();
	}

}
