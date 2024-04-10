package silver.DFSBFS.촌수계산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] graph;
    static boolean[] visited;
    static int N, M, start, end, answer; // 전체 사람 수, 간선수, 시작점, 끝점, 정답
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        graph = new boolean[N+1][N+1];
        visited = new boolean[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(br.readLine());
        answer = -1;
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            graph[parent][child] = true;
            graph[child][parent] = true;
        }
        dfs(start, 0);
        System.out.println(answer);
    }
    public static void dfs(int idx, int count) {
        visited[idx] = true;
        if (idx == end) {
            answer = count;
            return;
        }
        for (int i = 1; i <= N ; i++) {
            if (!visited[i] && graph[idx][i]) {
                dfs(i, count + 1);
            }
        }
    }
}
