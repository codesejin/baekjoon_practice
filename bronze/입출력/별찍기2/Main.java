package bronze.입출력.별찍기2;

import java.util.Scanner;

// for (string에 별 누적하기)
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String str = "";
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--)
                System.out.print(" ");
            str += "*";
            System.out.println(str);
        }
    }
}