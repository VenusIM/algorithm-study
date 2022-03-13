package Algorithms.코딩테스트.가비아;

public class Main4 {
    public int solution(int[][] grid, int k) {

        int[] sums;
        int sum = 0;

        for(int x = 0; x < grid[0].length; x++) {

        }
        for(int i = 0; i < k; i++) {
            for(int j = 0; j < k; j++) {
                sum += grid[i][j];
            }
        }
        return sum;
    }
}
