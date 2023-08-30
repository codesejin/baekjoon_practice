package bronze.입출력.숫자의_합;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] string = br.readLine().split("");
        int ans = 0;
        for (int i = 0; i < num; i++) {
            ans += Integer.valueOf(string[i]);
        }
        System.out.print(ans);
        br.close();
    }
}
