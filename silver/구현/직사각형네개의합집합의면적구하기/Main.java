package silver.구현.직사각형네개의합집합의면적구하기;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    // 첫번째, 두번째 : 사각형 왼쪽 아래 꼭짓점의 x,y 좌표
    // 세번째, 네번째 : 사각형의 오른쪽 위 꼭짓점의 x,y좌표

    // 직사각형이 차지하는 면적...?
    // 6 + 12 + 12 + 3  -> 겹치는 부분 제외 (7부분) -> 겹치는 부분을 어떻게 구할까?
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loopCnt = 0;
        int[][] arr = new int[101][101];

        int totalArea = 0;
        while (loopCnt < 4) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken()); // 사각형 왼쪽 아래 꼭짓점의 x (가로)
            int second = Integer.parseInt(st.nextToken()); // 사각형 왼쪽 아래 꼭짓점의 y (세로)
            int third = Integer.parseInt(st.nextToken()); // 사각형 오른쪽 위 꼭짓점의 x (가로)
            int fourth = Integer.parseInt(st.nextToken());  // 사각형 오른쪽 위 꼭짓점의 y (세로)

            int width = third - first;
            int hight = fourth - second;
            // 전체 면적 합치기
            totalArea += (width * hight);
            // 겹치는 부분 저장하기
            for (int i = first; i < third; i ++) {
                for (int j = second; j < fourth ; j++) {
                    arr[i][j]++;
                }
            }
            loopCnt++;
        }

        int duplicated = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 1) {
                    duplicated += arr[i][j] - 1;
                }
            }
        }
        System.out.println(totalArea - duplicated);
    }
}
