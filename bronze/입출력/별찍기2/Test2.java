package bronze.입출력.별찍기2;

import java.util.Scanner;
// do-while문
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        String str = "";
        int i = 0;
        do {
            int j = n - 1;
            while (j > i) {
                System.out.print(" ");
                j--;
            }
            str += "*";
            System.out.println(str);
            i++;
        } while (i < n);
    }
}
