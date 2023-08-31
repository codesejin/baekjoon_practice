package bronze.입출력.별찍기8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {
    static BufferedReader br;

    public static void main(String args[]) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j < i - 1; j++) {
                sb.append('*');
            }
            for (int j = 0; j < 2 * N - ((i - 1) * 2); j++) {
                sb.append(' ');
            }
            for (int j = 0; j < i - 1; j++) {
                sb.append('*');
            }
            sb.append('\n');
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i; j++) {
                sb.append('*');
            }
            for (int j = 0; j < i * 2; j++) {
                sb.append(' ');
            }
            for (int j = 0; j < N - i; j++) {
                sb.append('*');
            }
            sb.append('\n');

        }

        System.out.print(sb);
    }
}