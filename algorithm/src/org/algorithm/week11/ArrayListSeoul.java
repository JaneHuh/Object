package org.algorithm.week11;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSeoul { // indexOf, lastIndexOf, contains, addAll

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("����");
		list.add("LA");
		list.add("����");
		list.add("LA");
		list.add("�λ�");

		System.out.println(list.get(0)); // ����

		System.out.println(list.contains("LA")); // true
		System.out.println(list.contains("���ֵ�")); // false

		//�Ϲݹ迭
		String[] arr = list.toArray(new String[list.size()]);
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("��ġ");
		list2.add("��ġ");
		list2.add("����");
		list2.add("�����");

		//�� ����Ʈ ����
		list.addAll(list2);
		System.out.println(list);
	}

}
