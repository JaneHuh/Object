package org.algorithm.week12;

public class Recursion02 { 

	public static void hello(int count) {
		if(count == 0)
			return; //return ������ ���� ���ؾ��Ѵ�. 
		
		System.out.println("Hello World!");
		
		hello(--count);
	}

	public static void main(String[] args) {
		hello(5); // "Hello World!"�� 5�� ��µȴ�. 
	}

}
