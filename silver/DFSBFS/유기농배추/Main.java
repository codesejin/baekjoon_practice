package silver.DFSBFS.유기농배추;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] graph;
    static boolean[][] visited;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int T; // 테스트 케이스 개수
    static int M; // 가로
    static int N; // 세로
    static int K; // 배추가 심어진 개수

    public static void main(String[] args) throws IOException {
        // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        T = Integer.parseInt(br.readLine());

        // 1. 테스트 케이스 개수만큼 반복
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            M = Integer.parseInt(st.nextToken()); // 행
            N = Integer.parseInt(st.nextToken()); // 열
            K = Integer.parseInt(st.nextToken());

            graph = new boolean[M + 2][N + 2];
            visited = new boolean[M + 2][N + 2];

            // 2. graph에 연결 정보 채우기
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[x + 1][y + 1] = true;
            }

            // 3. dfs 수행
            int answer = 0;
            for (int i = 1; i <= M; i++) {
                for (int j = 1; j <= N; j++) {
                    if (graph[i][j] && !visited[i][j]) {
                        answer++;
                        dfs(i, j);
                    }
                }
            }
            System.out.println(answer);
        }
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if (graph[newX][newY] && !visited[newX][newY]) {
                dfs(newX, newY);
            }
        }
    }
}
