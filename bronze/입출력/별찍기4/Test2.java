package bronze.입출력.별찍기4;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(System.out));
        StringBuilder builder = new StringBuilder();
        int N = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; ++i) {
            builder.append("*");
        }

        for (int i = 0; i < N; ++i) {
            writer.write(builder.toString());
            writer.newLine();
            builder.replace(i, i + 1, " ");
        }

        reader.close();
        writer.close();

    }
}
