package bronze.입출력.숫자의_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 11520kb / 80ms / java8 / 547b
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String string = br.readLine();
        int ans = 0;
        for (int i = 0; i < num; i++) {
            char c = string.charAt(i);
            ans += c - '0';
        }
        System.out.print(ans);
        br.close();
    }
}
