package org.algorithm.week11;

import java.util.Scanner;
import java.util.Stack;

public class Training2 { //�������

	public static void main(String[] args) {
		Stack<String> list = new Stack<>();
		Scanner sc = new Scanner(System.in);

		int num = 0;
		for (int i = 0; i < 100; i++) {
			String b = sc.nextLine();
			if (b.equals(".")) { // String�� equals�� ����ؾ� �Ѵ�.
				break;
			} else
				list.push(b); // stack�� �ֱ�
		}

		System.out.println(list);
		num = list.size();
		for (int i = 0; i < num; i++) {
			System.out.println(list.pop());
		}
	}

}
