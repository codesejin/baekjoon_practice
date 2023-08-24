| 백준 링크                                         | 티스토리 링크                                        |
|:----------------------------------------------|:-----------------------------------------------|
| [문제 링크](https://www.acmicpc.net/submit/11720/65421436) | [문제 풀이 링크](https://strong-park.tistory.com/13) |


```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String num = sc.next();
        int ans = 0;
        String[] split = num.split("");
        for (String numStr : split) {
            ans += Integer.valueOf(numStr);
        }
        System.out.println(ans);
    }
}

```

| 메모리     | 시간    | 코드길이 |
|:--------|:------|:-----|
| 17748KB | 208ms | 398B |