package org.algorithm.week12hw;

public class MyGraphRecursion {

	int vertexCnt;
	int[][] m;
	boolean[] visit;

	public MyGraphRecursion(int N) {
		vertexCnt = N;
		m = new int[N][N]; // ����
		visit = new boolean[N];
	}

	public void makeUndirectedEdge(int from, int to) { // �׷����� �������迭�� ǥ�����ֱ� ���� ���
		m[from][to] = 1;
		m[to][from] = 1;
	}

	public void dfsRecursion(int v) {
		visit[v] = true; // ����
		System.out.println(v + " "); // ������ ����Ѵ�.

		for (int i = 0; i < vertexCnt; ++i) {
			if (m[v][i] == 1 && !visit[i]) { // �������� x ?? if���� �������� ������ ���ᰡ �ȴ�.
				dfsRecursion(i);
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("60211127 ������");
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
