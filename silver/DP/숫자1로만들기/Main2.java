package silver.DP.숫자1로만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        // 테이블 정하기
        int dp[] = new int[number + 1];
        // 초기값 설정하기
        dp[0] = 0;
        dp[1] = 0;
        // 점화식
        for (int i = 2; i <= number; i++) {
            dp[i] = dp[i - 1] + 1; // i를 1로 만드는 횟수는 i-1을 1로 만드는 횟수 + 1
            if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1); // 2로 나누어 떨어지면 2로 나눈 결과의 최소 횟수와 비교
            if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1); // 3으로 나누어 떨어지면 3으로 나눈 결과의 최소 횟수와 비교
        }
        System.out.println(dp[number]);
        br.close();

    }
}
