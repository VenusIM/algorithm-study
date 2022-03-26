package Algorithms.백준.단계별로풀어보기.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2750 수 정렬하기1
public class Step2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());

        int[] nums = new int[count];

        for(int i = 0; i < count; i++) {
            nums[i] = Integer.parseInt(bufferedReader.readLine());
        }

        // 퀵 정렬 O(N * logN)
        quickSort(nums, 0 , count - 1);

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < count; i++) {
            stringBuilder.append(nums[i]);
            if(i != count - 1) {
                stringBuilder.append("\n");
            }
        }

        System.out.print(stringBuilder);


    }

    static void quickSort(int[] nums, int start, int end) {

        if(start == end) { // 인덱스가 한개 일 경우
            return;
        }

        int i = start + 1;
        int j = end;
        int tmp;

        while(i <= j) { //엇갈리기 전까지 반복

            while(i <= end && nums[i] <= nums[start]){ // peviot 값보다 큰 수 탐색
                i++;
            }

            while(start < j && nums[start] <= nums[j]) { // peviot 값보다 작은 수 탐색
                j--;
            }

            if(i <= j) { // 엇갈리지 않았을 경우 큰 수와 작은 수를 교환
               tmp = nums[i];
               nums[i] = nums[j];
               nums[j] = tmp;
            }else if (j < i) { // j보다 i가 크다는 것은 엇갈렸을 경우 피벗 값과 작은 수를 교환
                tmp = nums[start];
                nums[start] = nums[j];
                nums[j] = tmp;
            }

            quickSort(nums, start, j - 1); // 피벗 값의 자리 기준 왼쪽(작은수) 재귀
            quickSort(nums, j + 1, end); // 피벗 값의 자리 기준 오른쪽(큰수) 재귀

        }

    }
}
