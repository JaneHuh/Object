package org.algorithm.week12;

public class FactorialRecursion {

	public static int factorial(int n) {
		 if (n==1) return 1; // 순환을 멈추는 부분
		 else return (n * factorial(n-1)); // 순환호출을 하는 부분 
	}

	public static void main(String[] args) {
		System.out.println(factorial(4));
	}

}
