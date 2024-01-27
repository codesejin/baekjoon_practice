package bronze.단어_뒤집기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            StringBuilder word = new StringBuilder();
            StringBuilder sb = new StringBuilder();
            while (st.hasMoreTokens()) {
                word.append(st.nextToken()).reverse();
                sb.append(word).append(" ");
                word.delete(0,word.length());
            }
            System.out.println(sb);
        }
    }
}
