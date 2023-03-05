package org.algorithm.week13;

public class Merge_Sort {
	static void mergeSort(int[] a, int left, int right) {
							// left�� �� ���� �ε���, right�� �� ������ �ε���
		if (left < right) { // ������ ���� 2�� �̻��� ��� ����
			int mid = (left + right) / 2;

			mergeSort(a, left, mid);
			mergeSort(a, mid + 1, right);
			merge(a, left, mid, right);
		}
	}

	static void merge(int[] arr, int left, int mid, int right) {
		int i = left;
		int j = mid + 1;
		int temp_index = left;

		int[] temp = new int[arr.length];

		while (i <= mid && j <= right) { // ���� ������ temp �迭�� �̷�
			if (arr[i] < arr[j]) {
				temp[temp_index++] = arr[i++];
			} else {
				temp[temp_index++] = arr[j++];
			}
		}

		while (i <= mid) { // ���� �迭�� ���Ұ� ���� �ִ� ���
			temp[temp_index++] = arr[i++];
		}

		while (j <= right) { // ������ �迭�� ���Ұ� �����ִ� ��� 
			temp[temp_index++] = arr[j++];
		}

		for (int index = left; index < temp_index; index++) {
			arr[index] = temp[index]; // ���迭 arr�� ���ĵ� �� ����
		}

	}

	public static void main(String[] args) {
		int[] arr = { 5, 1, 3, 9, 6, 2, 4, 7, 8 };
		mergeSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

}
