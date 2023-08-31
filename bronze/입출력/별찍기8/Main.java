package bronze.입출력.별찍기8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = n-1; i >= 0; i--) {
            for (int j = i; j <= n-1; j++) {
                sb.append("*");
            }
            for (int k = i*2; k >= 1; k--) {
                sb.append(" ");
            }
            for (int j = i; j <= n-1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        int tmp = 1;
        for (int i = n-1; i >= 0; i--) {
            for (int j = i; j > 0; j--) {
                sb.append("*");
            }
            for (int k = 1; k <= tmp*2; k++) {
                sb.append(" ");

            }
            tmp++;
            for (int j = i; j > 0; j--) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
