package Algorithms.백준.단계별로풀어보기.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//17298번 오큰수
public class Step6시간초과 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] nums = new int[N];

        // 문자를 배열 각 인덱스에 저장
        for(int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        StringBuilder stringBuilder = new StringBuilder();
        // 기준 숫자를 인덱스로 잡음
        for(int i = 0; i < N; i++) {
            // 최대값을 초기화
            int max = 0;
            // 마지막 부터 해당 숫자 인덱스 다음까지 반복
            for(int j = i+1; j < N; j++) {
                //기준 보다 크다면 max에 대입
                if(nums[i] < nums[j]) {
                    max = nums[j];
                    break;
                }
            }
            // 반복이 끝났을때 0이라면 큰 값이 없다는 점을 이용
            if(max == 0) stringBuilder.append(-1).append(" ");
            else stringBuilder.append(max).append(" ");
        }
        System.out.print(stringBuilder);
    }
}
