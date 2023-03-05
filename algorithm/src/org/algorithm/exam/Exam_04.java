package org.algorithm.exam;

public class Exam_04 {
	static int sum = 0;

	public static void re(int n) {// 재귀함수 2개 사용 4번째 + 3번째
		if (n == 0) {
			System.out.println(sum);
			return;
		}
		if (n % 3 == 0) {
			sum += n;
		}
		re(n - 1);

	}

	public static void main(String[] args) {
		System.out.println("60211127 허재인");
		re(100);
	}

}
