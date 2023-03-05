package org.algorithm.week11hw;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome1 {

	public static void main(String[] args) {
		System.out.println("60211127 허재인");
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();

		boolean result = true;
		String str = sc.nextLine();
		int len = str.length();
		char[] cArray = str.toCharArray(); // 배열
		int end = len / 2 - 1; // 문자열을 반으로 쪼갰을때 배열의 끝
		int start; // 문자열을 반으로 쪼갰을때 배열의 처음.

		if (len % 2 == 0) { // 짝수
			start = end + 1;
		} else { // 홀수
			start = end + 2;
		}

		for (int i = 0; i <= end; i++) { // 배열
			stack.push(cArray[i]);
		}

		for (int i = start; i < len; i++) {
			if (!stack.isEmpty()) {
				if (cArray[i] != stack.pop()) {
					result = false;
					break;
				}
			}
		}

		if (result)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
