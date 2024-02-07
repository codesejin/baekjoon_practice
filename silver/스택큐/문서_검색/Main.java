package silver.스택큐.문서_검색;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String word = sc.nextLine();
        // doc내부에서 word가 등장하면 전부 없애라
        String replaced = doc.replace(word, "");
        // 남아있는 길이
        int length = doc.length() - replaced.length();
        // 워드의 길이로 남아있는 길이를 나누면 , 사라진 길이에서 word가 몇번 등장했는지 알 수 있다
        // length는 word의 배수만큼 사라졌기 때문에 count는 항상 정수로 나올것이다
        int count = length / word.length();
        System.out.println("count = " + count);
    }
}
