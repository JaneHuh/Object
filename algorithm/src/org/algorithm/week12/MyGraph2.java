package org.algorithm.week12;

import java.util.LinkedList;
import java.util.Queue;

public class MyGraph2 { // BFS
	int vertexCnt;
	int[][] m;
	boolean[] visit;

	public MyGraph2(int N) {
		vertexCnt = N;
		m = new int[N][N];
		visit = new boolean[N];

	}

	public void make_UndirectedEdge(int from, int to) {
		m[from][to] = 1;
		m[to][from] = 1;
	}

	public void bfs(int v) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(v);
		visit[v] = true;

		while (!q.isEmpty()) {
			int now = q.poll();
			System.out.println(now + " ");

			for (int i = 0; i < vertexCnt; ++i) {
				if (m[now][i] == 1 && !visit[i]) {
					visit[i] = true;
					q.offer(i);
				}
			}

		}
	}

	public static void main(String[] args) {
		MyGraph2 mg = new MyGraph2(8);
		mg.make_UndirectedEdge(0, 1);
		mg.make_UndirectedEdge(0, 2);
		mg.make_UndirectedEdge(0, 3);
		mg.make_UndirectedEdge(1, 4);
		mg.make_UndirectedEdge(1, 5);
		mg.make_UndirectedEdge(2, 6);
		mg.make_UndirectedEdge(3, 6);
		mg.make_UndirectedEdge(3, 7);
		mg.bfs(0);
		
	}

}
