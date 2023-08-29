package bronze.입출력.A더하기B_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String tc;

        while ((tc = br.readLine()) != null) {
            int A = tc.charAt(0) - '0';
            int B = tc.charAt(2) - '0';
            sb.append(A + B);
            sb.append("\n");
        }

        System.out.println(sb);
        br.close();

    }
}