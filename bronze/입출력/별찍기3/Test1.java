package bronze.입출력.별찍기3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test1 {
    public static void main(String[] args)throws Exception{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String line = bfr.readLine();
        int N = Integer.parseInt(line);

        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i< N;i++){
            for (int j = i; j < N; j++){
                strBuilder.append("*");
            }
            strBuilder.append("\n");
        }
        System.out.print(strBuilder);
    }
}
