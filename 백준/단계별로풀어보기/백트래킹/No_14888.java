package 백준.단계별로풀어보기.백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 연산자 끼워넣기
public class No_14888 {

    static int MAX = Integer.MIN_VALUE; // 최대값
    static int MIN = Integer.MAX_VALUE; // 최소값
    static int NUM_COUNT; // 숫자의 개수
    static int[] NUM_ARR; // 숫자 배열
    static int[] OPERATION_ARR; // 연산자 배열

    static void dfs(int number, int index) {

        // 숫자를 모두 탐색하여 계산했다면 최대 최소 비교
        if(NUM_COUNT == index) {
            MAX = Math.max(number, MAX);
            MIN = Math.min(number, MIN);
            return;
        }

        // 연산자 개수 만큼 반복
        for(int i = 0; i < 4; i++) {

            // 연산자의 개수가 0개라면 다음 연산자 확인
            if(OPERATION_ARR[i] < 1) {
                continue;
            }

            // 연산자 개수 차감
            OPERATION_ARR[i]--;
            switch (i) {
                case 0: // 덧셈
                    dfs(number + NUM_ARR[index], index + 1);
                    break;

                case 1: // 뺄셈
                    dfs(number - NUM_ARR[index], index + 1);
                    break;

                case 2: // 곱셈
                    dfs(number * NUM_ARR[index], index + 1);
                    break;

                case 3: // 나눗셈
                    dfs(number / NUM_ARR[index], index + 1);
                    break;
            }
            // 완료 되었다면 연산자 개수 복구
            OPERATION_ARR[i]++;

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        NUM_COUNT = Integer.parseInt(bufferedReader.readLine());
        NUM_ARR = new int[NUM_COUNT];
        OPERATION_ARR = new int[4];

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        for(int i = 0; i < NUM_COUNT; i++) {
            NUM_ARR[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        for(int i = 0; i < 4; i++) {
            OPERATION_ARR[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        // 제일 처음 값 0과 다음 인덱스 탐색을 위해 1
        dfs(NUM_ARR[0], 1);

        System.out.println(MAX);
        System.out.print(MIN);
    }
}
