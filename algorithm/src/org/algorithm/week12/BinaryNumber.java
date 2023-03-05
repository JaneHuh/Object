package org.algorithm.week12;

import java.util.Scanner;

public class BinaryNumber { // 10진수 -> 이진수
	public static void recursive(int n) {
		if (n == 0)
			return;

		recursive(n / 2);
		System.out.print(n % 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		recursive(n);

	}
}
