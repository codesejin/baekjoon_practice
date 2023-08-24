package bronze.문자열;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine()); // Use nextLine() to read the entire line

        for (int i = 0; i < num; i++) {
            String str = sc.nextLine(); // Read the entire line
            System.out.println(str.charAt(0) + "" +  str.charAt(str.length()-1));
        }
    }
}
