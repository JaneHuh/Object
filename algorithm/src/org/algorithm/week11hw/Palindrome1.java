package org.algorithm.week11hw;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome1 {

	public static void main(String[] args) {
		System.out.println("60211127 ������");
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();

		boolean result = true;
		String str = sc.nextLine();
		int len = str.length();
		char[] cArray = str.toCharArray(); // �迭
		int end = len / 2 - 1; // ���ڿ��� ������ �ɰ����� �迭�� ��
		int start; // ���ڿ��� ������ �ɰ����� �迭�� ó��.

		if (len % 2 == 0) { // ¦��
			start = end + 1;
		} else { // Ȧ��
			start = end + 2;
		}

		for (int i = 0; i <= end; i++) { // �迭
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
