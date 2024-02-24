package silver.백트래킹.부분수열의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int N, S;
    public static int count = 0;
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        dfs(0,0);
        System.out.println(S == 0 ? count - 1 : count);
    }

    private static void dfs(int index, int sum) {
        if (index ==N) {
            if (sum == S) {
                count++;
        }
            return;
    }
        dfs(index + 1, sum + arr[index]);
        dfs(index + 1, sum);
    }
}
