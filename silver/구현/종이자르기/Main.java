package silver.구현.종이자르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class Main {
    // 가로 점선을 따라 자르는 경우 : 종이 왼쪽끝에서 오른쪽 끝까지 한번에 자른다. 쭈욱~
    // -> 0과 점선 번호 주어짐
    // 세로 점선인 경우 : 위쪽 끝에서 아래쪽 끝까지 한번에 자른다.
    // -> 1과 점선 번호 주어짐

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int garo = Integer.parseInt(st.nextToken()); // 10 -> 열
        int sero = Integer.parseInt(st.nextToken()); // 8 -> 행
        int cnt = Integer.parseInt(br.readLine()); // 3

        int[][] arr = new int[sero][garo];



        while (cnt > 0) {
            st = new StringTokenizer(br.readLine());
            int line = Integer.parseInt(st.nextToken()); // 가로인지 세로인지
            int number = Integer.parseInt(st.nextToken()); // 점선번호
            if (line == 0) { // 가로일 경우 + 7 0->1
                for (int i = number; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        arr[i][j] += 7;
                    }
                }
            } else { // 세로 일 경우 + 100 - 3
                for (int i = number; i < arr[0].length; i++) {
                    for (int j = 0; j < arr.length; j++) {
                        arr[j][i] += 100;
                    }
                }
            }
            cnt--;
        }
        // 각 숫자별 총합의 최대값 구하기
        Map<Integer, Integer> map = new HashMap<>(); // 넘버링, 총합
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                map.put(arr[i][j], map.getOrDefault(arr[i][j],0)+1);
            }
        }
        int max = Collections.max(map.values());
        System.out.println(max);
    }

}