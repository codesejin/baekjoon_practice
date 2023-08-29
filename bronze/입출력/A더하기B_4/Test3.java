package bronze.입출력.A더하기B_4;

import java.util.Scanner;
public class Test3 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {

            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);

        }
        in.close();
    }
}

