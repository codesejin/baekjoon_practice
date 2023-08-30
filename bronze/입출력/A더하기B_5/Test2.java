package bronze.입출력.A더하기B_5;

import java.io.*;
import java.util.StringTokenizer;

public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = 1;
        int B = 1;
        int result = 0;
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            if((A + B) == 0){
                break;
            }
            result = A + B;
            bw.write(result + "\n");
        }
        bw.flush();
    }
}
