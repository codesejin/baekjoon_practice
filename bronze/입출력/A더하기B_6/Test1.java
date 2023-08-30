package bronze.입출력.A더하기B_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Test1 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = 1;
        while (count <= num) {
            String line = br.readLine();
            String[] split = line.split(",");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            System.out.println(a + b);
            count++;
        }
        br.close();
    }
}

