package silver.구현.지뢰찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    // 지뢰찾기 map = N*N 정사각형
    // 빈칸에는 default 0, 지뢰가 있는 곳은 숫자
    // 한 칸에 여러개(1~9)의 지뢰가 있다
    // 특정 칸에 적혀있는 숫자는 그 칸과 인접해있는 여덟개의 칸들에 들어있는 지뢰의 총 개수가 된다,
    // 인접한다 =  상하좌우대각선
    // 8개 칸들에 대한 지뢰의 총개수 = map의 특정 칸의 숫자
    // 8방 탐색
    static int[] dx = {-1, 1, 0, 0,-1, 1, -1, 1}; // 1,2 일 경우 -> (0, 0)
    static int[] dy = {0, 0, -1, 1, -1, -1, 1, 1};
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =  Integer.parseInt(br.readLine());

        arr = new int[N+2][N+2];
        int idx = 1;
        while (N --> 0) {
            String line = br.readLine();
            System.out.println(line);
            for (int i = 0; i < line.length(); i++) {
                char cur = line.charAt(i);
                if (Character.isDigit(cur)){
                    arr[idx][i+1] = cur - '0';
                }
            }
            idx++;
        }
     //   System.out.println(Arrays.deepToString(arr));
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr[i].length -1; j++) {
                int cur = arr[i][j];
                if (cur > 0) {
                    sb.append("*");
                } else {
                    int sum = eightDirectionSearch(i, j);
                    if (sum >= 10) {
                        sb.append("M");
                    } else {
                        sb.append(eightDirectionSearch(i, j));
                    }
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private static int eightDirectionSearch(int x, int y) {
        int sum = 0;
      //  System.out.printf("현재 x : %d, y : %d \n", x, y);
        for (int k = 0; k < 8; k++) {
            // cur가 1,1이라고 가정
            int newX = x + dx[k];
            int newY = y + dy[k];
            //System.out.printf(" >> newX : %d, newY : %d \n", newX, newY);
            if (newX < arr.length  && newY < arr.length) {
                int search = arr[newX][newY]; // (0,1)이 되어야함
              //  System.out.println("arr[newX][newY] : " + search);
                sum += search;
            }
        }
      //  System.out.println("sum : " + sum);
        return sum;
    }

}
