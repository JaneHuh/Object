package org.algorithm.week11;

import java.util.Stack;

public final class Stack1 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		stack.push("apple");
		stack.push("gam");
		stack.push("bea");
		
		System.out.println("스택의 크기는" + stack.size());
		
		System.out.println("gam 있나? " + stack.contains("gam"));
		
		System.out.println(stack.pop());
		System.out.println("스택의 크기는 " + stack.size());
		
		System.out.println(stack.pop());
		System.out.println("스택의 크기는 " + stack.size());
		
		System.out.println(stack.pop());
		System.out.println("스택의 크기는 " + stack.size());
		
	}

}
