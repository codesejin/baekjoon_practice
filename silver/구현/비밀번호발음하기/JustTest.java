package silver.구현.비밀번호발음하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JustTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String pwd = br.readLine();
            if (pwd.equals("end")) break;
            if (isAcceptable(pwd)) {
                sb.append("<").append(pwd).append(">").append(" is acceptable.");
            } else {
                sb.append("<").append(pwd).append(">").append(" is not acceptable.");
            }
            sb.append("\n");
        }
        br.close();
        System.out.println(sb);
    }
    private static boolean isAcceptable(String str) {
        boolean hasVowel = false;
        char prev = ' ';
        int continueousSameType = 1;
        int continueousSameChar = 1;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // 1번 + 2번
            if (isVowel(c)) {
                hasVowel = true;
                if (i > 0 && isVowel(prev)) {
                    continueousSameType++;
                } else {
                    continueousSameType = 1;
                }
            } else {
                if (i > 0 && !isVowel(prev)) {
                    continueousSameType++;
                } else {
                    continueousSameType = 1;
                }
            }
            // 3번
            if (i > 0 && c == prev) {
                if (c == 'e' || c == 'o') {
                    continueousSameChar = 1;
                } else {
                    continueousSameChar++;
                }
            } else {
                continueousSameChar = 1;
            }
            // fail
            if (continueousSameType >= 3 || continueousSameChar >= 2) {
                return false;
            }
            prev = c;
        }
        return hasVowel;
    }
    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) >= 0;
    }
}