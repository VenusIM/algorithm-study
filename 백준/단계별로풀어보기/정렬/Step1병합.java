package Algorithms.백준.단계별로풀어보기.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step1병합 {

    static int[] sorted;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());

        int[] nums = new int[count];

        for (int i = 0; i < count; i++) {
            nums[i] = Integer.parseInt(bufferedReader.readLine());
        }

        sorted = new int[count];

        // 병합 정렬 O(N*logN)이 보장된다.
        mergeSort(nums, 0, count - 1);

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < count; i++) {
            stringBuilder.append(nums[i]);
            if(i != count - 1) {
                stringBuilder.append("\n");
            }
        }

        System.out.print(stringBuilder);

    }

    static void merge(int[] nums, int start, int middle, int end) {

        int i = start;
        int j = middle + 1;
        int k = start;

        while(i <= middle && j <= end) {
            if(nums[i] <= nums[j]) {
                sorted[k] = nums[i];
                i++;
            }else{
                sorted[k] = nums[j];
                j++;
            }
            k++;
        }

        // 한쪽이 삽입이 완료 되었다면
        if(middle < i) {
            for(int l = j; l <= end; l++) {
                sorted[k] = nums[l];
                k++;
            }
        }else {
            for(int l = i; l <= middle; l++) {
                sorted[k] = nums[l];
                k++;
            }
        }
        for(int l = start; l <= end; l++) {
            nums[l] = sorted[l];
        }

    }

    static void mergeSort(int[] nums, int start, int end) {

        if(start < end) {
            int middle = (start + end) /2;
            mergeSort(nums, start, middle);
            mergeSort(nums, middle+1, end);
            merge(nums, start, middle, end);
        }

    }
}
