package bronze.입출력.별찍기9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 재확인
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        char[] arr = new char[N + N - 1];
        Arrays.fill(arr, '*');
        sb.append(arr).append('\n');
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ' ';
            arr[arr.length - i - 1] = ' ';
            sb.append(arr).append('\n');
        }

        for (int i = arr.length-1; i > 0; i--) {
                arr[i / 2] = '*';
                sb.append(arr).append('\n');

        }

        System.out.println(sb);
    }
}
