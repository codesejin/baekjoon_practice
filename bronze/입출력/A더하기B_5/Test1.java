package bronze.입출력.A더하기B_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
    public static void main(String[] args) throws IOException {
        int a, b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine()) != null) {
            a = line.charAt(0) - '0';
            b = line.charAt(2) - '0';
            if (a == 0 && b == 0)
                break;
            System.out.println(a + b);
        }
    }
}
