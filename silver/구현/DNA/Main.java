package silver.구현.DNA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // DNA 수
        int M = Integer.parseInt(st.nextToken()); // 문자열의 길
        Character[][] arr = new Character[N][M];

        for (int i = 0; i < N; i++) { // 행
            String line = br.readLine();
            for (int j = 0; j < M; j++) { // 열
                arr[i][j] = line.charAt(j);
            }
        }
        TreeMap<Character, Integer> map;
        List<Map<Character, Integer>> maplist = new ArrayList<>();
        for (int i = 0; i < M; i++) { // 열 -> 8
            map = new TreeMap<>();
            for (int j = 0; j < N; j++) { // 행 -> 5
                char cur = arr[j][i];
                map.put(cur, map.getOrDefault(arr[j][i], 0) + 1);
            }
            maplist.add(map);
        }

        int cnt = 0; // 2번째 출력될 것
        StringBuilder sb= new StringBuilder();

        for (int i = 0; i < maplist.size(); i++) {
            Map<Character, Integer> cur = maplist.get(i);
            int max = Integer.MIN_VALUE;
            char target = '?';
            for (Map.Entry<Character, Integer> entry : cur.entrySet()) {
                char key = entry.getKey();
                int value = entry.getValue();
                if (max < value) {
                    max = value;
                    target = key;
                }
            }
            sb.append(target);
            cnt += N - max;
        }
        System.out.println(sb);
        System.out.println(cnt);

    }
}
