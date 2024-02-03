package silver.이진탐색.수찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.util.Arrays.binarySearch;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer Ns = new StringTokenizer(br.readLine(), " ");
        int[] Narray = new int[N];
        for (int i = 0; i < N; i++) {
            Narray[i] = Integer.parseInt(Ns.nextToken());
        }
        Arrays.sort(Narray);

        int M = Integer.parseInt(br.readLine());

        Ns = new StringTokenizer(br.readLine(), " ");
        int[] Marray = new int[M];
        for (int i = 0; i < M; i++) {
            Marray[i] = Integer.parseInt(Ns.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int result = binarySearch(Narray, Marray[i]);
            if (result < 0) sb.append(0).append("\n");
            else sb.append(1).append("\n");
        }
        System.out.println(sb.toString());
    }
}