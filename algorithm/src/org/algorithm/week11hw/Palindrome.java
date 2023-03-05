package org.algorithm.week11hw;

import java.util.ArrayList;
import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		// ArrayList<Integer> integers1 = new ArrayList<Integer>();
		ArrayList<String> colors = new ArrayList<>(Arrays.asList("Black", "White", "Green", "Red"));

		// for-each loop
		for (String color : colors) {
			System.out.println(color + " ");
		}
		System.out.println();

		// for loop
		for (int i = 0; i < colors.size(); ++i) {
			System.out.println(colors.get(i) + " ");
		}
		System.out.println();

	}

}
