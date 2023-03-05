package org.algorithm.week12;

public class Fibonacci {

	public static int fib(int n) {// 재귀함수 2개 사용 4번째 + 3번째
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fib(n - 2) + fib(n - 1);
		}

	}

	public static void main(String[] args) {
		System.out.println(fib(6));
	}

}
