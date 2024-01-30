package silver.프린터_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int totalDoc = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());
            List<Integer> priorities = new ArrayList<>();
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < totalDoc; j++) {
                int priority = Integer.parseInt(st.nextToken());
                priorities.add(priority);
            }

            int result = solvePrintQueue(totalDoc, target, priorities);
            System.out.println(result);
        }
    }

    static class Print {
        private int priority;
        private boolean isTarget;

        public Print(int priority, boolean isTarget) {
            this.priority = priority;
            this.isTarget = isTarget;
        }
    }

    static int solvePrintQueue(int totalDoc, int target, List<Integer> priorities) {
        Queue<Print> queue = new LinkedList<>();

        for (int i = 0; i < totalDoc; i++) {
            boolean isTarget = (i == target);
            queue.add(new Print(priorities.get(i), isTarget));
        }

        int count = 0;
        while (!queue.isEmpty()) {
            Print front = queue.poll();
            boolean canPrint = true;

            for (Print p : queue) {
                if (p.priority > front.priority) {
                    canPrint = false;
                    break;
                }
            }

            if (canPrint) {
                count++;
                if (front.isTarget) {
                    break;
                }
            } else {
                queue.offer(front);
            }
        }

        return count;
    }
}
