package gold.암호만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int N, C;
    public static char[] arr;
    public static char[] result;
    public static boolean[] visited;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken()); // 암호의 사이즈
        C = Integer.parseInt(st.nextToken()); // C개의 문자들

        arr = new char[C];
        result = new char[N];
        visited = new boolean[C];

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < C; i++) {
            arr[i] = st.nextToken().charAt(0);
        }

        Arrays.sort(arr);
        dfs(0, 0);
        System.out.println(sb);
    }

    private static void dfs(int index, int depth) {

        if (N == depth) {
            if (isValid()) {
                System.out.println(result);
            }
            return;
        }


        for (int i = index; i < C; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[depth] = arr[i];
                dfs(i, depth + 1);
                visited[i] = false;
            }
        }

    }

    // 최소 모음 1개, 최소 자음 2개인지 확인
    public static boolean isValid() {
        int mo = 0;
        int ja = 0;

        for (char x : result) {
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                mo++;
            } else {
                ja++;
            }
        }

        if (mo >= 1 && ja >= 2) {
            return true;
        }
        return false;
    }
}

