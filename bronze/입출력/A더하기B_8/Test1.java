package bronze.입출력.A더하기B_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 11452kb / 80ms / java8 / 846b static변수를 사용하는게 메모리가 덜 차지함
public class Test1 {
    public static final String NEW_LINE = "\n";
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
                    .append(a).append(" + ").append(b).append(" = ").append(a+b).append(NEW_LINE);
            count++;
        }
        System.out.println(sb.toString());
        br.close();
    }
}
