package Algorithms.백준.단계별로풀어보기.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_10815 {
    static int M;
    static int[] cards;

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        //상근이가 보유하고 있는 카드
        int N = Integer.parseInt(bufferedReader.readLine());
        cards = new int[N];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0; i < N; i++) cards[i] = Integer.parseInt(stringTokenizer.nextToken());
        Arrays.sort(cards);

        //비교대상 카드
        M = Integer.parseInt(bufferedReader.readLine());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0; i < M; i++) {
            stringBuilder
                    .append(binarySearch(0,N-1, Integer.parseInt(stringTokenizer.nextToken())))
                    .append(' ');
        }
        System.out.print(stringBuilder);
    }

    static int binarySearch(int first, int last, int value) {


        int mid = (first+last) / 2;

        //마지막 인덱스 보다 첫번째 인덱스가 클 경우 탐색 종료
        if(last < first) return 0;

        //카드값과 결과 값이 동일 할 경우
        if(cards[mid] == value) return 1;

        if(value < cards[mid]) return binarySearch(first, mid-1, value);
        else return binarySearch(mid+1, last, value);

    }
}
