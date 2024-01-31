package silver.이진탐색.좌표압축;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer Xs = new StringTokenizer(br.readLine(), " ");

        int[] coordinates = new int[N];
        for (int i = 0; i < N; i++) {
            coordinates[i] = Integer.parseInt(Xs.nextToken());
        }

        // 중복 제거 후 정렬한 좌표 배열
        int[] uniqueSortedCoordinates = Arrays.stream(coordinates).distinct().sorted().toArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int compressedCoordinate = binarySearch(uniqueSortedCoordinates, coordinates[i]);
            sb.append(compressedCoordinate).append(" ");
        }

        System.out.println(sb.toString().trim());
    }

    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // 여기까지 왔다는 것은 해당 좌표가 배열에서 발견되지 않았다는 것
        return -1;
    }
}

