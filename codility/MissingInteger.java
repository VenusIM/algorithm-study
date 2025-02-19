package Algorithms.codility;

import java.util.Arrays;

public class MissingInteger {

    public static void main(String[] args) {
        MissingInteger m = new MissingInteger();
        System.out.println(m.solution(new int[]{2}));
    }

    public int solution(int[] A) {
        // Implement your solution here
        Arrays.sort(A);
        int result = 1;

        if(A.length == 1){
            if(A[0] < 1){
                return 1;
            } else if(A[0] == 1){
                return 2;
            }
            else {
                return --A[0];
            }

        }

        for(int i = 0; i < A.length; i++) {

            if(i == A.length - 1) {
                if(A[i] < 1) {
                    break;
                }
                result = ++A[i];
                break;
            }

            if(A[i] < 1 || A[i + 1] < 1) {
                continue;
            }

            if(A[i] != A[i + 1] && A[i] + 1 != A[i + 1]) {
                result =  A[i] + 1;
                break;
            }
        }

        return result;
    }
}
