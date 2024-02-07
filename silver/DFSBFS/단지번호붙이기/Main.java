package silver.DFSBFS.단지번호붙이기;

import java.io.*;
import java.util.*;

public class Main {
    static boolean[][] graph;
    static boolean[][] visited;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int N; // 지도 크기
    static int count; // 모임 개수
    static int[] aparts = new int[25 * 25]; // 모임에 참여중인 단지 개수 합계

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        aparts[count]++;
        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if (graph[newX][newY] && visited[newX][newY] == false) {
                dfs(newX, newY);
            }

        }
    }

    public static void main(String[] args) throws IOException {
        // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        graph = new boolean[N + 2][N + 2];
        visited = new boolean[N + 2][N + 2];
        // 1. graph에 연결 정보 채우기
        for (int i = 1; i <= N; i++) {
            String line = br.readLine();
            for (int j = 1; j <= N; j++) {
                if (line.charAt(j - 1) == '1') {
                    graph[i][j] = true;
                }
            }
        }

        // 2. 모든 단지 순회하면서 DFS (재귀함수) 호출
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (graph[i][j] && !visited[i][j]) {
                    count++;
                    dfs(i, j);
                }
            }
        }

        Arrays.sort(aparts);
        System.out.println(count);

        for (int i = 0; i < aparts.length; i++) {
            if (aparts[i] != 0) {
                System.out.println(aparts[i]);
            }
        }
    }
}
