package bronze.입출력.별찍기2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 공백과 별표시 for문 따로 돌리기
public class Test4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuffer result = new StringBuffer();

        for(int i = 1; i <= n; i++) {

            for(int k = 0; k < n - i; k++) {
                result.append(" ");
            }

            for(int j = 0; j < i; j++) {
                result.append("*");
            }
            result.append("\n");
        }

        System.out.println(result);
    }
}