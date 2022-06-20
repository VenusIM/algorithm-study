package Algorithms.백준.단계별로풀어보기.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;

// 2108 통계학
public class Step4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = new int[8001];
        int count = Integer.parseInt(bufferedReader.readLine());

        int total = 0;
        int value;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < count; i++) {
            value = Integer.parseInt(bufferedReader.readLine());

            // 산술 평균을 위한 총합
            total += value;

            // 계수 정렬
            nums[value + 4000]++;

            // 최대값
            if(max < value) {
                max = value;
            }
            if(value < min) {
                min = value;
            }
        }

        // 최빈값, 최대값, 최소값, 중앙값
        int most = 0;
        int mostMax = 0; // 최빈값의 최대값
        boolean flag = false; // 최빈값이 2번 이상일 경우 true
        int middle = 0;
        int avg = count / 2 + 1;


        for(int i = min + 4000; i <= max + 4000; i++) {
            if(0 < nums[i]) {

                //최빈값
                if(mostMax < nums[i]) {
                    most = i - 4000;
                    mostMax = nums[i];
                    flag = true;
                }else if(mostMax == nums[i] && flag == true) {
                    most = i - 4000;
                    flag = false;
                }

                //중앙값
                if(0 < avg) {
                    avg -= nums[i];
                    middle = i - 4000;
                }

            }

        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(Math.round((double)total / count)).append("\n")
                .append(middle).append("\n")
                .append(most).append("\n")
                .append(max - min);

        System.out.print(stringBuilder);

    }
}
