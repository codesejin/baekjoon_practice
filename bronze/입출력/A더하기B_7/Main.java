package bronze.입출력.A더하기B_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 12616km / 120ms / java8 / 608b (참고 Test2, StringBuilder 쓰면 더 빠름)
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = 1;
        while (count <= num) {
            String line = br.readLine();
            int a = line.charAt(0) - '0';
            int b = line.charAt(2) - '0';
            System.out.printf("Case #%d: %d\n",count, a+b);
            count++;
        }
        br.close();
    }
}