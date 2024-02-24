package silver.백트래킹.N과M2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int N, M;
    public static int[] arr;
    public static boolean[] visited;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        visited = new boolean[N];
        dfs(1, 0);
        System.out.println(sb);

    }

    public static void dfs(int start, int depth) {

        if (depth == M) {
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = start; i <= N; i++) {
            if (!visited[i - 1]) {
                visited[i - 1] = true;
                // 결과 배열에 숫자 저장
                arr[depth] = i;
                // 재귀 호출하여 다음 자릿수의 숫자 선택
                dfs( i + 1, depth + 1);
                // 사용한 자릿수를 다시 해제
                visited[i - 1] = false;
            }
        }
    }
}
