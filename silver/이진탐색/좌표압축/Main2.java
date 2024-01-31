package silver.이진탐색.좌표압축;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer Xs = new StringTokenizer(br.readLine(), " ");

        int[] XArray = new int[N];
        for (int i = 0; i < N; i++) {
            XArray[i] = Integer.parseInt(Xs.nextToken());
        }

        int[] copyArray = removeDuplicatesAndSort(XArray);


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int compressedX = binarySearch(copyArray, XArray[i]);
            sb.append(compressedX).append(" ");
        }

        System.out.println(sb.toString().trim());
    }

    private static int[] removeDuplicatesAndSort(int[] array) {
        Set<Integer> uniqueSet = new TreeSet<>(); // TreeSet을 사용하여 정렬된 Set 생성
        for (int num : array) {
            uniqueSet.add(num);
        }

        // 중복이 제거되고 정렬된 배열 생성
        return uniqueSet.stream().mapToInt(Integer::intValue).toArray();
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

