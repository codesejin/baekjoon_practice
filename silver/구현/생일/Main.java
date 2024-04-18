package silver.구현.생일;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    // 나이가 적은 사람 과 나이가 가장 많은 사람 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int studentCnt = Integer.parseInt(br.readLine());

        TreeMap<Integer, String> students = new TreeMap<>(); // 생년월일 , 이름 -> 정렬할거니까 생년월일이 key여야 함

        while (studentCnt > 0) {
            String student = br.readLine();
            StringTokenizer st = new StringTokenizer(student);
            int birthDate = 0;
            String name = st.nextToken();
            birthDate += Integer.parseInt(st.nextToken());
            birthDate += Integer.parseInt(st.nextToken()) * 100;
            birthDate += Integer.parseInt(st.nextToken()) * 10000;

            students.put(birthDate, name);
            studentCnt--;
        }

        String lowBirthDate = students.firstEntry().getValue(); // 생년월일 낮은게 나이 많은거
        String highBirthDate = students.lastEntry().getValue(); // 생년월일 높은게 나이 적은거

        System.out.println(highBirthDate);
        System.out.println(lowBirthDate);
    }
}
