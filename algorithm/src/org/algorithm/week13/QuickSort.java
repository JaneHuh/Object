package org.algorithm.week13;

public class QuickSort {
	public static void m_pivot_sort(int[] a, int lo, int hi) {
		if (lo >= hi) { // 종료조건
			return;
		}
		int pivot = partition(a, lo, hi);

		m_pivot_sort(a, lo, pivot);
		m_pivot_sort(a, pivot + 1, hi);

	}

	private static int partition(int[] a, int left, int right) {
		int lo = left - 1;
		int hi = right + 1;
		int pivot = a[(left + right) / 2];
		while (true) {
			do {
				lo++;
			} while (a[lo] < pivot);

			do {
				hi--;
			} while (a[hi] > pivot && lo <= hi);

			if (lo >= hi) {
				return hi;
			}

			swap(a, lo, hi);
		}
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 1, 3, 9, 6, 2, 4, 7, 8 };
		m_pivot_sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

}
