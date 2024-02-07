package silver.스택큐.요세푸스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main2 {
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
        int count = 0;
        for (int i = 1; i <= total; i++) {
            queue.offer(i);
        }
        while (!queue.isEmpty()) {
            int front = queue.poll();
            count++;
            if (count == remove) {
                sb.append(front).append(COMMA);
                count = 0;
                if (queue.size() == 1) break;
            } else {
                queue.offer(front);
            }
        }
        // 남은 데이터 처리
        System.out.println(sb.append(queue.poll()).append(RIGHT));
    }
}
