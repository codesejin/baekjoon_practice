package silver.이진탐색.나무자르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer NM = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(NM.nextToken());
        int M = Integer.parseInt(NM.nextToken());

        StringTokenizer trees = new StringTokenizer(br.readLine(), " ");
        int[] treeArray = new int[N];
        int max = 0; // 최대 높이 초기값 변경

        for (int i = 0; i < N; i++) {
            int tree = Integer.parseInt(trees.nextToken());
            max = Math.max(max, tree);
            treeArray[i] = tree;
        }

        // 이분 탐색을 통해 최적의 높이 찾기
        int left = 0;
        int right = max;
        int result = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            long sum = 0;

            for (int tree : treeArray) {
                if (tree > mid) {
                    sum += tree - mid;
                }
            }

            if (sum >= M) {
                // 높이를 높여 더 많이 얻을 수 있는 경우
                result = mid;
                left = mid + 1;
            } else {
                // 높이를 낮춰야 하는 경우
                right = mid - 1;
            }
        }

        System.out.println(result);
    }
}
