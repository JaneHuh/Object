package org.algorithm.study1;

import java.util.Scanner;

public class Recuision2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������. ");
		Recursion(n);
	}

	static String underscore = ""; // static �޼��忡���� �ν��Ͻ� ������ ����� �� ����.

	private static void Recursion(int n) {
		String line = underscore;
		System.out.println(line + "\"����Լ��� ������?\"");

		if (n == 0) { // ���� ����
			System.out.println(line + "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			System.out.println(line + "��� �亯�Ͽ���.");
			return;// return�ϰ� �ǹ����� �Ѿ 
		}

		System.out.println(line + "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
		System.out.println(line + "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
		System.out.println(line + "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");

		underscore += "____";
		Recursion(n - 1);
		System.out.println(line + "��� �亯�Ͽ���."); // return�ϰ� ��� ���ߴ� �͵��� ��µȴ�. (n�� ����Ѵ�.)

	}

}
