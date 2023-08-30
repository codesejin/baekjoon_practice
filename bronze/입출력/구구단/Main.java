package bronze.입출력.구구단;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final String NEW_LINE = "\n";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 9 ; i++) {
            int multiply = num * i;
            sb.append(num).append(" * ").append(i)
                    .append(" = ").append(multiply).append(NEW_LINE);
        }
        System.out.println(sb);
    }
}
