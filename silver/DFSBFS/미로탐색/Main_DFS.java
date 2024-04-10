package silver.DFSBFS.미로탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_DFS {
    static int[][] graph;
    static boolean[][] visited;
    static int[][] distance; // 거리 정보를 저장할 배열
    static int N, M;
    static int[] dx = {-1, 1, 0, 0}; // x방향배열-상하
    static int[] dy = {0, 0, -1, 1}; // y방향배열-좌우

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[N + 1][M + 1];
        visited = new boolean[N + 1][M + 1];
        distance = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            String target = st.nextToken();
            for (int j = 1; j <= M; j++) {
                graph[i][j] = Integer.parseInt(String.valueOf(target.charAt(j - 1)));
            }
        }
        bfs(1, 1);
        System.out.println(distance[N][M]); // 최단거리 출력
    }

    private static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;
        distance[x][y] = 1; // 시작점의 거리는 1

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int nowX = cur[0];
            int nowY = cur[1];
            for (int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];
                if (isValid(nextX, nextY) && !visited[nextX][nextY] && graph[nextX][nextY] == 1) {
                    queue.offer(new int[]{nextX, nextY});
                    visited[nextX][nextY] = true;
                    distance[nextX][nextY] = distance[nowX][nowY] + 1; // 이전 거리에 1을 더한 값
                }
            }
        }
    }

    private static boolean isValid(int x, int y) {
        return x >= 1 && x <= N && y >= 1 && y <= M;
    }
}
