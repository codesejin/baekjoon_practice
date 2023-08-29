package bronze.주사위_세개;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int ans = 0;

        int max = 0;
        if (max < A) {
            max = A;
        }
        if (max < B) {
            max = B;
        }
        if (max < C) {
            max = C;
        }

//        if ( A == B ) {
//            if ( A == C ) {
//                ans += 10000 + (1000 * A);
//            } else {
//                ans += 1000 + (100 * A);
//            }
//        } else if ( B == C ) {
//            ans += 1000 + (100 * B);
//        } else if (A == C) {
//            ans += (1000 * A);
//        } else {
//            ans += (max * 100);
//        }

        if (A == B && B == C) {
            ans = 10000 + (A * 1000);
        } else if (A == B || A == C) {
            ans = 1000 + (A * 100);
        } else if (B == C) {
            ans = 1000 + (B * 100);
        } else {
            ans = max * 100;
        }

        System.out.println(ans);
    }
}
