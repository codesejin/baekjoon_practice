package silver.DP.쉬운계단수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static final long MOD = 1_000_000_000L;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // N=1 : 1,2,3,4,5,6,7,8,9 -> 9
        // N=2 : 10,12,21,23,32,34,43,45,54,56,65,67,76,78,87,89,98 -> 17
        // N=3 : 101,121,123,210,212,232,234,321,323,343,345,432,434,454,456,543,545,565,567,654,656,676,678,765,767,787,789,876,878,898,987,989 -> 32
        // N=4 : 1010,1012,1210,1212,1232,1234,2101,2121,2123,2321,2323,2343,2345,3210,3212,3232,3234,3432,3434,3454,3456,4321,4323,4343,4345,4543,4545,4565,4567,5432,5434,5454,5456,5654,5656,5676,5678,6543,6545,6565,6567,6765,6767,6787,6789,7654,
        // 7656,7676,7678,7876,7878,7898,8765,8767,8787,8789,8987,8989,9876,9878,9898 -> 60
        long[][] dp = new long[N + 1][10];

        // init
        for(int i=0; i<=9; i++) {
            dp[1][i] = 1L;
        }

        for(int i=2; i<=N; i++) {
            // 0으로 시작하는 수의 개수
            dp[i][0] = dp[i-1][1];
            for(int j=1; j<=9; j++) {
                // 9일경우는 이전 자릿수의 8로 시작하는 수의 개수와 동일하다!
                if(j == 9) dp[i][9] = dp[i-1][8] % MOD;
                    // 나머지 수들은 이전 숫자의 j-1로 시작하는 수의 개수와 j+1로 시작하는 수의 개수를 더한 값이다.
                else dp[i][j] = (dp[i-1][j-1] % MOD + dp[i-1][j+1] % MOD) % MOD;
            }
        }

        long result = 0;
        for(int i=1; i<=9; i++) {
            result = (result + dp[N][i]) % MOD;    // 정답을 더하면서 오버플로우가 발생할 수 있으므로 주의!
        }
        System.out.print(result);
    }
}
