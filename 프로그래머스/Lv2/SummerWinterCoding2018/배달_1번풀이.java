package 프로그래머스.Lv2.SummerWinterCoding2018;

public class 배달_1번풀이 {

    static int solution(int N, int[][] road, int K) {

        int answer = 0;
        int[][] roadArr = new int[N][N];

        for (int i = 0; i < roadArr.length; i++) {
            for (int j = 0; j < roadArr.length; j++) {
                if (i == j) {
                    roadArr[i][j] = 0;
                    continue;
                }
                roadArr[i][j] = 500001;
            }
        }

        for (int i = 0; i < road.length; i++) {
            if (roadArr[road[i][0] - 1][road[i][1] - 1] < road[i][2])
                continue;
            roadArr[road[i][0] - 1][road[i][1] - 1] = road[i][2];
            roadArr[road[i][1] - 1][road[i][0] - 1] = road[i][2];
        }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(i == j) {
                    continue;
                }
                for (int k = 0; k < N; k++) {
                    if(i == k || j == k) {
                        continue;
                    }
                    if (roadArr[j][k] > roadArr[j][i] + roadArr[i][k]) {
                        roadArr[j][k] = roadArr[j][i] + roadArr[i][k];
                    }
                }
            }
        }

        for (int i = 0; i < roadArr.length; i++) {
            if (K < roadArr[0][i]) {
                continue;
            }
            answer++;
        }

        return answer;

    }

    public static void main(String[] args) {
        int[][] road1 = {{1, 2, 1}, {2, 3, 3}, {5, 2, 2}, {1, 4, 2}, {5, 3, 1}, {5, 4, 2}};
        System.out.println(solution(5, road1, 3));
        int[][] road2 = {{1, 2, 1}, {1, 3, 2}, {2, 3, 2}, {3, 4, 3}, {3, 5, 2}, {3, 5, 3}, {5, 6, 1}};
        System.out.println(solution(6, road2, 4));
    }
}
