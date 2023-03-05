package org.algorithm.exam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Exam_01 {

	public static void main(String[] args) {
		System.out.println("60211127 허재인");
		Stack<String> list = new Stack<>();
		Queue<String> queue = new LinkedList<>();
		Scanner sc = new Scanner(System.in);

		String type = sc.nextLine();

		int num = 0;

		for (int i = 0; i < 3; i++) {
			String b = sc.nextLine();
			list.push(b); // stack에 넣기
			queue.add(b);

		}

		if (type == "K") {
			num = list.size();
			for (int i = 0; i < num; i++) {
				System.out.print(list.pop() + " ");
			}
		} else if (type == "A") {
			num = queue.size();
			for (int i = 0; i < num; i++) {
				System.out.print(queue.poll() + " ");
			}
		} else {
			System.out.println("다시 입력하시길 바랍니다.");
		}

	}

}
