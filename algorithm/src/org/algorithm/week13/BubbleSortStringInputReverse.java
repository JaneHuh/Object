package org.algorithm.week13;

import java.util.Scanner;

public class BubbleSortStringInputReverse {
	public static void sort(char[] arr) {
		char temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = arr.length-1; i >= 0; --i) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] arr = str.toCharArray();
		sort(arr);
	}
}
