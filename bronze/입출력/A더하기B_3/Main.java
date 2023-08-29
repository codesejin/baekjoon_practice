package bronze.입출력.A더하기B_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int i = 1;
        while (i <= num) {
            String input = br.readLine();
            StringTokenizer stringTokenizer = new StringTokenizer(input);
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(a+b);
            i ++;
        }
    }
}
