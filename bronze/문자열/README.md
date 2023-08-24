
| 백준 링크                                         | 티스토리 링크                                       |
|:----------------------------------------------|:----------------------------------------------|
| [문제 링크](https://www.acmicpc.net/problem/9086) | [문제 풀이 링크](https://strong-park.tistory.com/16) |


```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        String ans = "";

        String total = str1 + "," + str2 + "," + str3;
        String[] strSplit = total.split(",");
        for (int i = 0; i < num; i++) {
                String start = String.valueOf(strSplit[i].charAt(0));
                String end = String.valueOf(strSplit[i].charAt(strSplit[i].length()-1));
                ans = start + end;
            System.out.println(ans);
        }
    }
}

```


| 메모리     | 시간   | 코드길이 |
|:--------|:-----|:-----|
| 18600MB | 236ms     | 684B  |