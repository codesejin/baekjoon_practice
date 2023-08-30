package bronze.입출력.기찍N;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final String NEW_LINE = "\n";

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = num; i >= 1; i--) {
            sb.append(i).append(NEW_LINE);
        }
        System.out.println(sb);
    }
}