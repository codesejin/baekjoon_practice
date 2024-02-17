package silver.그리디.동전0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 동전 종류
        int K = Integer.parseInt(st.nextToken()); // 가치의 합
        Set<Integer> coin = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            coin.add(Integer.parseInt(br.readLine()));
        }
        int cnt = 0;
        for (int coinValue : coin) {
            if (K / coinValue > 0) {
                cnt += K / coinValue;
                K %= coinValue;
            }
        }
        System.out.println(cnt);
    }
}
