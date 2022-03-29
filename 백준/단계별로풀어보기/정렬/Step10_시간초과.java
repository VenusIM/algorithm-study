package Algorithms.백준.단계별로풀어보기.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


// 18870번 좌표 압축
public class Step10_시간초과 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(bufferedReader.readLine());
        int[] nums = new int[count];
        int[] sorted = new int[count];
        int value;

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i = 0; i < count; i++) {
            value = Integer.parseInt(stringTokenizer.nextToken());
            nums[i] = sorted[i] = value;
        }

        Arrays.sort(sorted);

        // Stream을 이용한 중복 제거
        sorted = Arrays.stream(sorted).distinct().toArray();

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < count; i++) {
            int j = 0;
            while(j < sorted.length) {
                if(nums[i] == sorted[j]) {
                    stringBuilder.append(j);
                    if(i != count - 1) {
                        stringBuilder.append(" ");
                    }
                    break;
                }else {
                    j++;
                }
            }
        }
        System.out.print(stringBuilder);
    }
}
