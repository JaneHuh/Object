package org.algorithm.study1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListFindKim { // 5¸í Áß ±è¾¾ Ã£±â

	public static void main(String[] args) {
		ArrayList<String> namelist = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			String str = sc.next();
			namelist.add(str);
		}
		
		for (int i = 0; i < 5; i++) {
			String name = namelist.get(i);
			if (name.startsWith("±è")) { 
				cnt++;
				System.out.println(cnt);
			}
		}
	}

}
