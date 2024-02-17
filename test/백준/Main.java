package test.백준;

import java.util.Scanner;

public class Main {


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//
//        int[] count = new int[26];
//        for (int i = 0; i < 26; i++) {
//            count[i] = -1;
//            for (int j = 0; j < str.length(); j++) {
//                if ('a' + i == str.charAt(j)) {
//                    int i1 = str.indexOf(str.charAt(j));
//                    count[i] = i1;
//                }
//            }
//        }
//        String ans = "";
//        for (int target : count) {
//            ans += String.valueOf(target) + " ";
//        }
//        System.out.println(ans);
//    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String a = sc.next();

            int[] count = new int[26];
            // 알파벳 배열에서 해당 인덱스에 맞는 알파벳 개수 계산
            for (char c : a.toUpperCase().toCharArray()) {
                count[c - 'A']++;
            }
            int alphabetIdx = 0;
            // 알파벳 배열에서 최대값 구하기
            int max = count[0]; // -1로 해도 됨
            // 알파벳 배열에서 중복되는 개수 구하기
            int duplicateCount = 0;
            for (int i = 0; i < count.length; i++) {
                if (count[i] > max) {
                    max = count[i];
                    alphabetIdx = i;
                    // count배열의 인덱스 값과 최댓값으로 구한 값이 같을 경우 중복 개수 더하기
                } else if (count[i] == max) {
                    duplicateCount ++;
                }
            }
            char ans;
            if (duplicateCount > 0)
                ans = '?';
            else
                ans = (char)('A' + alphabetIdx);

            System.out.println(ans);

    }
}
