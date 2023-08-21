
| 백준 링크                                         | 티스토리 링크                                      |
|:----------------------------------------------|:---------------------------------------------|
| [문제 링크](https://www.acmicpc.net/problem/1919) | [문제 풀이 링크](https://strong-park.tistory.com/7) |


```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int[] charCount = new int[26]; // 알파벳 개수만큼 배열 생성

        for (char c : a.toCharArray()) {
            charCount[c - 'a']++; // 문자 등장 횟수 카운트
        }

        for (char c : b.toCharArray()) {
            charCount[c - 'a']--; // 문자 등장 횟수 감소
        }

        int answer = 0;
        for (int count : charCount) {
            answer += Math.abs(count); // 문자열 간 차이의 합 구하기
        }

        System.out.println(answer);
    }
}
```


| 메모리     | 시간    | 코드길이 |
|:--------|:------|:-----|
| 17556KB | 200ms | 711B |