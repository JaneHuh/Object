package org.algorithm.week11hw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cafe {

	public static void main(String[] args) {
		System.out.println("6021127 ������");
		Scanner sc = new Scanner(System.in);
		Queue<String> queue = new LinkedList<>();

		while (true) {
			System.out.println("�ֹ��� 1, �Ϸ�� 2, ����� 0");
			int num = sc.nextInt();

			if (num == 1) {
				System.out.println("�ֹ��Ͻ� �����?");
				String menu = sc.next();
				queue.add(menu);
				System.out.println("�غ��� " + queue.size() + "��");
			} else if (num == 2) {
				System.out.println(queue.poll() + " ���Խ��ϴ�. ");
				System.out.println("�غ��� " + queue.size() + "��");
			} else if (num == 0) {
				System.out.println("�����մϴ�.");
				break;
			} else {
				System.out.println("0, 1, 2 �߿� �Է����ּ���.");

			}

		}
	}

}
