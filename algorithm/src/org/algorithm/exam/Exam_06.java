package org.algorithm.exam;

import java.util.Stack;

public class Exam_06 { // DFS
	int vertexCnt;
	int[][] m;
	boolean[] visit;

	public Exam_06(int N) {
		vertexCnt = N;
		m = new int[N][N];
		visit = new boolean[N];
	}

	public void makeUndirectedEdge(int from, int to) {
		m[from][to] = 1;
		m[to][from] = 1;
	}

	public void dfsStack(int v) {
		Stack<Integer> st = new Stack<>();
		st.push(v);
		visit[v] = true; //
		System.out.println(v + " ");

		while (!st.isEmpty()) {
			int now = st.peek();
			boolean flag = false;

			for (int i = 0; i < vertexCnt; ++i) {
				if (m[now][i] == 1 && !visit[i]) {
					visit[i] = true;
					flag = true;
					st.push(i);
					System.out.println(i + " ");
					break;
				}
			}
			if (!flag) {
				st.pop();
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("60211127 ÇãÀçÀÎ");

		Exam_06 mg = new Exam_06(6);
		mg.makeUndirectedEdge(0, 1);
		mg.makeUndirectedEdge(0, 2);
		mg.makeUndirectedEdge(1, 3);
		mg.makeUndirectedEdge(1, 4);
		mg.makeUndirectedEdge(2, 5);
		mg.dfsStack(0);

	}
}
