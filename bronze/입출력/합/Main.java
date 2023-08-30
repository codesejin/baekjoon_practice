package bronze.입출력.합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int ans = 0;
        for (int i = 1; i <= num; i++) {
            ans += i;
        }
        System.out.println(ans);
    }
}
