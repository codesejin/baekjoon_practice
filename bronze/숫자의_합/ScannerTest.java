package bronze.숫자의_합;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int ans = 0;
        String[] split = num.split("");
        for (String numStr : split) {
            ans += Integer.valueOf(numStr);
        }
        long end = System.currentTimeMillis();
        System.out.println(ans);
        System.out.println("Scanner Time: " + (end - start) + " ms");

    }

}