package bronze.성_지키기;

import sun.nio.ch.ThreadPool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String xy = br.readLine();
        StringTokenizer st = new StringTokenizer(xy);
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int result = 0;
        for (int i = 0; i < x; i++) {
            boolean checked = false;
            String castle = br.readLine();
            for (int j = 0; j < y; j++) {
                if (castle.charAt(j) == 'X') {
                    checked = true;
                    break;
                }
            }
            if (!checked) result ++;
        }
    }
}
