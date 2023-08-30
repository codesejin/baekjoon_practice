package bronze.입출력.열_개씩_끊어_출력하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final String NEW_LINE = "\n";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= string.length(); i++) {
            if (i % 10 == 0) {
                sb.append(string.charAt(i-1)).append(NEW_LINE);
            } else {
                sb.append(string.charAt(i-1));
            }
        }
        System.out.print(sb);
        br.close();
    }
}
