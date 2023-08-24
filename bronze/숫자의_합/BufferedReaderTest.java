package bronze.숫자의_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] numbers = br.readLine().toCharArray();
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += Integer.parseInt(String.valueOf(numbers[i]));
        }
        long end = System.currentTimeMillis();
        System.out.println(total);
        System.out.println("BufferedReader Time: " + (end - start) + " ms");
    }
}