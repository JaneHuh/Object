package org.algorithm.week12;

import java.util.Stack;

public class MyGraph { // DFS
	int vertexCnt; 		// ��� ����
	int[][] m; 			// �׷��� ����� 2���� �迭
	boolean[] visit; 	// �湮 ���� ����� �迭

	public MyGraph(int N) {
		vertexCnt = N; 			// ��� ���� �ʱ�ȭ
		m = new int[N][N]; 		// �׷��� �迭 �ʱ�ȭ 
		visit = new boolean[N]; // �湮 ���� ����� �迭 �ʱ�ȭ 
	}

	public void makeUndirectedEdge(int from, int to) { // �׷����� �������迭�� ǥ�����ֱ� ���� ���, ���� �̷��� ��Ÿ���� �ʱ���.
		m[from][to] = 1; // from ��忡�� to ���� ����� 1(���� 0���� �ʱ�ȭ)
		m[to][from] = 1; // to ��忡�� from ���� �����ϰ� ���� 
	}

	public void dfsStack(int v) {
		Stack<Integer> st = new Stack<>(); 
		st.push(v); 					// ���� ���� ��带 ���ÿ� �Է� 
		visit[v] = true; 				// ���� ����� �湮 
		System.out.println(v + " "); 	// ��� �湮���� �ⷫ������ ����Ѵ�.
		
		/*for(int i = 0; i < vertexCnt; ++i) {
			if(m[v][i] == 1 && !visit[i]) { // �������� x ?? if���� �������� ������ ���ᰡ �ȴ�. 
				dfsRecursion(i);
			}
		}*/

		while (!st.isEmpty()) { 	// ������ �� ������ �ݺ�
			int now = st.peek();	// now�� ���ÿ� ���� ���� ������ �Էµ� ��� 
			boolean flag = false;	// �湮�� ���� �����ִ����� üũ�ϴ� ���� (������ ������ ������)

			for (int i = 0; i < vertexCnt; ++i) { // ������ ������
				if (m[now][i] == 1 && !visit[i]) {// !visit[i] = false: �湮���� ���� ��
					visit[i] = true;
					flag = true; 	// �湮�� ��尡 �ִ� ������ ����
					st.push(i);  	// �ش� ��带 ���ÿ� ���� 
					System.out.println(i + " "); // �ش� ��带 �̵���η� ���
					break;
				}
			}
			if (!flag) {  // �湮�� ���� �� ������ ���ٸ�(flag = false��� )
				st.pop(); // ���ÿ��� ���� ��� ����
			}
		}
		
	}

	public static void main(String[] args) {
		MyGraph mg = new MyGraph(8);
		mg.makeUndirectedEdge(0, 1);
		mg.makeUndirectedEdge(0, 2);
		mg.makeUndirectedEdge(0, 3);
		mg.makeUndirectedEdge(1, 4);
		mg.makeUndirectedEdge(1, 5);
		mg.makeUndirectedEdge(2, 6);
		mg.makeUndirectedEdge(3, 6);
		mg.makeUndirectedEdge(3, 7);
		mg.dfsStack(0);

	}

}
