package Algorithms.백준.단계별로풀어보기.일차원배열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// 10818 제목 최소,최대
public class Step1 {
    public static void main(String[] args) throws Exception{

        //시간 초과 코드
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int count = Integer.parseInt(bufferedReader.readLine());
//        String[] numList = bufferedReader.readLine().split(" ");
//
//        int max = Integer.parseInt(numList[0]);
//        int min = max;
//
//        for(int i = 0; i < count; i++) {
//            for(int j = i+1; j < count;  j++) {
//
//                if (max < Integer.parseInt(numList[j])) {
//                    max = Integer.parseInt(numList[j]);
//                }
//
//                if (Integer.parseInt(numList[j]) < min) {
//                    min = Integer.parseInt(numList[j]);
//                }
//
//            }
//        }
//
//        System.out.println(min+" "+max);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        String[] nums = bufferedReader.readLine().split(" ");

        int[] numList = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            numList[i] = Integer.parseInt(nums[i]);
        }

        Arrays.sort(numList);
        System.out.print(numList[0]+" "+numList[numList.length-1]);
    }
}
