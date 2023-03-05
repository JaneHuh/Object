package org.algorithm.week12;

public class Recursion01 { // 종료 조건이 없다. 

	public static void hello() {
		System.out.println("Hello World!");
		
		hello();
	}

	public static void main(String[] args) {
		hello();
	}
}
