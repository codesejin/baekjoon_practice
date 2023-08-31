package bronze.입출력.별찍기3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test2 {
    private static final String NEW_LINE = "\n";
    private static final char STAR = '*';

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            for (int j = N - 1; j >= i; j--) {
                sb.append(STAR);
            }
            sb.append(NEW_LINE);
        }

        System.out.println(sb.toString());
    }
}
