package bronze.상수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = 0;
        for (int i = 0; i < 2; i++) {
            String s = st.nextToken();
            int temp = Integer.parseInt(String.valueOf(
                    (s.charAt(2) - '0') * 100 + (s.charAt(1) - '0') * 10 + (s.charAt(0) -'0')));
            if (max < temp)
                max = temp;
        }
        System.out.println("max = " + max);
    }
}