package Algorithms.백준.단계별로풀어보기.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 11650번 좌표 정렬하기
public class Step6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer;
        int[][] xy = new int[count][2];

        for(int i = 0; i < count; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            xy[i][0] = Integer.parseInt(stringTokenizer.nextToken());
            xy[i][1] = Integer.parseInt(stringTokenizer.nextToken());
        }

        //2차원 배열 정렬 Comparator 우선순위 재정의
        Arrays.sort(xy, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                // 첫번째 값이 동일하면 2번째 값을 비교
                if(o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                } else {
                    return o1[0] - o2[0];
                }
            }
        });

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < count; i++) {
            stringBuilder
                    .append(xy[i][0])
                    .append(" ")
                    .append(xy[i][1]);

            if(i != count - 1) {
                stringBuilder.append("\n");
            }

        }

        System.out.print(stringBuilder);


    }
}
