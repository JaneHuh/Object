package org.algorithm.week13;

public class SelectionSort {
	static void selection(int arr[]) {
		for (int i = 0; i < arr.length; ++i) {
			int min_index = i; // ���� �ε��� �� ����
			for (int j = i; j < arr.length; ++j) {
				if (arr[min_index] > arr[j]) { // �ּҰ��� ���� �ε��� ã��
					min_index = j;
				}
			}
			// ����
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		int[] arr = { 5, 1, 3, 9, 6, 2, 4, 7, 8 };
		selection(arr);
	}

}
