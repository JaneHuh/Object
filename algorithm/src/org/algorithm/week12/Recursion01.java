package org.algorithm.week12;

public class Recursion01 { // ���� ������ ����. 

	public static void hello() {
		System.out.println("Hello World!");
		
		hello();
	}

	public static void main(String[] args) {
		hello();
	}
}
