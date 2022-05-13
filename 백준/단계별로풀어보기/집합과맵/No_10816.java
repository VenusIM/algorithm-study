package Algorithms.백준.단계별로풀어보기.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class No_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //상근이가 가지고 있는 카드 정보
        int N = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        Map<String, Integer> counter = new HashMap<>();
        for(int i = 0; i < N; i++) {
            String value = stringTokenizer.nextToken();
            if(counter.containsKey(value)) counter.put(value, counter.get(value)+1);
            else counter.put(value,1);
        }

        int M = Integer.parseInt(bufferedReader.readLine());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder =  new StringBuilder();
        for(int i = 0; i < M; i++) {
            Integer value = counter.get(stringTokenizer.nextToken());
            if(value == null) stringBuilder.append(0);
            else stringBuilder.append(value);
            stringBuilder.append(' ');
        }

        System.out.print(stringBuilder);

    }
}
