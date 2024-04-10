package silver.DFSBFS.단지번호붙이기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test {
    static int[][] graph;
    static boolean[][] visited;
    static int N, totalCnt = 0;
    static int[] dx = {-1, 1, 0, 0}; // 상하
    static int[] dy = {0, 0, -1, 1}; // 좌우

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        graph = new int[N + 1][N + 1];
        visited = new boolean[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            String string = br.readLine();
            for (int j = 1; j <= N; j++) {
                int dangi = Integer.parseInt(String.valueOf(string.charAt(j - 1)));
                graph[i][j] = dangi;
            }
        }
        List<Integer> answerList = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (!visited[i][j] && graph[i][j] == 1) {
                    totalCnt = 0;
                    int cnt = dfs(i, j);
                    if (cnt != 0) {
                        answerList.add(cnt);
                    }
                }
            }
        }
        System.out.println(answerList.size());
        answerList.stream().sorted().forEach(System.out::println);
    }

    private static int dfs(int i, int j) {
        visited[i][j] = true;
        totalCnt++; // 단지내 집의 개수 증가
        for (int k = 0; k < 4; k++) {
            int nextX = i + dx[k];
            int nextY = j + dy[k];
            if (validateIndex(nextX, nextY) && !visited[nextX][nextY] && graph[nextX][nextY] == 1) {
                dfs(nextX, nextY);
            }
        }
        return totalCnt;
    }

    private static boolean validateIndex(int x, int y) {
        return x >= 1 && x <= N && y >= 1 && y <= N;
    }
}
