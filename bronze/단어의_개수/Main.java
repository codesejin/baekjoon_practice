package bronze.단어의_개수;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int cnt = 0;
        int pre = ' ';
        while (true) {
            int ch = System.in.read();
            System.out.println("ch = " + ch);
            if(ch == '\n') {
                System.out.println("int '\n' : " + (int) '\n');
                if(pre != ' ') cnt++;
                break;
            }
            if(ch == ' ') {
                System.out.println("int ' ' : " + (int) ' ');

                if(pre != ' ') cnt++;
            }
            pre = ch;
        }
        System.out.println(cnt);
    }
}
