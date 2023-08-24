

| 백준 링크                                         | 티스토리 링크                                       |
|:----------------------------------------------|:----------------------------------------------|
| [문제 링크](https://www.acmicpc.net/problem/2908) | [문제 풀이 링크](https://strong-park.tistory.com/18) |


```java


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] splitStr = str.split(" ");

        int max = 0;
        for (int i = 0; i < splitStr.length; i++) {
            String temp = "";
            for (int j = splitStr[i].length() - 1; j >= 0; j--) {
                temp += String.valueOf(splitStr[i].charAt(j));
            }
            if (max < Integer.valueOf(temp))
                max = Integer.parseInt(temp);
        }
        System.out.println(max);
    }
}

```

| 메모리     | 시간   | 코드길이 |
|:--------|:-----|:-----|
| 11516MB | 76ms | 730B    |
