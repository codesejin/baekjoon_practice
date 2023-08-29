package bronze.입출력.A더하기B_1;

import java.io.*;
import java.util.StringTokenizer;

// 1000번 A+B
// 11524kb / 76ms /	Java 8 / 569b
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;

        String string = br.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(string);
        int i = 1;
        while (i <= 2) {
            String string1 = stringTokenizer.nextToken();
            ans += Integer.parseInt(string1);
            i ++;
        }
        System.out.println(ans);
    }
}
