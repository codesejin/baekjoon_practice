package bronze.입출력.연도2007년;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int d = Integer.parseInt(input[1]);

        LocalDate localDate = LocalDate.of(2007,m,d);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();

        String answer = "";
        if(dayOfWeek.getValue() == 1) {
            answer = "MON";
        }else if (dayOfWeek.getValue() == 2) {
            answer = "TUE";
        }else if (dayOfWeek.getValue() == 3) {
            answer = "WED";
        }else if (dayOfWeek.getValue() == 4) {
            answer = "THU";
        }else if (dayOfWeek.getValue() == 5) {
            answer = "FRI";
        }else if (dayOfWeek.getValue() == 6) {
            answer = "SAT";
        }else if (dayOfWeek.getValue() == 7) {
            answer = "SUN";
        }
        System.out.println(answer);
    }
}
