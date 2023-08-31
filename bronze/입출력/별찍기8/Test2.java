package bronze.입출력.별찍기8;

import java.io.*;
import java.util.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] arr = new char[N + N];
        Arrays.fill(arr, ' ');
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            arr[i] = arr[arr.length - i - 1] = '*';
            sb.append(arr).append('\n');
        }
        for (int i = N - 1; i >= 0; i--) {
            arr[i] = arr[arr.length - i - 1] = ' ';
            sb.append(arr).append('\n');
        }
        System.out.println(sb.toString());
    }
}
