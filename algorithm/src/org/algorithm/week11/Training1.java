package org.algorithm.week11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Training1 { //최소최대 구하기 

	public static void main(String[] args) {
		ArrayList<Integer> integers1 = new ArrayList<Integer>();
		int max = 0, min =0;
		Scanner sc = new Scanner(System.in);

		while (true) {
			int num = sc.nextInt();
			
			integers1.add(num);
		
			if (num == 0) {
				break;
			}

			max = Collections.max(integers1);
			
			min = Collections.min(integers1);

		}
		System.out.println(max);
		System.out.println(min);
		
		//System.out.println(integers1.get(0) + " " + integers1.get(integers1.size()));

	}

}
