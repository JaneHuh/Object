package org.algorithm.week11hw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cafe {

	public static void main(String[] args) {
		System.out.println("6021127 허재인");
		Scanner sc = new Scanner(System.in);
		Queue<String> queue = new LinkedList<>();

		while (true) {
			System.out.println("주문은 1, 완료는 2, 종료는 0");
			int num = sc.nextInt();

			if (num == 1) {
				System.out.println("주문하실 음료는?");
				String menu = sc.next();
				queue.add(menu);
				System.out.println("준비중 " + queue.size() + "개");
			} else if (num == 2) {
				System.out.println(queue.poll() + " 나왔습니다. ");
				System.out.println("준비중 " + queue.size() + "개");
			} else if (num == 0) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("0, 1, 2 중에 입력해주세요.");

			}

		}
	}

}
