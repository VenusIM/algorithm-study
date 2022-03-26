package Algorithms.백준.단계별로풀어보기.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2750 수 정렬하기
public class Step1삽입버블선택 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        String tmp;

        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            nums[i] = Integer.parseInt(bufferedReader.readLine());
        }


        int temp;
          //선택 정렬
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) { // 가장 작은 수 탐색
//                if (nums[j] <= nums[i]) {
//                    temp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = temp;
//                }
//            }
//        }
//
//        // 버블 정렬
//        for (int i = 1; i < nums.length; i++) {
//            for (int j = 0; j < nums.length - i; j++) {
//                if (nums[j] > nums[j + 1]) {
//                    temp = nums[j];
//                    nums[j] = nums[j + 1];
//                    nums[j + 1] = temp;
//                }
//            }
//        }

        // 삽입 정렬 : 동일 시간 복잡도 O(N^2)를 갖고 있는 정렬중 가장 효율적이다.
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] < nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < nums.length; i++) {
            stringBuilder.append(nums[i]);
            if(i != nums.length-1) {
                stringBuilder.append("\n");
            }
        }

        System.out.print(stringBuilder);
    }
}