package silver.누적합.GenericQueries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    // XOR : 같으면 0, 다르면 1
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // N : 수의 개수, M : 쿼리의 개수
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        // 1. 누적 XOR 배열 만들기
        st = new StringTokenizer(br.readLine());
        int[] arr =new int[N+1];
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken()) ^ arr[i-1];
        }
        // 2. M번의 [s:e] 질문에 대해 누적 XOR 배열을 사용해 구간 XOR을 구한다.
        int answer = 0;
        while (M --> 0) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            answer ^= arr[end] ^ arr[start - 1];
        }
        System.out.print(answer);
    }
}
