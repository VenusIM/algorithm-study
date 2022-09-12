package 백준.단계별로풀어보기.기하1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_1358 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int width = Integer.parseInt(stringTokenizer.nextToken());
        int height = Integer.parseInt(stringTokenizer.nextToken());
        double radius = height/2.0;

        int x = Integer.parseInt(stringTokenizer.nextToken());
        int y = Integer.parseInt(stringTokenizer.nextToken());

        int people = Integer.parseInt(stringTokenizer.nextToken());

        int tempX;
        int tempY;
        double temp;
        double distanceRight;
        double distanceLeft;
        int count = 0;

        for(int i = 0; i < people; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            tempX = Integer.parseInt(stringTokenizer.nextToken());
            tempY = Integer.parseInt(stringTokenizer.nextToken());
            temp = Math.pow(Math.abs(y+radius-tempY), 2);
            distanceRight = Math.sqrt(Math.pow(Math.abs(x+width-tempX), 2) + temp);
            distanceLeft = Math.sqrt(Math.pow(Math.abs(x-tempX), 2) + temp);
            // 높이에서 벗어날 경우
            if(y+height < tempY || tempY < y) {
                continue;
            }
            // 가운데 사각형
            if(x <= tempX && tempX <= x+width) {
                count++;
            }
            // 오른쪽, 왼쪽 반원
            else if(distanceRight <= radius || distanceLeft <= radius) {
                count++;
            }
        }
        System.out.print(count);
    }
}
