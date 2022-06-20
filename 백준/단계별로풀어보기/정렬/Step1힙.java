package Algorithms.백준.단계별로풀어보기.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step1힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());

        int[] nums = new int[count];

        for (int i = 0; i < count; i++) {
            nums[i] = Integer.parseInt(bufferedReader.readLine());
        }

        int tmp;

        // 상향식 힙구조 정렬
        for(int i = 1; i < nums.length; i++) {

            int childNode = i;

            while(childNode != 0) {

                int root = (childNode - 1)/2;

                if(nums[root] < nums[childNode]) {
                    tmp = nums[root];
                    nums[root] = nums[childNode];
                    nums[childNode] = tmp;
                }
                childNode = root;
            }
        }

        // 트리의 크기를 하나씩 줄이면서 큰 수를 마지막 노드로 보내준다.
        for(int i = nums.length - 1; i > 0; i--) {
            tmp = nums[0];
            nums[0] = nums[i];
            nums[i] = tmp;

            int root = 0;
            int j = 1;
            while(j < i) {

                j = 2 * root + 1;

                if(j < i - 1 && nums[j] < nums[j+1]) {
                    j++;
                }

                if(j < i && nums[root] < nums[j]){
                    tmp = nums[root];
                    nums[root] = nums[j];
                    nums[j] = tmp;
                }
                root = j;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < count; i++) {
            stringBuilder.append(nums[i]);
            if(i != count - 1) {
                stringBuilder.append("\n");
            }
        }

        System.out.print(stringBuilder);

    }
}
