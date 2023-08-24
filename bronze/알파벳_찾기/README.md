
| 백준 링크                                         | 티스토리 링크                                        |
|:----------------------------------------------|:-----------------------------------------------|
| [문제 링크](https://www.acmicpc.net/problem/10809) | [문제 풀이 링크](https://strong-park.tistory.com/17) |


```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] count = new int[26];
        for (int i = 0; i < 26; i++) {
            count[i] = -1;
            for (int j = 0; j < str.length(); j++) {
                if ('a' + i == str.charAt(j)) {
                    int targetIdx = str.indexOf(str.charAt(j));
                    count[i] = targetIdx;
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
| 11528KB | 76ms | 836B |