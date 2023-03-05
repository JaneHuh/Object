package org.algorithm.week12hw;

public class ExponentiationRecursion {

	public static int recursionF(int x, int n) {
		if (n == 0) {
			return 1;
		} else {
			return x * recursionF(x, n - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println("60211127 «„¿Á¿Œ");
		int x = 2, n = 10;
		System.out.println(recursionF(x, n));

	}

}
