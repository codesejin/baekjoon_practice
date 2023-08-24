| 백준 링크                                         | 티스토리 링크                                       |
|:----------------------------------------------|:----------------------------------------------|
| [문제 링크](https://www.acmicpc.net/problem/1157) | [문제 풀이 링크](https://strong-park.tistory.com/8) |


```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int[] count = new int[26];
        // 알파벳 배열에서 해당 인덱스에 맞는 알파벳 개수 계산
        for (char c : a.toUpperCase().toCharArray()) {
            count[c - 'A']++;
        }

        // 알파벳 배열에서 최대값 구하기
        int max = count[0];
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
            }
        }
        char ans;
        int idx = 0;
        // count배열의 인덱스 값과 최댓값으로 구한 값이 같을 경우 중복개수 더하기
        int duplicateCount = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] == max) {
                duplicateCount ++ ;
                idx =i;
            }
        }
        if (duplicateCount > 1)
            ans = '?';
        else
            ans = (char)('A' + idx);

        System.out.println(ans);
    }
}
```

| 메모리     | 시간    | 코드길이 |
|:--------|:------|:-----|
| 30736KB | 472ms | 1109B    |