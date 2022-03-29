package Algorithms.백준.단계별로풀어보기.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;


// 18870번 좌표 압축
public class Step10 {
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

        HashMap<Integer, Integer> rank = new HashMap<Integer, Integer>();
        int c = 0;
        for(int num : sorted) {
            if(!rank.containsKey(num)) {
                rank.put(num, c);
                c++;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < count; i++) {
            stringBuilder.append(rank.get(nums[i]));
            if(i != count - 1) {
                stringBuilder.append(" ");
            }
        }

        System.out.print(stringBuilder);

    }
}
