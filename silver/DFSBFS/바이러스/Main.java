package silver.DFSBFS.바이러스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] graph;
    static boolean[] visited;
    static int N, M, answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());// 컴퓨터 수
        M = Integer.parseInt(br.readLine());// 네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수

        graph = new boolean[N+1][N+1];
        visited = new boolean[N+1];

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = true;
            graph[b][a] = true;
        }

        dfs(1);
        System.out.println(answer);
    }
    private static void dfs(int idx) {
        visited[idx] = true;
        for (int i = 1; i <= N; i++) {
            if (!visited[i] && graph[idx][i]) {
                answer ++;
                dfs(i);
            }
        }
    }
}
