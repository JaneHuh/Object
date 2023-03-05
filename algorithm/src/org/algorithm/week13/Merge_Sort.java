package org.algorithm.week13;

public class Merge_Sort {
	static void mergeSort(int[] a, int left, int right) {
							// left는 맨 왼쪽 인덱스, right는 맨 오른쪽 인덱스
		if (left < right) { // 원소의 수가 2개 이상일 경우 실행
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

		while (i <= mid && j <= right) { // 작은 값부터 temp 배열에 이력
			if (arr[i] < arr[j]) {
				temp[temp_index++] = arr[i++];
			} else {
				temp[temp_index++] = arr[j++];
			}
		}

		while (i <= mid) { // 왼쪽 배열에 원소가 남아 있는 경우
			temp[temp_index++] = arr[i++];
		}

		while (j <= right) { // 오른쪽 배열에 원소가 남아있는 경우 
			temp[temp_index++] = arr[j++];
		}

		for (int index = left; index < temp_index; index++) {
			arr[index] = temp[index]; // 원배열 arr에 정렬된 값 삽입
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
