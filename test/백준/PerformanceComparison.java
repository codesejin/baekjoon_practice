package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PerformanceComparison {
    public static void main(String[] args) throws IOException {
        int n = 1000000; // 입력 크기

        // BufferedReader
        long start = System.currentTimeMillis();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().split(" ");
        int sumBufferedReader = 0;
        for (String num : numbers) {
            sumBufferedReader += Integer.parseInt(num);
        }
        long end = System.currentTimeMillis();
        System.out.println("BufferedReader Time: " + (end - start) + " ms");

        // Reset the input
        br = new BufferedReader(new InputStreamReader(System.in));

        // Scanner
        start = System.currentTimeMillis();
        Scanner scanner = new Scanner(br.readLine());
        int sumScanner = 0;
        for (int i = 0; i < n; i++) {
            sumScanner += scanner.nextInt();
        }
        end = System.currentTimeMillis();
        System.out.println("Scanner Time: " + (end - start) + " ms");
    }
}
