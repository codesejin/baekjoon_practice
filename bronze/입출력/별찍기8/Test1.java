package bronze.입출력.별찍기8;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stars = new StringBuilder();
        int n = new Integer(br.readLine()), abs = 0;
        for (int i = 1; i < 2 * n; i++) {
            abs = n - i > 0 ? n - i : i - n;
            for (int j = 0; j < 2 * n; j++) {
                if (j < n - abs || 2 * n - 1 - (n - abs) < j) {
                    stars.append('*');
                    continue;
                }
                stars.append(' ');
            }
            stars.append('\n');
        }
        System.out.print(stars);
    }
}