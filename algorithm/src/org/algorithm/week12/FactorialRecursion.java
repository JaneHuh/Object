package org.algorithm.week12;

public class FactorialRecursion {

	public static int factorial(int n) {
		 if (n==1) return 1; // ��ȯ�� ���ߴ� �κ�
		 else return (n * factorial(n-1)); // ��ȯȣ���� �ϴ� �κ� 
	}

	public static void main(String[] args) {
		System.out.println(factorial(4));
	}

}
