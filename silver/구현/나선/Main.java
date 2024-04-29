package silver.구현.나선;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] visited;
    // 달팽이 배열 문제
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //  6
        int M = Integer.parseInt(st.nextToken()); // 4
        visited = new boolean[N][M];
        int total = N * M;
        int cnt = 1;
        int x = 0, y = 0;
        visited[x][y] = true;
        while (true) {
            // 아래로 이동
            while (x + 1 < N && !visited[x + 1][y]) {
                x++;
                visited[x][y] = true;
                cnt++;
            }
            // 오른쪽으로 이동
            while (y + 1 < M && !visited[x][y + 1]) {
                y++;
                visited[x][y] = true;
                cnt++;
            }
            // 위로 이동
            while (x - 1 >= 0 && !visited[x - 1][y]) {
                x--;
                visited[x][y] = true;
                cnt++;
            }
            // 왼쪽으로 이동
            while (y - 1 >= 0 && !visited[x][y - 1]) {
                y--;
                visited[x][y] = true;
                cnt++;
            }
            if (visited[x][y] && cnt == total) {
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(x).append(" ").append(y);
        System.out.println(sb);
    }
}
