package silver.요세푸스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static final String COMMA = ", ";
    private static final String LEFT = "<";
    private static final String RIGHT = ">";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int total = Integer.parseInt(st.nextToken());
        int remove = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder().append(LEFT);

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= total; i++) {
            queue.offer(i);
        }

        int count = 0;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            count++;

            if (count == remove) {
                sb.append(current).append(COMMA);
                count = 0;
            } else {
                queue.offer(current);
            }
        }

        sb.setLength(sb.length() - 2);
        sb.append(RIGHT);
        System.out.println(sb);
    }
}