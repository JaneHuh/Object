package org.algorithm.week11hw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeStackQueue { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		Stack<Character> stack = new Stack<>();
		Queue<Character> queue = new LinkedList<>();
		for (int i = 0; i < input.length(); ++i) {
			stack.add(input.charAt(i));
			queue.add(input.charAt(i));
		}

		boolean isTrue = true;

		for (int i = 0; i < input.length(); ++i) {
			if (queue.poll() == stack.pop()) {
				continue;
			} else {
				isTrue = false;
				break;
			}
		}
		System.out.println(isTrue);

	}

}
