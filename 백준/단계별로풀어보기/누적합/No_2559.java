package 백준.단계별로풀어보기.누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int index = N-K+1;

        int result = 0;
        int temp;
        // 0부터 K개의 합
        for(int i = 0; i < K; i++) {
            result += arr[i];
        }
        // 초기값 세팅
        temp = result;

        for(int i = 1; i < index; i++) {
            // 시작 온도 빼기
            temp -= arr[i-1];
            // 끝 온도 더하기
            temp += arr[K+i-1];
            // 다음 구간이 이전 구간 보다 크다면
            if(result < temp) {
                result = temp;
            }
        }

        System.out.print(result);
    }
}
