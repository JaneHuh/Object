package org.algorithm.week12;

public class Recursion02 { 

	public static void hello(int count) {
		if(count == 0)
			return; //return 다음에 값을 곱해야한다. 
		
		System.out.println("Hello World!");
		
		hello(--count);
	}

	public static void main(String[] args) {
		hello(5); // "Hello World!"가 5번 출력된다. 
	}

}
