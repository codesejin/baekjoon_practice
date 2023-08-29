package bronze.입출력.A더하기B_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 12884kb / 68ms / java8 / 380b
public class Test1 {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        System.out.print(A + B);
    }

}
