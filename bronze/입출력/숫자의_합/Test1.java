package bronze.입출력.숫자의_합;

import java.util.Scanner;

// 12872kb / 112ms / java8 / 381b
public class Test1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String string = sc.next();
        int ans = 0;
        for (int i = 0; i < num; i++) {
            char c = string.charAt(i);
            ans += c - '0';
        }
        System.out.print(ans);
    }
}
