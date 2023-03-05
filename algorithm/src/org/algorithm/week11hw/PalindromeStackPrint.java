package org.algorithm.week11hw;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeStackPrint { // stack만 사용

	public static void main(String[] args) {
		System.out.println("60211127 허재인");
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<>(); 
		
		String str = sc.next();
		
		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}
		
		char temp;
		while (!stack.empty()) {
			temp = stack.pop();
			System.out.print(temp);
			
		}
		
	}

}
