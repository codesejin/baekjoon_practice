package bronze.다이얼;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charArray = br.readLine().toCharArray();
        int ans = 0;
        for (char character : charArray) {
            if ( character >= 'A' && character <= 'C') {
                ans += 3;
            } else if ( character >= 'D' && character <= 'F') {
                ans += 4;
            } else if ( character >= 'G' && character <= 'I') {
                ans += 5;
            } else if ( character >= 'J' && character <= 'L') {
                    ans += 6;
            } else if ( character >= 'M' && character <= 'O') {
                ans += 7;
            } else if ( character >= 'P' && character <= 'S') {
                ans += 8;
            } else if ( character >= 'T' && character <= 'V') {
                ans += 9;
            } else if ( character >= 'W' && character <= 'Z') {
                ans += 10;
            }
        }
        System.out.println("ans = " + ans);


    }
}
