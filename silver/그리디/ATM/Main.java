package silver.그리디.ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] PArray = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int P = Integer.parseInt(st.nextToken());
            PArray[i] = P;
        }
        Arrays.sort(PArray);
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += PArray[i] * (N - i);
        }
        System.out.println(sum);
    }
}
