package silver.그리디.회의실배정;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Meeting[] meetings = new Meeting[N];
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            meetings[i] = new Meeting(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
        }

        Arrays.sort(meetings);
        int endTime = 0, cnt = 0;
        for (Meeting meeting : meetings) {
            if (meeting.start >= endTime) {
                endTime = meeting.end;
                cnt++;
            }
        }
        System.out.println(cnt);
    }

}

class Meeting implements Comparable<Meeting> {
    int start;
    int end;

    Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Meeting o) {
        if (this.end == o.end) {
            return this.start - o.start; // 오름차순(음수)
        } else return this.end - o.end;
    }
}
