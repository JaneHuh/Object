package org.algorithm.study1;

public class Recuision1 { // ��Ŭ���� ȣ���� (�� ���׽��� �ִ������� ���ϴ� ���)

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
