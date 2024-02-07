package silver.스택큐.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String instruction = st.nextToken();
            switch (instruction) {
                case "push" :
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    if (!stack.empty()) System.out.println(stack.pop());
                    else System.out.println(-1);
                    break;
                case "size" :
                    System.out.println(stack.size());
                    break;
                case "empty" :
                    boolean flag = stack.empty();
                    System.out.println((flag) ? 1 : 0);
                    break;
                case "top" :
                    if (!stack.empty()) System.out.println(stack.peek());
                    else System.out.println(-1);
                    break;
            }
        }
    }
}
