package silver.구현.돌려돌려돌림판;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 팀원이 푼 풀이
public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];
            String[] inputX = br.readLine().split(" ");
            String[] inputY = br.readLine().split(" ");
            int x = convertToNumber(inputX);
            int y = convertToNumber(inputY);

//            System.out.printf("T=%d, x=%d, y=%d\n", T, x, y);
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(arr[i]);
                for (int j = 1; j < M; j++) {
                    int idx = (i + j) % N;
                    sb.append(arr[idx]);
                }
                int z = Integer.parseInt(sb.toString());
                if (x <= z && z <= y) {
                    cnt++;
                }
            }

            result.append(cnt).append("\n");
        }
        br.close();
        result.deleteCharAt(result.length() - 1);
        System.out.println(result);
    }

    private static int convertToNumber(String[] input) {
        int number = 0;
        for (String s : input) {
            number = number * 10 + Integer.parseInt(s);
        }
        return number;
    }
}
