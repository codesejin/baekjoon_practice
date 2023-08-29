package bronze.입출력.A더하기B_1;

import java.io.IOException;

// 12836kb / 68ms / Java 8	/ 259b
public class Test1 {
    public static void main(String[] args) throws IOException {
        int a = System.in.read();
        System.in.read();
        int b = System.in.read();
        System.in.read();
        a=a-48;  // '0'
        b=b-48;
        System.out.println(a+b);
    }
}
