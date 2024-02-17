package silver.그리디.모두의마블;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> Llist = new ArrayList<>(N);
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            Llist.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(Llist, Collections.reverseOrder());

        long totalSum = 0;
        for (int i = 1; i < N; i++) {
            totalSum += Llist.get(i) + Llist.get(0);
        }
        System.out.println(totalSum);
    }
}