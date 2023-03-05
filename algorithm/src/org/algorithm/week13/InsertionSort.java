package org.algorithm.week13;

public class InsertionSort {

	static void insertion(int arr[]) {
		// 0�� �ƴ� 1����!!
		for (int i = 1; i < arr.length; ++i) {
			int target = arr[i];
			
			int j = i - 1; // Ÿ���� �Ǵ� ������ �ٷ� ���� �ε������� 
			
			while (j >= 0 && target < arr[j]) { // while�� ���� �� 
				arr[j + 1] = arr[j];
				--j; // ���������� �������� ���� --j
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
