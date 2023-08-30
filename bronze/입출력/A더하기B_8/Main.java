package bronze.입출력.A더하기B_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 11544kb / 88ms / java8 / 812b 매번 출력하는것보다 한번에 출력하는게 더 좋음(Test1참고)
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = 1;
        StringBuilder sb = new StringBuilder();
        while (count <= num) {
            String line = br.readLine();
            int a = line.charAt(0) - '0';
            int b = line.charAt(2) - '0';
            sb.append("Case #").append(count).append(": ")
                    .append(a).append(" + ").append(b).append(" = ").append(a+b);
            System.out.println(sb);
            count++;
            sb.delete(0, sb.length());
        }
        br.close();
    }
}
