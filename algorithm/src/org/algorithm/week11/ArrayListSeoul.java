package org.algorithm.week11;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSeoul { // indexOf, lastIndexOf, contains, addAll

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("서울");
		list.add("LA");
		list.add("대전");
		list.add("LA");
		list.add("부산");

		System.out.println(list.get(0)); // 서울

		System.out.println(list.contains("LA")); // true
		System.out.println(list.contains("제주도")); // false

		//일반배열
		String[] arr = list.toArray(new String[list.size()]);
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("김치");
		list2.add("멸치");
		list2.add("국수");
		list2.add("비빔면");

		//두 리스트 병합
		list.addAll(list2);
		System.out.println(list);
	}

}
