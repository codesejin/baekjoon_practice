package silver.구현.돌려돌려돌림판;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 내가 푼 풀이
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int testcaseCnt = Integer.parseInt(br.readLine());

       int N = 0, M = 0;
        List<Integer> list = new ArrayList<>();
        while (testcaseCnt --> 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            N =  Integer.parseInt(st.nextToken()); // N등분할 정수
            M =  Integer.parseInt(st.nextToken()); // 연속된 자리수
            st = new StringTokenizer(br.readLine());
            int X =  getNumber(st);

            st = new StringTokenizer(br.readLine());
            int Y = getNumber(st);

            st = new StringTokenizer(br.readLine());
            int[] swingPlate = createSwingPlate(N, M, st);

            int matchingCnt = 0;
            int left = 0, right = left + M - 1;
            while (left < swingPlate.length - M + 1) {
                int wantToCompareNumber = 0;
                for (int i = left; i <= right ; i++) {
                    wantToCompareNumber = (wantToCompareNumber * 10) + swingPlate[i];
                }
                if (X <= wantToCompareNumber && wantToCompareNumber <= Y) {
                    matchingCnt++;
                }
                left++;
                right = left + M - 1;
            }
            list.add(matchingCnt);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static int getNumber(StringTokenizer st) {
        int number = 0;
        while (st.hasMoreTokens()) {
            number = (number * 10) + Integer.parseInt(st.nextToken());
        }
        return number;
    }

    private static int[] createSwingPlate(int N, int M, StringTokenizer st) {
        int[] arr = new int[N + M - 1];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if(st.hasMoreTokens()) {
                arr[i] = Integer.parseInt(st.nextToken());
            } else {
                arr[i] = arr[idx++];
            }
        }
        return arr;
    }
}
