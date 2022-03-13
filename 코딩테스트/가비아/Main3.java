package Algorithms.코딩테스트.가비아;

import java.io.IOException;

public class Main3 {
    public static void main(String[] args) throws IOException {

        int nums[] = {2,3,4,5,1};
        int k = 3;
        int t = 11;

        System.out.println(solution(nums,k,t));
    }

    static int solution(int[] arr, int k, int t) {

        int answer = 0;
        int tmp = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if(t < arr[i]) {
                tmp = i;
                break;
            }
        }

        if(tmp <= k) {
            answer = 0;
        }else {
            for(int i = tmp - k; i >= 0; i--) {

                int sum = 0;

                for(int j = i; j < i + k; j++) {
                    System.out.println("arr["+j+"] = "+arr[j]);
                    sum += arr[j];
                }
                System.out.println("sum = "+sum);
                if(sum <= t) {
                    tmp = i;
                    break;
                }
            }
        }

        return answer;
    }
}
