package org.algorithm.week12hw;

import java.util.Scanner;

public class TowerOfHanoi2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // ���� ����
		hanoi(1, 2, 3, num);
	}

	public static void hanoi(int from, int m, int to, int num) {// from -> to �� ����num�� �̵�
		if (num == 0)
			return;
		hanoi(from, to, m, num - 1); // ����num-1�� from -> m���� �̵�
		System.out.printf("%d : %d -> %d\n", num, from, to);// ����num�� from -> to �̵�
		hanoi(m, from, to, num - 1); // ����num-1�� m -> to�� �̵�
	}

}
