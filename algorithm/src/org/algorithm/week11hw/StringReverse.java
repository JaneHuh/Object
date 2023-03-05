package org.algorithm.week11hw;

import java.util.Scanner;
import java.util.Stack;

public class StringReverse { // asd dsa ddd -> dd dsa asd 출력

	public static void main(String[] args) {
		Stack<String> list = new Stack<>();
		Scanner sc = new Scanner(System.in);

		int num = 0;
		for (int i = 0; i < 100; i++) {
			String b = sc.nextLine();
			if (b.equals(".")) { // String은 equals를 사용해야 한다. 
				break;
			} else
				list.push(b); // stack에 넣기 
		}

		System.out.println(list);
		num = list.size();
		for (int i = 0; i < num; i++) {
			System.out.println(list.pop());
		}
	}

}
