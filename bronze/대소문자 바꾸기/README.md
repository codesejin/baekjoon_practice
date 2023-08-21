| 백준 링크                                         | 티스토리 링크                                       |
|:----------------------------------------------|:----------------------------------------------|
| [문제 링크](https://www.acmicpc.net/problem/2744) | [문제 풀이 링크](https://strong-park.tistory.com/6) |

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            // 대문자의 아스키코드 값
            // 피드백 : 아스키 코드를 외우는 것보다 '문자'로 비교하는게 코드상으로 직관적이라 좋다
            if (a.charAt(i) >= 65 && a.charAt(i) <= 90) {
                answer.append(String.valueOf(a.charAt(i)).toLowerCase());
            // 소문자의 아스키 코드 값
            } else if (a.charAt(i) >= 97 && a.charAt(i) <= 122) {
                answer.append(String.valueOf(a.charAt(i)).toUpperCase());
            }
        }
        System.out.println(answer);
    }
}
```

| 메모리     | 시간    | 코드길이 |
|:--------|:------|:-----|
| 17580KB | 200ms | 619B  |