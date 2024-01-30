package silver.이진탐색.숫자카드2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] cardsArray = new int[N];

        StringTokenizer cards = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            cardsArray[i] = Integer.parseInt(cards.nextToken());
        }

        Arrays.sort(cardsArray);

        int M = Integer.parseInt(br.readLine());
        StringTokenizer target = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int targetNum = Integer.parseInt(target.nextToken());
            int leftIndex = lowerBound(cardsArray, targetNum);
            int rightIndex = upperBound(cardsArray, targetNum);
            int count = rightIndex - leftIndex;
            sb.append(count).append(" ");
        }

        System.out.println(sb.toString().trim());
    }

    private static int lowerBound(int[] arr, int targetNum) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < targetNum) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    private static int upperBound(int[] arr, int targetNum) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= targetNum) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
