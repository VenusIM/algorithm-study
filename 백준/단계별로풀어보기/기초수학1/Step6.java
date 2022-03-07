package Algorithms.백준.단계별로풀어보기.기초수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2775 부녀회장이 될테야
public class Step6 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < count; i++) {

            int floor = Integer.parseInt(bufferedReader.readLine());
            int room = Integer.parseInt(bufferedReader.readLine());

            if(i != 0) {
                stringBuilder.append("\n");
            }

            int tmp = 0;

            if(room == 1) {
                stringBuilder.append(1);
            } else if (room == 2) {
                stringBuilder.append(floor+1);
            } else if(floor == 0) {
                stringBuilder.append(room);
            } else {
            }

        }

        System.out.print(stringBuilder);

    }
}
