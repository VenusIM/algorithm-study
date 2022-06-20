package Algorithms.회사.estsoft;

public class Solution2 {
    public int solution(int[][] needs, int r) {
        //각 열의 숫자의 개수를 담을 배열
        int[] count = new int[needs[0].length];
        //1의 개수 탐색
        for(int i = 0; i < needs.length; i++) {
            for(int j = 0; j < needs[i].length; j++) {
                if(needs[i][j] == 1) count[j] += 1;
            }
        }
        int max = 0;

        for(int i = 0; i < count.length; i++) {
            if(max < count[i]) max = count[i];
        }

        return max;
    }
}
