package silver.이진탐색.숫자카드2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer cards = new StringTokenizer(br.readLine(), " ");

        TreeMap<Integer, Integer> map = new TreeMap<>();
        while (cards.hasMoreTokens()) {
            int cardNum = Integer.parseInt(cards.nextToken());
            map.put(cardNum, map.getOrDefault(cardNum, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer target = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        while (target.hasMoreTokens()) {
            int cardNum = Integer.parseInt(target.nextToken());
            if (map.containsKey(cardNum)) {
                sb.append(map.get(cardNum)).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }
        System.out.println(String.valueOf(sb).trim());
    }
}
