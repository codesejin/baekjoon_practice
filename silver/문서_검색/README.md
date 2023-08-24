| 백준 링크                                         | 티스토리 링크                                        |
|:----------------------------------------------|:-----------------------------------------------|
| [문제 링크](https://www.acmicpc.net/problem/1543) | [문제 풀이 링크](https://strong-park.tistory.com/14) |


```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nextLine()은 띄어쓰기를 포함한 문자열 받음
        String str = sc.nextLine();
        String target = sc.nextLine();
        int count = 0;
        // str의 내용에 target을 더이상 자를 수 없을 때까지 잘라서 개수 반환
        while(str.length() >= target.length()) {
            if (str.contains(target)) {
                // 마지막 인덱스 = str중에서 target가 처음 등장하는 인덱스 + 끝나는 곳
                int endIdx = str.indexOf(target) + target.length();
                str = str.substring(endIdx);
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
```


| 메모리     | 시간    | 코드길이 |
|:--------|:------|:-----|
| 17648KB | 244ms | 729B |