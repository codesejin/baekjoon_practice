package bronze.그대로_출력하기;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while(true) {
            String str = br.readLine();
            if (str == null || str.isEmpty()) {
                break;
            }
            sb.append(str).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
}
