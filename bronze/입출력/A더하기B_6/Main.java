package bronze.입출력.A더하기B_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = 1;
        while (count <= num) {
            String line = br.readLine();
            int a = line.charAt(0) - '0';
            int b = line.charAt(2) - '0';
            System.out.println(a + b);
            count++;
        }
        br.close();
    }
}
