package silver.구현.단어나누기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        List<String> list = new ArrayList<>(); // 이렇게 만들 수 있는 단어 중에서 -> 여러 조합이 나올 수 있으므로 List로 만든다
        StringBuilder sb;
        // 단어에서 임의의 두 부분을 골라서 단어를 쪼갠다
        // -> 단어를 세 부분으로 나누는 모든 경우의 수를 고려한다
        // -> 첫 번째 선택에서 자를 단어의 첫번째 위치 i를 선택한다
        // -> 두 번째 선택에서 자를 단어의 두번째 위치 j를 선택한다
        // -> i와 j는 1과 n-1 사이의 정수이다
        for(int i=1; i<str.length()-1; i++){ // 첫번째 for문의 역할 : 첫번째 선택에서 자를 단어의 첫번째 위치 i를 선택한다
            for(int j=i+1; j<str.length(); j++) { // 두번째 for문의 역할 : 두번째 선택에서 자를 단어의 두번째 위치 j를 선택한다
                sb = new StringBuilder();
                StringBuilder first = new StringBuilder(str.substring(0, i));
                //System.out.println("first : " + first);
                //System.out.println("first reverse : " + first.reverse());
                StringBuilder mid = new StringBuilder(str.substring(i, j));
//                System.out.println("mid : " + mid);
//                System.out.println("mid reverse : " + mid.reverse());
                StringBuilder last = new StringBuilder(str.substring(j));
//                System.out.println("last : " + last);
//                System.out.println("last reverse : " + last.reverse());
                sb.append(first.reverse()).append(mid.reverse()).append(last.reverse());
                list.add(String.valueOf(sb));
            }
        }
        // 사전 순 정렬
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.get(0));
    }
}
