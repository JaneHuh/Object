package org.algorithm.week13;

public class InsertionSort {

	static void insertion(int arr[]) {
		// 0이 아닌 1부터!!
		for (int i = 1; i < arr.length; ++i) {
			int target = arr[i];
			
			int j = i - 1; // 타겟이 되는 원소의 바로 이전 인덱스부터 
			
			while (j >= 0 && target < arr[j]) { // while을 통해 비교 
				arr[j + 1] = arr[j];
				--j; // 순차적으로 내려가기 위해 --j
			}
			arr[j + 1] = target;
		}
		for (int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		int[] arr = { 5, 1, 3, 9, 6, 2, 4, 7, 8 };
		insertion(arr);
	}

}
