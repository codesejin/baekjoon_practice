package bronze.입출력.A더하기B_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 11524kb / 84ms / java8 / 743b
public class Test2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = 1;
        StringBuilder sb = new StringBuilder();
        while (count <= num) {
            String line = br.readLine();
            int a = line.charAt(0) - '0';
            int b = line.charAt(2) - '0';
            sb.append("Case #").append(count).append(": ").append(a + b);
            System.out.println(sb);
            count++;
            sb.delete(0, sb.length());
        }
        br.close();
    }
}
