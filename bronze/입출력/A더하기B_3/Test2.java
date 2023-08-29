package bronze.입출력.A더하기B_3;

import java.io.*;

// BufferedWriter 참고용
public class Test2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int total = Integer.parseInt(reader.readLine());

        String[] numArr = new String[total];
        for (int index = 0; index < total; index++) {
            numArr[index] = reader.readLine();
        }
        int a, b;
        String[] split;
        for (String s : numArr) {
            split = s.split(" ");
            a = Integer.parseInt(split[0]);
            b = Integer.parseInt(split[1]);
            writer.write((a + b) + "\n");
        }

        reader.close();
        writer.close();
    }
}
