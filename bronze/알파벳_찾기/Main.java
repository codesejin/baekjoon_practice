package bronze.알파벳_찾기;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main  {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char arr[] = br.readLine().toCharArray();
        int num[] = new int[26];
        for (int i = 0; i < 26; i++) {
            num[i] = -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int loc = arr[i] - 97;
            if (num[loc] == -1) {
                num[loc] = i;
                System.out.println(arr[i] + " = "+loc);

            }
        }
        for (int i = 0; i <  26; i++) {
            System.out.print(num[i] + " ");
        }
    }

}