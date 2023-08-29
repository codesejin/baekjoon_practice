package bronze.입출력.A더하기B_1;

// 12844kb/	68ms/Java 8	/ 196b
public class Test2 {
    public static void main(String[] args) throws Exception {
        byte[] num = {0, 0, 0};
        System.in.read(num); // num = [49, 32, 50] - 입력값이 1 2 일 경우
        System.out.println(num[0]+num[2]-96);
    }
}
