package Algorithms.백준.단계별로풀어보기.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//11651번 좌표 정렬하기2
public class Step7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer;
        int[][] xy = new int[count][2];

        //정렬하기 1번 코드에서 좌표의 위치만 변경하여 Sort 메서드 이용하여 정렬
        for(int i = 0; i < count; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            xy[i][1] = Integer.parseInt(stringTokenizer.nextToken());
            xy[i][0] = Integer.parseInt(stringTokenizer.nextToken());
        }

        //2차원 배열 정렬 Comparator 우선순위 재정의 람다식 사용
        Arrays.sort(xy, (o1, o2) -> {

            // 첫번째 값이 동일하면 2번째 값을 비교
            if (o1[0] == o2[0]) {

                // 양수 일경우 위치를 변경 , 0이나 음수 일 경우 변동 x
                return o1[1] - o2[1];
            } else {
                return o1[0] - o2[0];
            }
        });

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < count; i++) {
            stringBuilder
                    .append(xy[i][1])
                    .append(" ")
                    .append(xy[i][0]);

            if(i != count - 1) {
                stringBuilder.append("\n");
            }

        }

        System.out.print(stringBuilder);

    }
}
