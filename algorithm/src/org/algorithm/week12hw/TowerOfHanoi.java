package org.algorithm.week12hw;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		System.out.println("60211127 허재인");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 원판 개수
		hanoi(1, 2, 3, num);
	}

	public static void hanoi(int from, int m, int to, int num) {// from -> to 로 원판num이 이동
		if (num == 0)
			return;
		hanoi(from, to, m, num - 1); // 원판 num-1, from -> m으로 이동
		System.out.println( "기둥" + from +"의 원반을 기둥 "+ to + "으로 옮긴다.");// 원판 num이 from -> to 이동
		hanoi(m, from, to, num - 1); // 원판 num-1, m -> to로 이동
	}
}
