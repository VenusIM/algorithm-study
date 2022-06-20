package Algorithms.백준.단계별로풀어보기.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//2798 블랙잭
public class Step1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int result = 0;
        for (int i = 0; i < N - 2; i++) {
            if(cards[i] > M) continue;
            for (int j = i + 1; j < N - 1; j++) {
                if(cards[i] + cards[j] > M) continue;
                for (int k = j + 1; k < N; k++) {
                    int temp = cards[i] + cards[j] + cards[k];
                    if (M == temp) {
                        System.out.print(temp);
                        return;
                    }
                    if(result < temp && temp < M) result = temp;
                }
            }
        }
        System.out.print(result);
    }
}
