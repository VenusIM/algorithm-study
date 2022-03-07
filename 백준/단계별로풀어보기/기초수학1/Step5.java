package Algorithms.백준.단계별로풀어보기.기초수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 102520번 ACM호텔
public class Step5 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(bufferedReader.readLine());
        String[] info;

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < count; i++) {

            info = bufferedReader.readLine().split(" ");

            int floor = Integer.parseInt(info[0]);
            int room = Integer.parseInt(info[1]);
            int th = Integer.parseInt(info[2]);

            int floorNumber = th % floor;
            int roomNumber = th / floor + 1;

            if(floorNumber == 0 ) {
                floorNumber = floor;
                roomNumber--;
            }

            if(i != 0 )
                stringBuilder.append("\n");

            stringBuilder.append(floorNumber);

            if(roomNumber < 10) {
                stringBuilder
                        .append(0)
                        .append(roomNumber);
            }else {
                stringBuilder.append(roomNumber);
            }

        }

        System.out.print(stringBuilder);

    }
}
