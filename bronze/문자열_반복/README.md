
| 백준 링크                                         | 티스토리 링크                                       |
|:----------------------------------------------|:----------------------------------------------|
| [문제 링크](https://www.acmicpc.net/problem/2675) | [문제 풀이 링크](https://strong-park.tistory.com/19) |


```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            String[] split = str.split(" ");
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < split[1].length(); j++) {
                int count = Integer.parseInt(split[0]);
                for (int k = 0; k < count; k++) {
                    sb.append(split[1].charAt(j));
                }
            }
            System.out.println(sb);
        }
    }
}
```

| 메모리     | 시간   | 코드길이 |
|:--------|:-----|:-----|
| 11488KB | 84ms     | 787B  |