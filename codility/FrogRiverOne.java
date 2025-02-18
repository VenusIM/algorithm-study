package Algorithms.codility;

public class FrogRiverOne {
    public static void main(String[] args) {
        System.out.println(new FrogRiverOne().solution(1, new int[]{1}));
    }

    public int solution(int X, int[] A) {
        // Implement your solution here
        boolean isEnd = false;
        int result = -1;
        int[] step = new int[X];
        for(int i = 0; i < A.length; i++) {
            if( step[A[i] - 1] == 0) {
                step[A[i] - 1] = i;
            }
            if(A[i] == X && !isEnd) {
                isEnd = true;
                result = i;
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < step.length; i++) {
            if(max < step[i]) {
                max = step[i];
            }

            if(step[i] == 0) {
                result = -1;
                break;
            }
        }

        if(result != -1) {
            result = max;
        }

        return result;
    }

}
