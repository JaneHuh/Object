package org.algorithm.exam;

public class SelectionDemo {

	public static void main(String[] args) {
		System.out.println("60211127 허재인");
		Selection s = new Selection();

		int[] arr = { 5, 3, 8, 1, 2, 7 };
		s.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}

}

class Selection {
	public static int[] sort(int arr[]) {
		for (int i = 0; i < arr.length - 1; ++i) {
			int midIdx = i; // 최초 인덱스 값 선언
			for (int j = i; j < arr.length; ++j) {
				if (arr[midIdx] > arr[j]) { // 최소값을 가진 인덱스 찾기
					midIdx = j;
				}
			}
			// 스왑
			swap(arr, i, midIdx);

		}
		return arr;

	}

	private static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
