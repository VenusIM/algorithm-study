package Algorithms.코딩테스트.데브매칭;

public class Solution1 {
    public static void main(String[] args) {
        int[][] dist = {{0,5,2,4,1},{5,0,3,9,6},{2,3,0,6,3},{4,9,6,0,3},{1,6,3,3,0}};
        int[][] answer = solution(dist);

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < answer.length; i++) {
            for(int j = 0; j < answer[0].length; j++) {
                stringBuilder.append(answer[i][j]).append(" ");
            }
        }

        System.out.print(stringBuilder);
    }

    static int[][] solution(int[][] dist) {
        int[][] answer = new int[2][dist.length];

        int[] tmp = new int[100000001];

        for(int i = 0; i < dist.length; i++) {
            tmp[dist[0][i]] = i+1;
        }

        int j = 0;
        for(int i = 0; i < tmp.length; i++) {
            if(dist.length - 1 < j) {
                break;
            }

            if(tmp[i] != 0) {
                answer[0][j] = tmp[i] - 1;
                answer[1][dist.length - 1 - j] = tmp[i] - 1;
                j++;
            }
        }

        return answer;

    }
}
