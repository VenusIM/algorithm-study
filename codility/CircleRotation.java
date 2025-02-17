package Algorithms.codility;

public class CircleRotation {
    public static void main(String[] args) {
        new CircleRotation().solution(new int[]{3, 8, 9, 7, 6}, 3);
    }

    public int[] solution(int[] A, int K) {
        // Implement your solution here

        int size = A.length;

        int moveCount = K%size;
        if(moveCount == 0) {
            return A;
        }

        int[] result = new int[size];

        K--;
        for(int i = K; i < size; i++) {
            result[i - K] = A[i];
        }

        for(int i = 0; i < K; i++) {
            result[K + 1 + i] = A[i];
        }

        return result;
    }
}
