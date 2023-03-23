package 프로그래머스.Lv2.SummerWinterCoding2018;

public class 배달_2번풀이 {
    static int[][] ROAD_ARR;
    static int[] VISITED;
    static int solution(int N, int[][] road, int K) {

        int start;
        int end;
        int temp;

        ROAD_ARR = new int[N + 1][N + 1];
        VISITED = new int[N + 1];

        for (int i = 0; i < road.length; i++) {

            start = road[i][0];
            end = road[i][1];

            temp = ROAD_ARR[start][end];
            if (temp == 0 || road[i][2] < temp) {
                if (start < end) {
                    ROAD_ARR[start][end] = road[i][2];
                } else {
                    ROAD_ARR[end][start] = road[i][2];
                }
            }
        }
        VISITED[1] = 1;
        return traceArr(1, N, K, 0) + 1;
    }

    static int traceArr(int i, int N, int K, int distance) {

        int count = 0;
        int temp;
        for(int j = 1; j <= N; j++) {

            if(i == j) {
                continue;
            }

            temp = ROAD_ARR[i][j];
            if(ROAD_ARR[i][j] < 1) {
                continue;
            }

            if(temp + distance <= K) {
                if(VISITED[j] == 0) {
                    VISITED[j] = 1;
                    count++;
                }
                count += traceArr(j, N, K,temp + distance);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] road1 = {{1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}};
        System.out.println(solution(5, road1, 3));
        int[][] road2 = {{1,2,1},{1,3,2},{2,3,2},{3,4,3},{3,5,2},{3,5,3},{5,6,1}};
        System.out.println(solution(6, road2, 4));
    }
}
