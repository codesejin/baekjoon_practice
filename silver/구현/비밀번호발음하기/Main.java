package silver.구현.비밀번호발음하기;
import java.io.*;

public class Main {
    // 모음 a,e,i,o,u 중 반드시 하나 포함
    // 모음 혹은 자음이 3개 연속으로 오면 안된다
    // 같은 글자가 연속적으로 2번 오면 안되나, ee ,oo는 허용한다
    static String OPEN = "<";
    static String CLOSE = ">";
    static String ACCEPT_MSG = " is acceptable.\n";
    static String NOT_ACCEPT_MSG = " is not acceptable.\n";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String target = "";
        StringBuilder sb;

        while (true) {
            boolean flag = true;
            target = br.readLine();
            if (target.equals("end")) break;
            sb = new StringBuilder().append(OPEN).append(target);
            if (!target.contains("a") && !target.contains("e") && !target.contains("i")
                    && !target.contains("o") && !target.contains("u")) {
                flag = false;
            }

            if (!checkmeoumandzaeum(target)) {
                flag = false;
            }
            if (!flag) {
                sb.append(CLOSE).append(NOT_ACCEPT_MSG);
            } else {
                sb.append(CLOSE).append(ACCEPT_MSG);
            }
            System.out.print(sb);
        }
    }
    // 반복문 내부에서 cnt를 비교했어야 함 -> 왜냐하면 반복문 외부에서 하면 이미 3개 이상이어도 뒤에 문자로 인해 초기화됨
    // 같은 문자 연속 2번오는걸 어떻게판단함? c에 g가 담겨있고, target.charAt( i - 1) -> 이전 문자랑 c랑 같은지!
    // c == target.charAt( i - 1)
    private static boolean checkmeoumandzaeum(String target) {
        int moeumCnt = 0;
        int zaeumCnt = 0;
        for (int i = 0; i < target.length(); i++) {
            char c = target.charAt(i);
            if (c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u') {
                moeumCnt++;
                zaeumCnt = 0;
            } else {
                zaeumCnt++;
                moeumCnt = 0;
            }
            // 2단계 (자음이나 모음이 연속으로 3번오면 안됨)
            if (moeumCnt >= 3 || zaeumCnt >= 3) {
                return false;
            }
            // 3단계 (자음 모음 기준이 아니라 "같은 글자"여야 함 -> 같은 글자가 2연속으로 오면 안되지만, ee와 oo는 예외)
            if (i > 0 && c == target.charAt(i - 1) && c != 'e' && c != 'o') {
                return false;
            }
        }
        return true;
    }


//    private static boolean isVowel(char c) {
//        return "aeiou".indexOf(c) >= 0;
//    }
}

