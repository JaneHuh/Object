package org.algorithm.week12hw;

import java.util.Scanner;

public class Boom {
	public static void boom(int n) {
		if (n == 0) {
			System.out.println("Boom");
			return;
		}
		System.out.println(n);
		boom(n - 1);
	}

	public static void main(String[] args) {
		System.out.println("60211127 ������");
		Scanner sc = new Scanner(System.in);

		System.out.println("���ڸ� �Է��Ͻÿ�. ");
		int num = sc.nextInt();
		boom(num);
	}

}
