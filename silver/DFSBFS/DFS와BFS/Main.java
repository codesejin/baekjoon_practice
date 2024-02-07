package silver.DFSBFS.DFS와BFS;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    static boolean[][] graph;
    static boolean[] visited;
    static int N,M; // 정점, 간선
    static int V; // 시작점

    static StringBuilder sb = new StringBuilder();

    public static void dfs(int idx) {
        visited[idx] = true;
        sb.append(idx).append(" ");

        for (int i = 1; i <= N; i++) {
            if (visited[i] == false && graph[idx][i])
                dfs(i);
        }
    }

    public static void bfs(int idx) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(idx);
        visited[idx] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            sb.append(current).append(" ");

            for (int i = 1; i <= N; i++) {
                if (visited[i] == false && graph[current][i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        graph = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];

        // 1. graph에 연결 정보 채우기
        int x, y;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            graph[x][y] = true; // x에 대해 y가 연결되어있다.
            graph[y][x] = true; // y에 대해 x가 연결되어있다.
        }

        // 2. dfs(재귀호출) 함수 및 출력
        dfs(V);
        bw.write(sb.toString().trim());
        bw.newLine(); // dfs 결과 후 개행

        sb.delete(0, sb.length());
        Arrays.fill(visited, false); // 방문 체크하는 visited 초기화
        // 3. bfs(queue) 함수 및 출력
        bfs(V);
        bw.write(sb.toString().trim());

        br.close();
        bw.close();
    }
}
