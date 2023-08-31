package bronze.입출력.별찍기3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = n+1; i  > 1; i--) {
            for (int j = i-1; j >= 1 ; j--)
                sb.append("*");
            System.out.println(sb);
            sb.delete(0,sb.length());
        }
    }
}
