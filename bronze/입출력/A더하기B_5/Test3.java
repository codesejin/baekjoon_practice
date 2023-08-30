package bronze.입출력.A더하기B_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;

        while(flag) {
            String str = br.readLine();
            char ch1 = str.charAt(0);
            char ch2 = str.charAt(2);

            if(ch1 == '0' && ch2 == '0')
                flag = false;
            else
                System.out.println(ch1-'0' + ch2-'0');
        }
    }
}
