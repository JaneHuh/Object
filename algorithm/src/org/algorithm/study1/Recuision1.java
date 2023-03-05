package org.algorithm.study1;

public class Recuision1 { // 유클리드 호제법 (두 다항식의 최대공약수를 구하는 방법)

	public static int eucd(int big, int small) {
		int c = big % small;
		if (c == 0) { // point
			return small;
		} else {
			return eucd(small, c);
		}
	}

	public static void main(String[] args) {
		System.out.println(eucd(72, 42));

	}

}
