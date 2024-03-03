package silver.DP.일이삼더하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // 테이블 정의하기
    static int dp[] = new int [11];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        //초기 값 초기화
        dp[1] =1; // n=1일때 1 -> 한 가지
        dp[2]=2; // n=2일때 1+1, 2  -> 두 가지
        dp[3]=4; // n=3일때 1+1+1, 1+2, 2+1, 3 -> 4 가지

        for(int j=4;j<=10;j++) { // 4부터 반복
            dp[j] = dp[j-3] + dp[j-2] + dp[j-1]; // 점화식
        }

        for(int i=0;i<N;i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(dp[n]);
        }
    }
}
