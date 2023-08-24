package bronze.문자열_반복;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static int repeat;
    private static char[] chArray;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            repeat = Integer.parseInt(st.nextToken()); // 3
            chArray = st.nextToken().toCharArray(); // [A, B, C]
            for (int j = 0; j < chArray.length; j++) {
                for (int k = 0; k < repeat; k++) {
                    bw.write(chArray[j]);
                }
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
