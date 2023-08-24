package bronze.소금_폭탄;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String now = sc.next();
        String targetTime = sc.next();

        String[] currentSplit = now.split(":");
        int currentHour = Integer.parseInt(currentSplit[0]);
        int currentMinute = Integer.parseInt(currentSplit[1]);
        int currentSecond =  Integer.parseInt(currentSplit[2]);
        int currentAmount = currentHour * 3600 + currentMinute * 60 + currentSecond;

        String[] targetSplit = targetTime.split(":");
        int targetHour = Integer.parseInt(targetSplit[0]);
        int targetMinute = Integer.parseInt(targetSplit[1]);
        int targetSecond =  Integer.parseInt(targetSplit[2]);
        int targetAmount = targetHour * 3600 + targetMinute * 60 + targetSecond;

        int needSecoundAmount = targetAmount - currentAmount;
        if (needSecoundAmount <= 0)
            needSecoundAmount += 24 * 3600;
        int needHour = needSecoundAmount / 3600;
        int needMinute = (needSecoundAmount % 3600) / 60;
        int needSecond = needSecoundAmount % 60;
        System.out.printf("%02d:%02d:%02d", needHour, needMinute, needSecond);
    }
}
