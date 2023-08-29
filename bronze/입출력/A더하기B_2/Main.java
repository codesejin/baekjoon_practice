package bronze.입출력.A더하기B_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2558번
// 11508kb / 76ms / java8 / 482b
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;

        int i = 1;
        while (i <= 2) {
            String string = br.readLine();
            ans += Integer.parseInt(string);
            i ++;
        }
        System.out.println(ans);
    }
}
