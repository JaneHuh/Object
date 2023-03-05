package org.algorithm.week12;

import java.util.Stack;

public class MyGraph { // DFS
	int vertexCnt; 		// 노드 갯수
	int[][] m; 			// 그래프 저장용 2차원 배열
	boolean[] visit; 	// 방문 여부 저장용 배열

	public MyGraph(int N) {
		vertexCnt = N; 			// 노드 갯수 초기화
		m = new int[N][N]; 		// 그래프 배열 초기화 
		visit = new boolean[N]; // 방문 여부 저장용 배열 초기화 
	}

	public void makeUndirectedEdge(int from, int to) { // 그래프를 이차원배열로 표현해주기 위해 사용, 보통 이렇게 나타내진 않긴함.
		m[from][to] = 1; // from 노드에서 to 노드로 연결시 1(최초 0으로 초기화)
		m[to][from] = 1; // to 노드에서 from 노드로 동일하게 연결 
	}

	public void dfsStack(int v) {
		Stack<Integer> st = new Stack<>(); 
		st.push(v); 					// 최초 시작 노드를 스택에 입력 
		visit[v] = true; 				// 시작 노드의 방문 
		System.out.println(v + " "); 	// 노드 방문순서 출략시작을 출력한다.
		
		/*for(int i = 0; i < vertexCnt; ++i) {
			if(m[v][i] == 1 && !visit[i]) { // 종료조건 x ?? if문을 만족하지 않으면 종료가 된다. 
				dfsRecursion(i);
			}
		}*/

		while (!st.isEmpty()) { 	// 스택이 빌 때까지 반복
			int now = st.peek();	// now는 스택에 현재 가장 마지막 입력된 노드 
			boolean flag = false;	// 방문할 곳이 남아있는지를 체크하는 변수 (스택을 빼느냐 마느냐)

			for (int i = 0; i < vertexCnt; ++i) { // 선언한 노드까지
				if (m[now][i] == 1 && !visit[i]) {// !visit[i] = false: 방문하지 않은 곳
					visit[i] = true;
					flag = true; 	// 방문할 노드가 있는 것으로 변경
					st.push(i);  	// 해당 노드를 스택에 저장 
					System.out.println(i + " "); // 해당 노드를 이동경로로 출력
					break;
				}
			}
			if (!flag) {  // 방문할 곳이 한 군데도 없다면(flag = false라면 )
				st.pop(); // 스택에서 현재 노드 제거
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
