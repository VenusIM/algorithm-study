package Algorithms.백준.단계별로풀어보기.if문;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//2525 문제 오븐 시계
public class Step6 {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String currentTime = bufferedReader.readLine();
        String[] times = currentTime.split(" ");

        int currentHour = Integer.parseInt(times[0]);
        int currentMinute = Integer.parseInt(times[1]);
        int minute = Integer.parseInt(bufferedReader.readLine());

        StringBuilder stringBuilder = new StringBuilder();

        int totalMinute = currentMinute + minute;
        if(60 <= totalMinute) {
            int afterHour = totalMinute/60 + currentHour;
            if(afterHour == 24) {
                afterHour = 0;
            }else if(24 < afterHour) {
                afterHour -= 24;
            }
            stringBuilder
                    .append(afterHour)
                    .append(" ")
                    .append(totalMinute%60);
        }else {
            stringBuilder
                    .append(currentHour)
                    .append(" ")
                    .append(totalMinute);
        }

        System.out.print(stringBuilder.toString());
    }
}
