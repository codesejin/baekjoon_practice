
| 백준 링크                                         | 티스토리 링크 |
|:----------------------------------------------|:-------|
| [문제 링크](https://www.acmicpc.net/problem/10809) |        |


```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int[] count = new int[26];
        for (int i = 0; i < 26; i++) {
            count[i] = -1;
            for (int j = 0; j < str.length(); j++) {
                if ('a' + i == str.charAt(j)) {
                    int i1 = str.indexOf(str.charAt(j));
                    count[i] = i1;
                }
            }
        }
        String ans = "";
        for (int target : count) {
            ans += String.valueOf(target) + " ";
        }
        System.out.println(ans);
    }
}
```

| 메모리     | 시간    | 코드길이 |
|:--------|:------|:-----|
| 18584KB | 232ms | 650B |