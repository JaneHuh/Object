package org.algorithm.week12hw;

public class MyGraphRecursion {

	int vertexCnt;
	int[][] m;
	boolean[] visit;

	public MyGraphRecursion(int N) {
		vertexCnt = N;
		m = new int[N][N]; // 연결
		visit = new boolean[N];
	}

	public void makeUndirectedEdge(int from, int to) { // 그래프를 이차원배열로 표현해주기 위해 사용
		m[from][to] = 1;
		m[to][from] = 1;
	}

	public void dfsRecursion(int v) {
		visit[v] = true; // 시작
		System.out.println(v + " "); // 시작을 출력한다.

		for (int i = 0; i < vertexCnt; ++i) {
			if (m[v][i] == 1 && !visit[i]) { // 종료조건 x ?? if문을 만족하지 않으면 종료가 된다.
				dfsRecursion(i);
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("60211127 허재인");
		MyGraphRecursion mg = new MyGraphRecursion(8);
		mg.makeUndirectedEdge(0, 1);
		mg.makeUndirectedEdge(0, 2);
		mg.makeUndirectedEdge(0, 3);
		mg.makeUndirectedEdge(1, 4);
		mg.makeUndirectedEdge(1, 5);
		mg.makeUndirectedEdge(2, 6);
		mg.makeUndirectedEdge(3, 6);
		mg.makeUndirectedEdge(3, 7);
		mg.dfsRecursion(0);

	}

}
