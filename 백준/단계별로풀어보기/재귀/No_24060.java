package 백준.단계별로풀어보기.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_24060 {
    static int[] SORTED;
    static int MERGE_COUNT = 0;
    static int COLLECT;
    static int VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int count = Integer.parseInt(stringTokenizer.nextToken());
        COLLECT = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int[] nums = new int[count];
        SORTED = new int[count];

        for(int i = 0; i < count; i++) {
            nums[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        merge_sort(nums, 0,count-1);

        if(MERGE_COUNT < COLLECT) {
            System.out.print(-1);
        }
    }

    static void merge(int[] nums, int start, int middle, int end) {
        int i = start;
        int j = middle + 1;
        int k = start;

        while(i <= middle && j <= end) {
            if(nums[i] <= nums[j]) {
                SORTED[k] = nums[i];
                VALUE = nums[i];
                result();
                i++;
            } else {
                SORTED[k] = nums[j];
                VALUE = nums[j];
                result();
                j++;
            }
            k++;
        }

        if(i > middle) {
            for(int l = j; l <= end; l++) {
                SORTED[k] = nums[l];
                VALUE = nums[l];
                result();
                k++;
            }
        } else {
            for(int l = i; l <= middle; l++) {
                SORTED[k] = nums[l];
                VALUE = nums[l];
                result();
                k++;
            }
        }
        for(int l = start; l <= end; l++) {
            nums[l] = SORTED[l];
        }
    }

    static void merge_sort(int[] nums, int start, int end) {
        if(start < end) {
            int middle = (start + end)/2;
            merge_sort(nums, start, middle);
            merge_sort(nums, middle+1, end);
            merge(nums, start, middle, end);
        }
    }

    static void result() {
        MERGE_COUNT++;
        if(MERGE_COUNT == COLLECT) {
            System.out.print(VALUE);
            System.exit(0); //미세한 성능 차이... 왜일까?
        }
    }
}
