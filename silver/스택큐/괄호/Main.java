package silver.스택큐.괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    private static final String YES = "YES";
    private static final String NO = "NO";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < num; i++) {
            String string = br.readLine();
            for (int j = 0; j < string.length(); j++) {
                char c = string.charAt(j);
                if (c == '(') stack.push(c);
                else {
                    if (!stack.empty() && stack.peek() == '(') stack.pop();
                    else stack.push(c);
                }
            }
            if (!stack.empty()) {
                System.out.println(NO);
                stack.clear();
            } else {
                System.out.println(YES);
                stack.clear();
            }
        }
    }
}
